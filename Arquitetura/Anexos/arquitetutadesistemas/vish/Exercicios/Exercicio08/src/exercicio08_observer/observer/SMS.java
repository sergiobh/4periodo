/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio08_observer.observer;

/**
 *
 * @author edgardcardoso
 */
public class SMS implements Observados{

    @Override
    public void atualizar(Observador observador) {
        System.out.println("Notificado via SMS: " + observador.getNoticia());
    }
    
}
