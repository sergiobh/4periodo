/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio07.questao3.relatorio;

import java.util.List;

import exercicio07.questao3.modelo.Item;

/**
 *
 * @author edgard.cardoso
 */
public interface IRelatorio {
    public String getRelatorio(List <Item> itens);
}
