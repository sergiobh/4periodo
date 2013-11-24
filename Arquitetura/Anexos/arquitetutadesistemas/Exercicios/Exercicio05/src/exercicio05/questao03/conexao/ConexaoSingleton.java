/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio05.questao03.conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author edgardcardoso
 */
public class ConexaoSingleton {
    
    private static ConexaoSingleton instancia;
    
    private Connection connection= null; 
    
    
    private ConexaoSingleton() throws ClassNotFoundException, SQLException {
        Class.forName("org.sqlite.JDBC");
        connection = DriverManager.getConnection("jdbc:sqlite:data/banco.db");
        
        
    }
    
    public static ConexaoSingleton getConexao() throws Exception{
        if (instancia == null){
            instancia = new ConexaoSingleton();
        }
        return instancia;
    }
    
    public Connection getConnection()throws SQLException, ClassNotFoundException{
        
        return connection;
    }
    
}
