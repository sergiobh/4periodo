/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Strategy;

public class Html implements INoticia {

    @Override
    public void formatar(String msg) {
        System.out.println("HTML: " + msg);
    }
    
}
