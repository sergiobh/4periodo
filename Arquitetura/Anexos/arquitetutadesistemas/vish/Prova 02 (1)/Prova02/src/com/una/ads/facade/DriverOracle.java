/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.una.ads.facade;

/**
 *
 * @author Vericio
 */
public class DriverOracle implements DriverBD{
    String comando;

    public void gravarLog() {
        this.gravarLog();
        System.out.print(this.comando);
    }

    public void executar() {
        this.executar();
        System.out.print(this.comando);
    }
    
}
