package DAL;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ModuloConexao {
    public static String user;
    public static String pass;
    static Connection conexao = null;
    static String driver = "com.mysql.cj.jdbc.Driver";
    static String url = "jdbc:mysql://localhost:3306/segnoturno";
    
    public Connection conector(){
        try {
            Class.forName(driver);
            conexao = DriverManager.getConnection(url, user, pass);
            return conexao;
        } catch (Exception e) {
            return null;
        }
    }
    
    public String conectividade(){
        String saida = null;
            try {
                Class.forName(driver);
                conexao = DriverManager.getConnection(url);
                saida = "sucess";
            } catch (SQLException e) {
                saida = ""+e;
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(ModuloConexao.class.getName()).log(Level.SEVERE, null, ex);
            }
        return saida;
    }
    
    public String getUser(){
        return this.user;
    };
    public String getPass(){
        return this.pass;
    };    
    public void setUser(String u){
        this.user = u;
    };
    public void setPass(String p){
        this.pass = p;
    };
    
}
