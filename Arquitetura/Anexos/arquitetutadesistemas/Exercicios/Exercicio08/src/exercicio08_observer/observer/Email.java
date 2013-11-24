/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio08_observer.observer;

/**
 *
 * @author edgardcardoso
 */
public class Email implements Observados{

    @Override
    public void atualizar(Observador observador) {
       System.out.println("Notificado via email: " + observador.getNoticia());
    }
    
}
