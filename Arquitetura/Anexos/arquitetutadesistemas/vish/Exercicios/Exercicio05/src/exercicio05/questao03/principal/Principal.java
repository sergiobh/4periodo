/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio05.questao03.principal;

import exercicio05.questao03.controle.ControleUsuario;
import exercicio05.questao03.modelo.Usuario;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author edgardcardoso
 */
public class Principal {
    
    public static void main (String []args){
        try {
            ControleUsuario controle = new ControleUsuario();
            Usuario usuario = new Usuario();
            
            usuario.setId(1);
            usuario.setLogin("edgard");
            usuario.setSenha("123");
            
            if (controle.inserirUsuario(usuario)){
                System.out.println("Usuario inserido com sucesso");
            }
        } catch (Exception ex) {
            System.out.println("Deu erro " + ex.getMessage());
        }
        
    }
    
}
