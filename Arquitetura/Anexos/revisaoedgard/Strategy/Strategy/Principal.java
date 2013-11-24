/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Strategy;

/**
 *
 * @author enrique
 */
public class Principal {
    
    
    public static void main(String[] args) {
        
        Facade facade = new Facade();
        facade.publicarNoticia("teste", "rss");
        
    }
    
}
