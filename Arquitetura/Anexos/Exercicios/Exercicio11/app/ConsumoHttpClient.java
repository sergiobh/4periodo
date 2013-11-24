/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.una.ads.tarefa.app;

import com.google.gson.Gson;
import com.una.ads.tarefa.modelo.Tarefa;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;

/**
 *
 * @author edgardcardoso
 */
public class ConsumoHttpClient {

    public void criarTarefa(Tarefa tarefa) {
        try {
            System.out.println("Criando tarefa ....");
            DefaultHttpClient httpClient = new DefaultHttpClient();
            HttpPost postRequest = new HttpPost("http://localhost:8083/exercicio09/tarefa");

            Gson gson = new Gson();

            StringEntity input = new StringEntity(gson.toJson(tarefa));
            input.setContentType("application/json");
            postRequest.setEntity(input);

            HttpResponse response = httpClient.execute(postRequest);

            if (response.getStatusLine().getStatusCode() != 200) {
                throw new RuntimeException("Failed : HTTP error code : "
                        + response.getStatusLine().getStatusCode());
            }

            BufferedReader br = new BufferedReader(
                    new InputStreamReader((response.getEntity().getContent())));

            String output;
            while ((output = br.readLine()) != null) {
                System.out.println(output);
            }

            httpClient.getConnectionManager().shutdown();

        } catch (MalformedURLException e) {

            e.printStackTrace();

        } catch (Exception e) {

            e.printStackTrace();

        }
    }

    public void obterTarefa(int id) {
        try {
            System.out.println("Buscando tarefa ....");
            DefaultHttpClient httpClient = new DefaultHttpClient();
            HttpGet getRequest = new HttpGet("http://localhost:8083/exercicio09/tarefa/" + id);
            getRequest.addHeader("accept", "application/json");

            HttpResponse response = httpClient.execute(getRequest);

            if (response.getStatusLine().getStatusCode() != 200) {
                throw new RuntimeException("Failed : HTTP error code : "
                        + response.getStatusLine().getStatusCode());
            }

            BufferedReader br = new BufferedReader(
                    new InputStreamReader((response.getEntity().getContent())));



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


            httpClient.getConnectionManager().shutdown();

        } catch (ClientProtocolException e) {

            e.printStackTrace();

        } catch (Exception e) {

            e.printStackTrace();
        }


    }
}
