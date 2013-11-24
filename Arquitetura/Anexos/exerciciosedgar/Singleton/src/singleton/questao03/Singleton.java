/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package singleton.questao03;

import java.sql.Connection;



/**
 *
 * @author edgard.cardoso
 */
public class Singleton {

    private static Singleton instance;
    private Connection connection;
    
    
    public Connection getConnection(){
    
   
 
	
  }
        
        
        
        return connection;
        
    }
    
    
    private Singleton (){
    
    
    }
    
    public static Singleton getInstance(){
    
        if(instance == null){
        
            instance = new Singleton();
        
        }
        
        return instance;
        
        
    }
}
