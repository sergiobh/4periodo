/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package TAD;

import java.util.Vector;

/**
 *
 * @author Jorge
 */
public class Pilha {
	
	private Vector  vetor = new Vector();
    
    @SuppressWarnings("unchecked")
    public void empilhar(Object element) {
        vetor.insertElementAt(element, 0);
    }

    public Object desempilhar() {
        if (!eVazia()) {
            Object result = vetor.firstElement();
            vetor.removeElementAt(0);
            
            return result;
        } else {
            return null;
        }
    }
        
    public int obterTamanho() {
        return vetor.size();
    }
    
    public boolean eVazia() {
        return  vetor.isEmpty();
    }
}
