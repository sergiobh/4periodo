/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio08;

/**
 *
 * @author edgard.cardoso
 */
public class SMS implements Observados {

    @Override
    public void atualizar(String msg) {
       System.out.println("SMS "+msg);
    }
}
