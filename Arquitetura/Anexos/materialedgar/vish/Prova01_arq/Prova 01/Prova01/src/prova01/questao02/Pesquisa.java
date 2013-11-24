/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package prova01.questao02;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author edgard.cardoso
 */
public class Pesquisa extends LinkedList<String> {
    
    public void adicionarItem(String nome){
       this.add(nome);
    }
    
    public String pesquisar(String nome){
        if (this.contains(nome)){
            int index = this.indexOf(nome);
            return this.get(index);
        }
        return "";
    }
    
    public boolean removerItem(String nome){
        return this.remove(nome);
    }
    
    public int tamanho(){
        return this.size();
    }
    
}
