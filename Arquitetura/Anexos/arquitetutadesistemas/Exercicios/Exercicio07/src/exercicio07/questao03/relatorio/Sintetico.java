/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio07.questao03.relatorio;

import exercicio07.questao03.modelo.Item;
import java.util.List;

/**
 *
 * @author edgardcardoso
 */
public class Sintetico implements  IRelatorio{

    @Override
    public String getRelatorio(List<Item> itens) {
        StringBuilder builder = new StringBuilder();
        for (Item item : itens) {
            builder.append("\nnome: " + item.getProduto().getNome());
            builder.append("\nquatidade: " + item.getQuantidade());
            builder.append("\nData: " + item.getData());
            builder.append("\n");
        }
        return builder.toString();
        
        
    }
    
}
