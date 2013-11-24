/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio05.questao03.controle;

import exercicio05.questao03.dao.UsuarioDao;
import exercicio05.questao03.modelo.Usuario;

/**
 *
 * @author edgardcardoso
 */
public class ControleUsuario {
    
    private UsuarioDao dao;

    public ControleUsuario() {
        dao = new UsuarioDao();
    }
            
    
    
    public boolean inserirUsuario(Usuario usuario) throws Exception{
        return dao.incluir(usuario);
        
    }
    
}
