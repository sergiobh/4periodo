/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.una.ads.dropbox.autenticacao;

import java.io.*;

import com.dropbox.client2.*;
import com.dropbox.client2.DropboxAPI.DropboxInputStream;
import com.dropbox.client2.DropboxAPI.Entry;
import com.dropbox.client2.session.*;
import com.dropbox.client2.session.Session.AccessType;
import com.dropbox.client2.session.WebAuthSession.WebAuthInfo;
import java.awt.Desktop;
import java.net.URL;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Charan
 */
public class Autenticacao {

    
    
    private static DropboxAPI<WebAuthSession> dropboxapi;

    public static void main(String[] args) throws Exception {
        AppKeyPair appKeys = new AppKeyPair(Oauth.APP_KEY, Oauth.APP_SECRET);
        WebAuthSession session = new WebAuthSession(appKeys, Oauth.ACCESS_TYPE);
        WebAuthInfo authInfo = session.getAuthInfo();

        RequestTokenPair pair = authInfo.requestTokenPair;
        String url = authInfo.url;

        Desktop.getDesktop().browse(new URL(url).toURI());
        JOptionPane.showMessageDialog(null, "Pressione OK para continuar depois de ter autenticado.");
        session.retrieveWebAccessToken(pair);

        AccessTokenPair tokens = session.getAccessTokenPair();
        System.out.println("Utilize este par de token para que no futuro você não tenha que re-autenticar cada vez:");
        System.out.println("Key token: " + tokens.key);
        System.out.println("Secret token: " + tokens.secret);

        dropboxapi = new DropboxAPI<WebAuthSession>(session);

    }
}