/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package strategy;

import exercicio08_observer.singleton.ConsoleSingleton;

/**
 *
 * @author edgardcardoso
 */
public class XML implements IFormatadorDeNoticia {

    @Override
    public void formatarNoticia(String noticia) {
      String formato;

        formato = "<noticia>";
        formato += noticia;
        formato += "</noticia>";
        
        ConsoleSingleton.getConsoleSingleton().log(formato);  
    }
    
}
