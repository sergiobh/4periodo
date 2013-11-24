/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.una.ads.observer;

/**
 *
 * @author Vericio
 */
public class SMS implements Observados{

    public void notificarDBA(Observador observador) {
        System.out.println(observador.getComandoSQL());
    }
    
}
