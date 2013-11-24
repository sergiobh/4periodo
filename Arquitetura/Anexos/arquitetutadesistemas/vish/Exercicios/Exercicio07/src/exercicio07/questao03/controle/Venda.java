/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio07.questao03.controle;

import exercicio07.questao03.modelo.Item;
import exercicio07.questao03.modelo.Produto;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author edgardcardoso
 */
public class Venda {
    
    private List<Item> itensDeVenda;
    
    public Venda(){
       itensDeVenda = new LinkedList<Item>();
    }
    
    public void adicionaProduto(Produto produto, int quantidade){
        Item item = new Item();
        item.setProduto(produto);
        item.setQuantidade(quantidade);
        item.setData(new Date());
        itensDeVenda.add(item);
                
    }

    public List<Item> getItensDeVenda() {
        return itensDeVenda;
    }
    
    
    
}
