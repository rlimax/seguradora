package MODEL;

import DAL.ModuloConexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Ocorrencia {
    private String codigo;
    private String data;
    private String local;
    private String descricao;
    private String codEnvolvido;
    private String placaEnvolvido;
    private String modeloEnvolvido;
    
    public Connection c_ocorrencia = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
   
    public void setCodigo(String cod){this.codigo = cod;}
    public void setData(String data){this.data = data;}
    public void setLocal(String local){this.local = local;}
    public void setDescricao(String desc){this.descricao = desc;}
   
    public String getCodigo(){return this.codigo;}
    public String getData(){return this.data;}
    public String getLocal(){return this.local;}
    public String getDescricao(){return this.descricao;}
    public String getCodEnv(){return this.codEnvolvido;}
    public String getPlacaEnv(){return this.placaEnvolvido;}
    public String getModeloEnv(){return this.modeloEnvolvido;}
    
    public String buscaCod(){
        c_ocorrencia = new ModuloConexao().conector();
        String sql = "select case when max(cod) is null then 1 else max(cod)+1 end as cod from e4_ocorrencias";
        String retorno = null;
        
        try {
            pst = c_ocorrencia.prepareStatement(sql);
            rs = pst.executeQuery();
            while(rs.next()){
                retorno = rs.getString(1);
            }
            c_ocorrencia.close();
        } catch (SQLException ex) {
            Logger.getLogger(Ocorrencia.class.getName()).log(Level.SEVERE, null, ex);
        }
        return retorno;
        
    }
    public void cadastrar(String cod, String data, String local, String desc, String veiculo){
       c_ocorrencia = new ModuloConexao().conector();
       String sql = "INSERT INTO e4_ocorrencias values (?,STR_TO_DATE(?,'%d/%m/%Y'),?,?)";
       String sql2 = "UPDATE e1_automovel SET fk_e4_ocorrencias_id = ? WHERE cod = ?";
       //id data local descricao
       try{
           pst = c_ocorrencia.prepareStatement(sql);
           pst.setString(1, cod);
           pst.setString(2, data);
           pst.setString(3, local);
           pst.setString(4, desc);
           pst.executeUpdate();
           
           pst = c_ocorrencia.prepareStatement(sql2);
           pst.setString(1, cod);
           pst.setString(2, veiculo);
           pst.executeUpdate();
           
           c_ocorrencia.close();
           JOptionPane.showMessageDialog(null, "Ocorrência cadastrada com sucesso.");
       }catch(SQLException e){
           JOptionPane.showMessageDialog(null, "Erro na inserção do registro. \n"+e);
       }
    }
    public void consultar(String cod){
        c_ocorrencia = new ModuloConexao().conector();
        String sql = "select cod, local, DATE_FORMAT(data,'%d/%m/%Y') as data, descricao from e4_ocorrencias where cod = ?";
        try{
            pst = c_ocorrencia.prepareStatement(sql);
            pst.setString(1, cod);
            rs = pst.executeQuery();
            while(rs.next()){
                setCodigo(rs.getString("cod"));
                setLocal(rs.getString("local"));
                setData(rs.getString("data"));
                setDescricao(rs.getString("descricao"));
            }
            Veiculo veiculo = new Veiculo();
            veiculo.consultarCodAuto(2,cod);
            codEnvolvido = veiculo.getCod();
            placaEnvolvido = veiculo.getPlaca();
            modeloEnvolvido = veiculo.getModelo();
            c_ocorrencia.close();
        }catch(SQLException e){
            System.out.println(e);
        }
    }
    public void editar(String cod, String data, String local, String desc, String veiculo){
       c_ocorrencia = new ModuloConexao().conector();
       String sql = "UPDATE e4_ocorrencias SET data = STR_TO_DATE(?,'%d/%m/%Y'), local = ?, descricao = ? where cod = ?";
       String sql2 = "UPDATE e1_automovel SET fk_e4_ocorrencias_id = null WHERE fk_e4_ocorrencias_id = ?";
       String sql3 = "UPDATE e1_automovel SET fk_e4_ocorrencias_id = ? WHERE cod = ?";
       //id data local descricao
       try{
            pst = c_ocorrencia.prepareStatement(sql);
            pst.setString(1, data);
            pst.setString(2, local);
            pst.setString(3, desc);
            pst.setString(4, cod);
            pst.executeUpdate();
            
            pst = c_ocorrencia.prepareStatement(sql2);
            pst.setString(1, cod);
            pst.executeUpdate();
            
            pst = c_ocorrencia.prepareStatement(sql3);            
            pst.setString(1, cod);
            pst.setString(2, veiculo);
            pst.executeUpdate();

            c_ocorrencia.close();
            JOptionPane.showMessageDialog(null, "Ocorrência atualizada com sucesso.");
       }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Erro na atualização do registro. \n"+e);
       }
    }  
    public void excluir(String cod){
        c_ocorrencia = new ModuloConexao().conector();
        String sql = "DELETE from e4_ocorrencias where cod = ?";
        try{
            pst = c_ocorrencia.prepareStatement(sql);
            pst.setString(1, cod);
            pst.executeUpdate();
            c_ocorrencia.close();
            JOptionPane.showMessageDialog(null, "Ocorrência excluída com sucesso.");
        }catch(SQLException e){
           JOptionPane.showMessageDialog(null, "Erro na exclusão do registro. \n"+e);
        }
    }
    public ResultSet pesquisarOco(){
        String sql = "SELECT cod as CODIGO, DATE_FORMAT(data,'%d/%m/%Y') as DATA, local as LOCAL from e4_ocorrencias order by data";
        c_ocorrencia = new ModuloConexao().conector();
        try{
            pst = c_ocorrencia.prepareStatement(sql);
            rs = pst.executeQuery();
        }catch(SQLException e){
        
        }
            return rs;
    }
}
