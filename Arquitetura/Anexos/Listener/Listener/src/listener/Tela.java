/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package listener;

/**
 *
 * @author edgard.cardoso
 */
public class Tela implements OnFinishWork{

    public static void main(String[] args) {
        Tela tela = new Tela();
        tela.show();

    }

    private void show() {
        MinhaThread minhaThread = new MinhaThread();
        minhaThread.setOnFinishWork(this);
        minhaThread.start();
        
    }

    @Override
    public void onFinish(String msg) {
           System.out.println(msg);
    }
}
