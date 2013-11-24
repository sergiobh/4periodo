/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package questao3.relatorio;

/**
 *
 * @author edgard.cardoso
 */
public class RelatorioFactory {
    public IRelatorio getRelatorio(TipoRelatorio tipoRelatorio){
        switch (tipoRelatorio){
            case ANALITICO : 
                return new RelatorioAnalitico();
            case SINTETICO:
                return new RelatorioSintetico();
            default:
                return null;
                
        }
    }       
}
