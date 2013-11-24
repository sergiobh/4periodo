/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.una.ads.tarefa.app;

import com.una.ads.tarefa.modelo.Tarefa;
import java.util.Date;

/**
 *
 * @author edgardcardoso
 */
public class App {

    private static void ConsumindoComJavaNativo() {
        System.out.println("\n\n------ consumindo com java nativo--------");
        ConsumoNativoJava consumoNativo = new ConsumoNativoJava();

        Tarefa tarefa = new Tarefa();
        tarefa.setData(new Date());
        tarefa.setDescricao("Primeira tarefa");
        tarefa.setStatus(Tarefa.Status.AFAZER);

        consumoNativo.criarTarefa(tarefa);
        consumoNativo.obterTarefa(1);
    }

    private static void ConsumindoComHttpClient() {
        System.out.println("\n\n------ consumindo com Http Client--------");
        
        ConsumoHttpClient consumoHttp = new ConsumoHttpClient();

        Tarefa tarefa = new Tarefa();
        tarefa.setData(new Date());
        tarefa.setDescricao("Primeira tarefa");
        tarefa.setStatus(Tarefa.Status.AFAZER);

        consumoHttp.criarTarefa(tarefa);
        consumoHttp.obterTarefa(1);
    }

   
    public static void main(String[] args) {
        ConsumindoComJavaNativo();
        ConsumindoComHttpClient();
    }
}
