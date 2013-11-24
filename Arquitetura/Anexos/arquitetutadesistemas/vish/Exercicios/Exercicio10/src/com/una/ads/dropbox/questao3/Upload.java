/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.una.ads.dropbox.questao3;

import com.dropbox.client2.DropboxAPI;
import com.una.ads.dropbox.autenticacao.DropboxAPIFactory;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Map.Entry;

/**
 *
 * @author edgard.cardoso
 */
public class Upload {

    //public static void main(String[] args) {
              
        private DropboxAPI <?> api;

        public Upload() {
            api = DropboxAPIFactory.getDropboxAPI();
        }

        public void testeUpload (){
        
            FileInputStream inputStream = null;

            try {
                File file = new File("C://Users/Leandro/Downloads/teste.txt");
                inputStream = new FileInputStream(file);
                Entry newEntry = (Entry) api.putFile("/teste.txt", inputStream, file.length(), null, null);
            }
            catch (Exception e) {
                System.out.println("Something went wrong: " + e);
            }
            finally {
                if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                }
            }
        }
    }
}
