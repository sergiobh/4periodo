/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio08_observer.factory;

import strategy.Html;
import strategy.IFormatadorDeNoticia;
import strategy.XML;

/**
 *
 * @author edgardcardoso
 */
public class FormatadorFactory {
    
    public static IFormatadorDeNoticia getFormatadorDeNoticia(TipoFormatador tf){
        switch(tf){
            case HTML:
                return new Html();
            case XML:
                return new XML();
        }
        return null;
    }
}
