/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio05.questao03.dao;

import exercicio05.questao03.conexao.ConexaoSingleton;
import exercicio05.questao03.modelo.Usuario;
import java.sql.Connection;
import java.sql.Statement;

/**
 *
 * @author edgardcardoso
 */
public class UsuarioDao {
    
    public boolean incluir(Usuario usuario) throws Exception{
        
        ConexaoSingleton conexaoSingleton = ConexaoSingleton.getConexao();
        Connection connection = conexaoSingleton.getConnection();
        Statement statement = connection.createStatement();
        
        String sql = "insert into usuario values(" + usuario.getId() + 
                ", '" + usuario.getLogin() + "', '" + usuario.getSenha() + "');";
        
        statement.execute(sql);
        
       return true;
    }
    
}
