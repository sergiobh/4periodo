/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.una.ads.tarefa.servico;

import com.google.gson.Gson;
import com.una.ads.tarefa.modelo.Tarefa;
import java.util.LinkedList;
import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author edgard.cardoso
 */
@Path("/tarefa")
public class ServicoTarefa {

    private static List<Tarefa> listaDeTarefas = new LinkedList<Tarefa>();

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String obterTarefas() {
        Gson gson = new Gson();
        return gson.toJson(listaDeTarefas);
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/{id}")
    public String obterTarefa(@PathParam("id") int id) {
        Gson gson = new Gson();
        for (Tarefa tarefa : listaDeTarefas) {
            if (tarefa.getId() == id) {
                return gson.toJson(tarefa);
            }
        }
        return "{}";
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public void inserirTarefa(Tarefa tarefa) {
        tarefa.setStatus(Tarefa.Status.AFAZER);
        tarefa.setId(listaDeTarefas.size() + 1);
        listaDeTarefas.add(tarefa);
    }

    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public void alterarTarefa(Tarefa tarefa) {
        for (Tarefa tarefaOriginal : listaDeTarefas) {
            if (tarefaOriginal.getId() == tarefa.getId()) {
                tarefaOriginal.setId(tarefa.getId());
                tarefaOriginal.setDescricao(tarefa.getDescricao());
                tarefaOriginal.setData(tarefa.getData());
                tarefaOriginal.setStatus(tarefa.getStatus());
            }
        }
    }

    @DELETE
    @Path("/{id}")
    public void excluirTarefa(@PathParam("id") int id) {
        for (int i = 0; i < listaDeTarefas.size(); i++) {
            if (listaDeTarefas.get(i).getId() == id) {
                listaDeTarefas.remove(i);
                break;
            }

        }

    }
}
