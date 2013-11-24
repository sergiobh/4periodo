/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package singleton.questao02;



/**
 *
 * @author edgard.cardoso
 */
public class FileLogger {
    
       private static FileLogger instance;
    
    
    private FileLogger (){
    
    
    }
    
    public static FileLogger getInstance(){
    
        if(instance == null){
        
            instance = new FileLogger();
        
        }
        
        return instance;
        
        
    }
    
    public void log(String msg){
        
        FileUtil fileutil = new FileUtil();
        
        fileutil.writeToFile("log.txt", msg, true, true);
        
    }
    
    
}
