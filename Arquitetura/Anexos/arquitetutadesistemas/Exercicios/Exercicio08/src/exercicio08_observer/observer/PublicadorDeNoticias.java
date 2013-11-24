/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio08_observer.observer;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author edgardcardoso
 */
public class PublicadorDeNoticias implements Observador {

    private List<Observados> listaDeObservados;
    private String noticia;

    public PublicadorDeNoticias() {
        listaDeObservados = new LinkedList<Observados>();
    }

    @Override
    public void notificarObservados() {
        for (Observados observados : listaDeObservados) {
            observados.atualizar(this);
        }
    }

    @Override
    public void registrar(Observados observados) {
        listaDeObservados.add(observados);
    }

    @Override
    public void desregistrar(Observados observados) {
        listaDeObservados.remove(observados);
    }

    @Override
    public String getNoticia() {
        return noticia;
    }

    public void setNoticia(String noticia) {
        this.noticia = noticia;
        notificarObservados();
    }
}
