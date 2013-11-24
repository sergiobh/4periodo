/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio05.questao01;

/**
 *
 * @author leandro
 */
public class Singleton {
    
    Singleton instancia;
    
    
    private Singleton(){
        
    }
    
    public Singleton getInstancia(){
        if(instancia == null){
            instancia = new Singleton();
        }
        
            return instancia;
        }
        
        
    }
    

