/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Questao02;


public class Principal {

    public static void main(String[] args) {
        
        FileLogger.getInstance().log("Teste de Singleton");
        
        try {
            
            int a = 0/0;
            
        } catch (Exception e) {
            FileLogger.getInstance().log("Deu erro: "+e.getMessage());
        }
        
        
        
    }
    
}
