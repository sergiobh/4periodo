/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.una.ads.dropbox.questao1;

import com.dropbox.client2.DropboxAPI;
import com.dropbox.client2.DropboxAPI.Account;
import com.dropbox.client2.exception.DropboxException;
import com.dropbox.client2.session.AccessTokenPair;
import com.dropbox.client2.session.AppKeyPair;
import com.dropbox.client2.session.RequestTokenPair;
import com.dropbox.client2.session.Session.AccessType;
import com.dropbox.client2.session.WebAuthSession;
import com.una.ads.dropbox.autenticacao.DropboxAPIFactory;
import com.una.ads.dropbox.autenticacao.Oauth;
import java.io.File;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.jws.WebService;

/**
 *
 * @author edgard.cardoso
 */
public class InformacaoDaConta {    
    
    private DropboxAPI<?> api;
    
    public InformacaoDaConta() {
        api = DropboxAPIFactory.getDropboxAPI();
    }
    
    public void accountInfo() {
        try {
            Account info = api.accountInfo();
            System.out.println("country: " + info.country);
            System.out.println("displayName: " + info.displayName);
            System.out.println("quota: " + info.quota);
            System.out.println("quotaNormal: " + info.quotaNormal);
            System.out.println("referralLink: " + info.referralLink);
            System.out.println("uid: " + info.uid);
        } catch (DropboxException ex) {
            System.err.println(ex.getMessage());
        }
    }
    
    public static void main(String[] args) {
        InformacaoDaConta conta = new InformacaoDaConta();
        conta.accountInfo();
    }
}
