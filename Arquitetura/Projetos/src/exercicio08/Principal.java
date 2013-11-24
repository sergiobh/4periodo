/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio08;

/**
 *
 * @author edgard.cardoso
 */
public class Principal {
    
    public static void main(String[] args) {
        
        PublicadorDeNoticias publicador = new PublicadorDeNoticias();
        
        publicador.registrar(new Email());
        publicador.registrar(new SMS());
        
        publicador.monitorDeNoticias();   
    }
}
