/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package listener;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author edgard.cardoso
 */
public class MinhaThread extends  Thread{
    
    private OnFinishWork onFinishWork;
    
    public void setOnFinishWork(OnFinishWork onFinishWork){
        this.onFinishWork = onFinishWork;
    }

    @Override
    public void run() {
        super.run(); 
        int contador = 1;
        while(true){
            try {               
                sleep(3000);
                if (onFinishWork != null){
                    onFinishWork.onFinish("Menagem " + contador);
                }
                
                contador ++;
                
            } catch (InterruptedException ex) {
                Logger.getLogger(MinhaThread.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    
    
}
