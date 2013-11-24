
package TAD;

import java.util.Vector;

/**
 *
 * @author Jorge
 */
public class Fila {
	
	private Vector  vetor = new Vector();
	
    @SuppressWarnings("unchecked")
  
    public void enfileirar(Object element) {
        vetor.add(element);
    }

    public Object desenfileirar() {
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
