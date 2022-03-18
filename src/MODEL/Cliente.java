package MODEL;

import DAL.ModuloConexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class Cliente {
    public Connection c_cliente = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    
    private String codigo;
    private String nome;
    private String rg;
    private String cpf;
    private String telefone;
    private String logradouro;
    private String numero;
    private String complemento;
    private String bairro;
    private String cep;
    private String cidade;
    private String uf;
    
    public void setCodigo(String cod){this.codigo = cod;}
    public void setNome(String nome){this.nome = nome;}
    public void setRg(String rg){this.rg = rg;}
    public void setCpf(String cpf){this.cpf = cpf;}
    public void setTelefone(String tel){this.telefone = tel;}
    public void setLogradouro(String lograd){this.logradouro = lograd;}
    public void setNumero(String numero){this.numero = numero;}
    public void setComplemento(String compl){this.complemento = compl;}
    public void setBairro(String bairr){this.bairro = bairr;}
    public void setCep(String cep){this.cep = cep;}
    public void setCidade(String cidade){this.cidade = cidade;}
    public void setUf(String uf){this.uf = uf;}
    
    public String getCodigo(){return this.codigo;}
    public String getNome(){return this.nome;}
    public String getRg(){return this.rg;}
    public String getCpf(){return this.cpf;}
    public String getTelefone(){return this.telefone;}
    public String getLogradouro(){return this.logradouro;}
    public String getNumero(){return this.numero;}
    public String getComplemento(){return this.complemento;}
    public String getBairro(){return this.bairro;}
    public String getCep(){return this.cep;}
    public String getCidade(){return this.cidade;}
    public String getUf(){return this.uf;}
    
    public String buscacod(){
        String sql = "select case when max(cod) is null then 1 else max(cod)+1 end as cod from e2_clientes"; 
        String cod = null;
        try{
            c_cliente = new ModuloConexao().conector();
            if(c_cliente != null){         
                pst = c_cliente.prepareStatement(sql);
                rs = pst.executeQuery();
                if(rs.next()){
                    cod = rs.getString(1);
                }
                c_cliente.close();
            }else{
                System.out.println("Erro na busca do codigo de cliente.");
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Erro ao buscar código: "+e);
        }
        return cod;
    }
    public void cadastrar(String cod, String nome, String rg, String cpf, String tel, String bairro, String cep, String logra, String cidade, String uf, String comple, String nr) {
        String sql = "INSERT INTO e2_clientes(COD,NOME,RG,CPF,TEL,BAIRRO,CEP,LOGRADOURO,CIDADE,UF,COMPLEMENTO,NR) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            c_cliente = new ModuloConexao().conector();
            try{
                if(c_cliente!=null){
                pst = c_cliente.prepareStatement(sql);
                pst.setString(1, cod);
                pst.setString(2, nome);
                pst.setString(3, rg.replace(".", ""));
                pst.setString(4, cpf.replace(".", "").replace("-", ""));
                pst.setString(5, tel);
                pst.setString(6, bairro);
                pst.setString(7, cep.replace(".", "").replace("-", ""));
                pst.setString(8, logra);
                pst.setString(9, cidade);
                pst.setString(10, uf);
                pst.setString(11, comple);
                pst.setString(12, nr);
                int resultado = pst.executeUpdate();
                c_cliente.close();
                if(resultado == 1){
                    buscacod();
                    JOptionPane.showMessageDialog(null, "Cadastro efetuado.");
                }else{
                    JOptionPane.showMessageDialog(null, "Erro ao cadastrar usuário.");            
                }
                }else{
                    JOptionPane.showMessageDialog(null, "Usuário sem conexão.");
                }

            }catch(SQLException e){
                JOptionPane.showMessageDialog(null, "Erro encontrado.\nVerifique se todos os campos obrigatórios estão preenchidos.");
            }
    }
    public void consultarCod(String codigo){
        String sql = "select * from e2_clientes where cod = ?";
        
        c_cliente = new ModuloConexao().conector();
        
        if(c_cliente!=null){
            try{

                pst = c_cliente.prepareStatement(sql);
                pst.setString(1, codigo);
                rs =  pst.executeQuery();

                if(rs.next()){
                    this.codigo         = rs.getString("cod");
                    this.nome           = rs.getString("nome");
                    this.rg             = rs.getString("rg");
                    this.cpf            = rs.getString("cpf");
                    this.telefone       = rs.getString("tel");
                    this.logradouro     = rs.getString("logradouro");
                    this.numero         = rs.getString("nr");
                    this.complemento    = rs.getString("complemento");
                    this.bairro         = rs.getString("bairro");
                    this.cep            = rs.getString("cep");
                    this.cidade         = rs.getString("cidade");
                    this.uf             = rs.getString("uf");
                }

            }catch(SQLException e){
                JOptionPane.showMessageDialog(null, "Não foi possível efetuar consulta.");
            }
        }else{
            JOptionPane.showMessageDialog(null, "Usuário sem conexão2.");
        }
    }
    public ResultSet pesquisarCliente(String nome) {
        String sql = "select cod AS CODIGO, nome AS NOME, "
                + "concat(substr(rg,1,2),\".\",substr(rg,3,3),\".\",substr(rg,6,3)) AS RG, "
                + "concat(substr(cpf,1,3),\".\",substr(cpf,4,3),\".\",substr(cpf,7,3),\"-\",substr(cpf,10,2)) AS CPF "
                + "from e2_clientes where nome like ? order by nome";
        c_cliente = new ModuloConexao().conector();
        try{
            pst = c_cliente.prepareStatement(sql);
            pst.setString(1, nome+"%");
            rs =  pst.executeQuery();

        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Não foi possível carregar tabela de clientes.");
        }
        return rs;
    }
    public void editar(String cod, String nome, String rg, String cpf, String tel, String bairro, String cep, String logra, String cidade, String uf, String comple, String nr) {
        String sql = "UPDATE e2_clientes SET "
                                        + "  NOME   = ?,"
                                        + "  RG     = ?,"
                                        + "  CPF    = ?,"
                                        + "  TEL    = ?,"
                                        + "  BAIRRO = ?,"
                                        + "  CEP    = ?,"
                                        + "  LOGRADOURO = ?,"
                                        + "  CIDADE = ?,"
                                        + "  UF = ?,"
                                        + "  COMPLEMENTO = ?,"
                                        + "  NR = ?"
                + "WHERE COD = ?";
        c_cliente = new ModuloConexao().conector();
        try{

            if(c_cliente!=null){
            pst = c_cliente.prepareStatement(sql);
            pst.setString(1, nome);
            pst.setString(2, rg.replace(".", ""));
            pst.setString(3, cpf.replace(".", "").replace("-", ""));
            pst.setString(4, tel);
            pst.setString(5, bairro);
            pst.setString(6, cep.replace(".", "").replace("-", ""));
            pst.setString(7, logra);
            pst.setString(8, cidade);
            pst.setString(9, uf);
            pst.setString(10, comple);
            pst.setString(11, nr);
            pst.setString(12, cod);
            int resultado = pst.executeUpdate();
            c_cliente.close();
                if(resultado == 1){
                    buscacod();
                    JOptionPane.showMessageDialog(null, "Registro Atualizado.");
                }else{
                    JOptionPane.showMessageDialog(null, "Erro ao atualizar usuário.");            
                }
            }else{
                JOptionPane.showMessageDialog(null, "Usuário sem conexão.");
            }
            
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Erro: "+e);
        }
    }
    public void excluir(String cod) {
        String sql = "DELETE FROM e2_clientes where COD = ?";
        int opcao = JOptionPane.showConfirmDialog(null,"Deseja realmente eliminar o registro?","Atenção!",JOptionPane.YES_NO_OPTION);
        if (opcao==JOptionPane.YES_OPTION){
            c_cliente = new ModuloConexao().conector();
            try{
                if(c_cliente!=null){
                pst = c_cliente.prepareStatement(sql);
                pst.setString(1, cod);
                int resultado = pst.executeUpdate();
                c_cliente.close();
                    if(resultado == 1){
                        buscacod();
                        JOptionPane.showMessageDialog(null, "Registro Apagado.");
                    }else{
                        JOptionPane.showMessageDialog(null, "Erro ao apagar registro de usuário.");            
                    }
                }else{
                    JOptionPane.showMessageDialog(null, "Usuário sem conexão.");
                }
            }catch(SQLException e){
                JOptionPane.showMessageDialog(null, "Erro: "+e);
            }
        }
    }
    public ResultSet consultaVeiculo(String cod){
        String sql = "select cod, nome from e2_clientes where fk_e1_automovel_cod = ?";
        c_cliente = new ModuloConexao().conector();
        
        if(c_cliente!=null){
            try{
                pst = c_cliente.prepareStatement(sql);
                pst.setString(1, cod);
                rs =  pst.executeQuery();

            }catch(SQLException e){
                JOptionPane.showMessageDialog(null, "Não foi possível efetuar consulta de proprietario.");
            }
        }else{
            JOptionPane.showMessageDialog(null, "Usuário sem conexão.");
        }
        return rs;
    }

}
