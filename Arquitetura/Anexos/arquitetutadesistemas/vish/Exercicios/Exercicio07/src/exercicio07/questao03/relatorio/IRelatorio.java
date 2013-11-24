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
public interface IRelatorio {
 
    
    public String getRelatorio(List<Item> itens);
}
