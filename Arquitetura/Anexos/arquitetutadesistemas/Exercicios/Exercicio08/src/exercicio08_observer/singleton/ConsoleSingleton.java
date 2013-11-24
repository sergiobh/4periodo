/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio08_observer.singleton;

/**
 *
 * @author edgardcardoso
 */
public class ConsoleSingleton {

    private static ConsoleSingleton intancia;

    private ConsoleSingleton() {
    }

    public static ConsoleSingleton getConsoleSingleton() {
        if (intancia == null) {
            intancia = new ConsoleSingleton();
        }
        return intancia;
    }
    
    public void log(String msg){
        System.out.println("Log singleton: " + msg);
    }
}
