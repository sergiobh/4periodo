/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.una.ads.singleton;

import java.util.HashMap;

/**
 *
 * @author Vericio
 */
public class MeuSingleton {
    
    
    private static MeuSingleton instancia;
    
    private HashMap<String, String> map;

    private MeuSingleton() {
        map = new HashMap<String, String>();
    }
    
    public String getLogNaTela(String LogNaTela){
        return map.get(LogNaTela);
    }
    
    public static MeuSingleton getMeuSingleton(){
        if (instancia == null){
            instancia = new MeuSingleton();
        }
        return instancia;
    }
    
    public void log (String mensagem){
        System.out.println(instancia);
    }  
}
