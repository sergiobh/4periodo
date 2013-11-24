/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio07.questao03.relatorio;

/**
 *
 * @author edgardcardoso
 */
public class RelatorioFactory {
    
    public static IRelatorio getRelatorio(TipoRelatorio tipo){
        switch(tipo){
            case ANALITICO:
                return new Analitico();
            case SINTETICO:
                return new Sintetico();
            default: 
                return null;
        }
    }
    
}
