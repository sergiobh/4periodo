/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.una.ads.tarefa.servico;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author edgard.cardoso
 */
@Path("")
public class ServicoTarefa {
    
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String teste(){
        return "se voce leu isso entao a aplicacao esta no ar!";
    }
    
    //Implemente os outros métodos do exercício a partir daqui!!
    
}
