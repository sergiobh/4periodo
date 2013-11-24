/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio08_observer.observer;

/**
 *
 * @author edgardcardoso
 */
public interface Observador {
    public void notificarObservados();
    public void registrar(Observados observados);
    public void desregistrar(Observados observados);
    
    public String getNoticia();
    
}
