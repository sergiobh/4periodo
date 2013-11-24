/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.una.ads.dropbox.autenticacao;

import com.dropbox.client2.DropboxAPI;
import com.dropbox.client2.session.AccessTokenPair;
import com.dropbox.client2.session.AppKeyPair;
import com.dropbox.client2.session.WebAuthSession;

/**
 *
 * @author edgard.cardoso
 */
public class DropboxAPIFactory {

    public static DropboxAPI<?> getDropboxAPI() {
        DropboxAPI<?> api;
        try {
            AppKeyPair consumerTokenPair = new AppKeyPair(Oauth.APP_KEY, Oauth.APP_SECRET);
            WebAuthSession session = new WebAuthSession(consumerTokenPair, Oauth.ACCESS_TYPE);
            session.setAccessTokenPair(new AccessTokenPair(Oauth.KEY_TOKEN, Oauth.SECRET_TOKEN));
            api = new DropboxAPI<WebAuthSession>(session);
            return api;
        } catch (Exception e) {
            return null;
        }
    }
}
