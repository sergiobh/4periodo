/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package singleton.questao01;

/**
 *
 * @author edgard.cardoso
 */
public class Singleton {

    private static Singleton instance;
    
    
    private Singleton (){
    
    
    }
    
    public static Singleton getInstance(){
    
        if(instance == null){
        
            instance = new Singleton();
        
        }
        
        return instance;
        
        
    }
}
