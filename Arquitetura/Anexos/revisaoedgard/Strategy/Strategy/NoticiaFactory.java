/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Strategy;

/**
 *
 * @author enrique
 */
public class NoticiaFactory {

    public INoticia criarNoticia(String tipo) {
        switch (tipo) {
            case "html":
                return new Html();
            case "texto":
                return new Texto();
            case "rss":
                return new Rss();
        }
        return null;
    }
}
