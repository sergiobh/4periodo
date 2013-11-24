/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio05.questao01;

/**
 *
 * @author leandro
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Singleton instancia = null;
        
        instancia = instancia.getInstancia();
        
        System.out.println(instancia);
        
        
    }
}
