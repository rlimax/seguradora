package MODEL;

import DAL.ModuloConexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Veiculo {
    public Connection c_veiculo = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    
    private String cod;
    private String placa;
    private String renavam;
    private String fabricante;
    private String modelo;
    private String cor;
    private String ano;
    private String codProp;
    private String proprietario;
    
    public void setCod(String cod){this.cod = cod;}
    public void setPlaca(String placa){this.placa = placa;}
    public void setRenavam(String renavam){this.renavam = renavam;}
    public void setFabricante(String fabricante){this.fabricante = fabricante;}
    public void setModelo(String modelo){this.modelo = modelo;}
    public void setCor(String cor){this.cor = cor;}
    public void setAno(String ano){this.ano = ano;}
    public void setCodProp(String codProp){this.codProp = codProp;}
    public void setProprietario(String prop){this.proprietario = prop;}
    
    public String getCod(){return this.cod;}
    public String getPlaca(){return this.placa;}
    public String getRenavam(){return this.renavam;}
    public String getFabricante(){return this.fabricante;}
    public String getModelo(){return this.modelo;}
    public String getCor(){return this.cor;}
    public String getAno(){return this.ano;}
    public String getCodProp(){return this.codProp;}
    public String getProprietario(){return this.proprietario;}
    
    
    public void cadastrarVeiculo(String cod, String placa, String renavam, String fabricante, String modelo, String ano, String cor, String prop){
        String sql = "INSERT INTO e1_automovel(COD, PLACA, RENAVAM, FABRICANTE, MODELO, ANO, COR) VALUES (?,?,?,?,?,?,?)";
        String sql2 = "UPDATE e2_clientes SET fk_e1_automovel_cod = ? where cod = ?";
        c_veiculo = new ModuloConexao().conector();
        
        if(c_veiculo != null){
            try{
                pst = c_veiculo.prepareStatement(sql);
                pst.setString(1, cod);
                pst.setString(2, placa);
                pst.setString(3, renavam);
                pst.setString(4, fabricante);
                pst.setString(5, modelo);
                pst.setString(6, ano);
                pst.setString(7, cor);
                int resultado = pst.executeUpdate();
                pst = c_veiculo.prepareStatement(sql2);
                pst.setString(1, cod);
                pst.setString(2, prop);
                int resultado2 = pst.executeUpdate();

                if(resultado==1 && resultado2==1){
                    JOptionPane.showMessageDialog(null, "Cadastrado com sucesso.");
                }else if(resultado==1 && resultado2!=1){
                    JOptionPane.showMessageDialog(null, "Veículo cadastrado sem proprietário vinculado.");
                }else{
                    JOptionPane.showMessageDialog(null, "Erro ao cadastrar veiculo.");
                }
                c_veiculo.close();
            }catch(SQLException e){
                System.out.println("Erro: "+e);
            }
        }
        

    }
    public String buscaCodVeiculo(){
        String sql = "SELECT CASE WHEN MAX(cod) is null then 1 else MAX(cod)+1 end as cod from e1_automovel";
        cod = null;
        c_veiculo = new ModuloConexao().conector();
        if(c_veiculo != null){
            try{
                pst = c_veiculo.prepareStatement(sql);
                rs = pst.executeQuery();
                if(rs.next()){
                    cod = rs.getString(1);
                }
                c_veiculo.close();
            }catch(SQLException e){
                System.out.println("Erro: "+e);
            }
        }
        return cod;
    }
    public ResultSet pesquisarAuto(int campo, String valor){

        c_veiculo = new ModuloConexao().conector();
        String sql;
        try{
            switch (campo){
                    case 1:
                        sql = "SELECT cod as CODIGO, placa as PLACA, modelo as MODELO, ano as ANO, cor as COR from e1_automovel where placa like ? order by modelo";
                        pst = c_veiculo.prepareStatement(sql);
                        break;
                    case 2:
                        sql = "SELECT cod as CODIGO, placa as PLACA, modelo as MODELO, ano as ANO, cor as COR from e1_automovel where modelo like ? order by modelo";
                        pst = c_veiculo.prepareStatement(sql);
                        break;
            }
            pst.setString(1, valor+"%");
            rs = pst.executeQuery();
            
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Não foi possível carregar tabela de automóveis.");
        }
        return rs;
    }
    public void consultarCodAuto(int opt, String cod){
        String sql = null;
        if(opt==1){
            sql = "select * from e1_automovel where cod = ?";
        }else{
            sql = "select * from e1_automovel where fk_e4_ocorrencias_id = ?";
        }
        this.codProp = null;
        this.proprietario = null;
        c_veiculo = new ModuloConexao().conector();
        if(c_veiculo!=null){
            try{
                pst = c_veiculo.prepareStatement(sql);
                pst.setString(1, cod);
                rs =  pst.executeQuery();
                if(rs.next()){                    
                    this.cod            = rs.getString("cod");
                    this.placa          = rs.getString("placa");
                    this.renavam        = rs.getString("renavam");
                    this.fabricante     = rs.getString("fabricante");
                    this.modelo         = rs.getString("modelo");
                    this.cor            = rs.getString("cor");
                    this.ano            = rs.getString("ano");
                }
                Cliente cliente = new Cliente();
                ResultSet rs = cliente.consultaVeiculo(cod);
                
                if(rs.next()){
                    this.codProp         = rs.getString("cod");
                    this.proprietario    = rs.getString("nome");
                }

            }catch(SQLException e){
                JOptionPane.showMessageDialog(null, "Não foi possível efetuar consulta.");
            }
        }else{
            JOptionPane.showMessageDialog(null, "Usuário sem conexão.");
        }
    }
    public void editarVeiculo(String cod, String placa, String renavam, String fabricante, String modelo, String ano, String cor, String prop){
        String sql = "UPDATE e1_automovel SET "
                                + "  PLACA   = ?,"
                                + "  RENAVAM     = ?,"
                                + "  FABRICANTE    = ?,"
                                + "  MODELO    = ?,"
                                + "  COR = ?,"
                                + "  ANO    = ? "
        + "WHERE COD = ?";
        String sql2 = "UPDATE e2_clientes SET fk_e1_automovel_cod = null where  fk_e1_automovel_cod = ?";
        String sql3 = "UPDATE e2_clientes SET fk_e1_automovel_cod = ? where cod = ?";
        try{
            c_veiculo = new ModuloConexao().conector();
            //Atualiza dados veículo
            pst = c_veiculo.prepareStatement(sql);
            pst.setString(1, placa);
            pst.setString(2, renavam);
            pst.setString(3, fabricante);
            pst.setString(4, modelo);
            pst.setString(5, cor);
            pst.setString(6, ano);
            pst.setString(7, cod);
            int resultado = pst.executeUpdate();
            //Limpa antigo dono do veículo se houver
            pst = c_veiculo.prepareStatement(sql2);
            pst.setString(1, cod);
            int resultado2 = pst.executeUpdate();
            //Atualiza veículo para novo proprietário
            pst = c_veiculo.prepareStatement(sql3);
            pst.setString(1, cod);
            pst.setString(2, prop);
            int resultado3 = pst.executeUpdate();
            c_veiculo.close();
            
            JOptionPane.showMessageDialog(null, "Registro atualizado com sucesso.");
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Não foi possível efetuar a atualização.\n"+e);
        }
    }
    public void excluirVeiculo(String cod){
        String sql = "DELETE FROM e1_automovel WHERE cod = ?";
        int opcao = JOptionPane.showConfirmDialog(null,"Deseja realmente eliminar o registro?","Atenção!",JOptionPane.YES_NO_OPTION);
        if (opcao==JOptionPane.YES_OPTION){
            try{
                c_veiculo = new ModuloConexao().conector();
                pst = c_veiculo.prepareStatement(sql);
                pst.setString(1, cod);
                pst.executeUpdate();
                c_veiculo.close();
            }catch(SQLException e){
                JOptionPane.showMessageDialog(null, "Ocorreu um erro na exclusão do registro.");
            }
        }
    }
    public ResultSet listarAuto(){
        String sql = "select cod, placa, modelo from e1_automovel order by placa";
        c_veiculo = new ModuloConexao().conector();
        if(c_veiculo!=null){
            try{
                pst = c_veiculo.prepareStatement(sql);
                rs =  pst.executeQuery();
                //Cliente cliente = new Cliente();
                //ResultSet rs = cliente.consultaVeiculo(cod);
                
                //if(rs.next()){
                //    this.codProp         = rs.getString("cod");
                //    this.proprietario    = rs.getString("nome");
                //}

            }catch(SQLException e){
                JOptionPane.showMessageDialog(null, "Não foi possível efetuar consulta.");
            }
        }else{
            JOptionPane.showMessageDialog(null, "Usuário sem conexão.");
        }
        return rs;
    }
}
