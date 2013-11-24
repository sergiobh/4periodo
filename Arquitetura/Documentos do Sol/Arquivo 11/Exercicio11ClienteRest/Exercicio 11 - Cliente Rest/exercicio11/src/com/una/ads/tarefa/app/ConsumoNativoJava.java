/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.una.ads.tarefa.app;

import com.google.gson.Gson;
import com.una.ads.tarefa.modelo.Tarefa;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

/**
 *
 * @author edgardcardoso
 */
public class ConsumoNativoJava {

    public void criarTarefa(Tarefa tarefa) {
        try {
            System.out.println("Criando tarefa ....");
            URL url = new URL("http://localhost:8083/exercicio09/tarefa");
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setDoOutput(true);
            conn.setRequestMethod("POST");
            conn.setRequestProperty("Content-Type", "application/json");

            Gson gson = new Gson();
            String input = gson.toJson(tarefa);

            OutputStream os = conn.getOutputStream();
            os.write(input.getBytes());
            os.flush();

            if (conn.getResponseCode() != HttpURLConnection.HTTP_OK) {
                throw new RuntimeException("Failed : HTTP error code : "
                        + conn.getResponseCode());
            }

            BufferedReader br = new BufferedReader(new InputStreamReader(
                    (conn.getInputStream())));

            String output;
            while ((output = br.readLine()) != null) {
                System.out.println(output);
            }

            conn.disconnect();

        } catch (MalformedURLException e) {

            e.printStackTrace();

        } catch (Exception e) {
            e.printStackTrace();

        }
    }

    public void obterTarefa(int id) {
        try {
            System.out.println("Buscando tarefa ....");
            URL url = new URL("http://localhost:8083/exercicio09/tarefa/" + id);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.setRequestProperty("Accept", "application/json");

            if (conn.getResponseCode() != 200) {
                throw new RuntimeException("Failed : HTTP error code : "
                        + conn.getResponseCode());
            }

            BufferedReader br = new BufferedReader(new InputStreamReader(
                    (conn.getInputStream())));

            String output;
            StringBuilder json = new StringBuilder();
            while ((output = br.readLine()) != null) {
                System.out.println(output);
                json.append(output);
            }

            Gson gson = new Gson();
            Tarefa tarefa = gson.fromJson(json.toString(), Tarefa.class);
            System.out.println("tarefa.id = " + tarefa.getId());
            System.out.println("tarefa.descricao = " + tarefa.getDescricao());
            System.out.println("tarefa.data = " + tarefa.getData());
            System.out.println("tarefa.status = " + tarefa.getStatus());

            conn.disconnect();

        } catch (MalformedURLException e) {

            e.printStackTrace();

        } catch (Exception e) {

            e.printStackTrace();

        }


    }
}
