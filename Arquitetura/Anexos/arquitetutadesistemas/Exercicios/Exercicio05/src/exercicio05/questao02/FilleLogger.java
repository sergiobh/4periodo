
package exercicio05.questao02;


public class FilleLogger implements Logger {

    private static FilleLogger logger;
    
    private FilleLogger(){
        
    }
    
    private static FilleLogger getFilleLogger(){
        if (logger == null)
            logger = new FilleLogger();
        
        return logger;
       }
    
    @Override
    public synchronized void log(String msg){
        FileUtil futil = new FileUtil();
        futil.writeToFile("log.txt",msg, true, true);
     
    }
    
}
