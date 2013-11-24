/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Questao03.controle;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import Questao03.modelo.Item;
import Questao03.modelo.Produto;

public class Venda {
    List <Item> itensDeVenda;
    public Venda(){
        itensDeVenda = new LinkedList<>();
    }
    public void adicionaProduto(Produto produto, int qtde){
        Item item = new Item();
        
        item.setProduto(produto);
        item.setQuantidade(qtde);
        item.setData(new Date());
        
        itensDeVenda.add(item);
    
    }
    
    public List<Item> getItensDeVenda(){
        return itensDeVenda;
    } 
}
