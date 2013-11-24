/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.una.ads.dropbox.questao2;

import com.dropbox.client2.DropboxAPI;
import com.dropbox.client2.DropboxAPI.DropboxFileInfo;
import com.una.ads.dropbox.autenticacao.DropboxAPIFactory;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Map.Entry;

/**
 *
 * @author edgard.cardoso
 */
public class Download {

    private DropboxAPI<?> api;

    public Download() {
        api = DropboxAPIFactory.getDropboxAPI();
    }
    
    public void testeDownload (){
                
        FileOutputStream outputStream = null;
        try {
            File file = new File("c://Users/Leandro/Downloads/teste.txt");
            outputStream = new FileOutputStream(file);
            DropboxFileInfo info = api.getFile("/teste.txt", null, outputStream, null);
        } catch (Exception e) {
            System.out.println("Something went wrong: " + e);
        } finally {
            if (outputStream != null) {
                try {
                    outputStream.close();
                } catch (IOException e) {}
            }
        }
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        Download dw = new Download();
        dw.testeDownload();
    }
}
