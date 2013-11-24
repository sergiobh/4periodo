/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Strategy;

/**
 *
 * @author enrique
 */
public class Texto implements INoticia {

    @Override
    public void formatar(String msg) {
        System.out.println("Texto: " + msg);
    }
    
}
