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
public class Html implements IFormatadorDeNoticia {

    @Override
    public void formatarNoticia(String noticia) {
        String formato;

        formato = "<html>";
        formato += "<head>";
        formato += "</head>";
        formato +="<body>";
        formato += noticia;
        formato +="</body>";
        formato += "</html>";
        
        ConsoleSingleton.getConsoleSingleton().log(formato);
    }
}
