/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package TAD;


/**
 *
 * @author Jorge
 */

public class Principal {
    
    public static void main(String []args){
        
    }
    
    public void unicaResponsabiliade(){
        Pilha p = new  Pilha();
        p.empilhar(new Object());
        p.desempilhar();
        p.eVazia();
        p.obterTamanho();
        
        
        Fila f = new Fila();
        f.enfileirar(new Object());
        f.desenfileirar();
        f.eVazia();
        //f.insertElementAt(new Object(), 0);
        f.obterTamanho();
    }
    
    public void original(){
//        TAD tad = new TAD();
//        tad.eVazia();
//        tad.obterTamanho();
        
        
//        tad.empilhar(null);
//        tad.empilhar(null);
//        tad.desempilhar();
//        
//        tad.enfileirar(null);
    }
    
}
