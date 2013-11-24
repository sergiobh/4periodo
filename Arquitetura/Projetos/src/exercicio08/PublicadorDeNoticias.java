/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio08;

import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author edgard.cardoso
 */
public class PublicadorDeNoticias implements Observador {

    private  List<Observados> listaDeObservados;
    private String ultimaNoticia;
    

    public PublicadorDeNoticias() {
        
        listaDeObservados = new LinkedList<>();
        
    }
    
    
    @Override
    public void notificarObservados() {
        
        for (Observados observados : listaDeObservados) {
            
            observados.atualizar(ultimaNoticia);
            
        }
    }

    @Override
    public void registrar(Observados obs) {

        listaDeObservados.add(obs);
        
    }

    @Override
    public void desregistrar(Observados obs) {
        
        listaDeObservados.remove(obs);
    }

    public void monitorDeNoticias(){
        
        int contador=0;
        
        
        while(true){
            try {
                ultimaNoticia = "Noticia nº: "+contador;
                
                this.notificarObservados();
                
                contador ++;
                Thread.sleep(3000);
            }
            catch (InterruptedException ex) {
                Logger.getLogger(PublicadorDeNoticias.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
