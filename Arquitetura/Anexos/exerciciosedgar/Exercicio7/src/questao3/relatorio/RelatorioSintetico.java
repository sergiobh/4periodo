/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package questao3.relatorio;

import java.util.List;
import questao3.modelo.Item;

/**
 *
 * @author edgard.cardoso
 */
public class RelatorioSintetico implements IRelatorio{

    @Override
    public String getRelatorio(List<Item> itens) {
        StringBuilder sb = new StringBuilder();
        for (Item item : itens) {
            sb.append("nome = ").append(item.getProduto().getNome()).append("/n");
       }
        return sb.toString();
    }
    
}
