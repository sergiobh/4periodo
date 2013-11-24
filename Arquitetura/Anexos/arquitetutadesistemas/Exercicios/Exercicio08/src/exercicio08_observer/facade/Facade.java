/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio08_observer.facade;

import exercicio08_observer.factory.FormatadorFactory;
import exercicio08_observer.factory.TipoFormatador;
import exercicio08_observer.observer.Email;
import exercicio08_observer.observer.PublicadorDeNoticias;
import exercicio08_observer.observer.SMS;
import strategy.IFormatadorDeNoticia;

/**
 *
 * @author edgardcardoso
 */
public class Facade {

    private PublicadorDeNoticias pdn;

    public Facade() {
        pdn = new PublicadorDeNoticias();
        pdn.registrar(new Email());
        pdn.registrar(new SMS());

    }

    public void publicarNoticia(String entrada) {
        pdn.setNoticia(entrada);

        IFormatadorDeNoticia ifdn;
        ifdn = FormatadorFactory.getFormatadorDeNoticia(TipoFormatador.HTML);
        ifdn.formatarNoticia(entrada);
    }
}
