/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package singleton.questao01;

/**
 *
 * @author edgard.cardoso
 */
public class Principal {
    
    public static void main(String[] args) {
        
        Singleton singleton = Singleton.getInstance();
        
        
        Singleton s = Singleton.getInstance();
        
        System.out.println(singleton);
        System.out.println(s);
        System.out.println(Singleton.getInstance());
        System.out.println(Singleton.getInstance());
        System.out.println(Singleton.getInstance());
        System.out.println(Singleton.getInstance());
        
        
        
        
    }
    
}
