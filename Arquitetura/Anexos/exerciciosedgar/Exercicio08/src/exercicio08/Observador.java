/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio08;

/**
 *
 * @author edgard.cardoso
 */
public interface Observador {
    
    public  void notificarObservados();
    public  void registrar(Observados obs);
    public  void desregistrar(Observados obs);
    
    
}
