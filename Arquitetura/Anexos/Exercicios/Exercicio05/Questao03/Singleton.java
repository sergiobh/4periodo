/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Questao03;

import java.sql.Connection;


public class Singleton {

    private static Singleton instance;
    private Connection connection;
    
    
    public Connection getConnection(){  
        
        
        
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
