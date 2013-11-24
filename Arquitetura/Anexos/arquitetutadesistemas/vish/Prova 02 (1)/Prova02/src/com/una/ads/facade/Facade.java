/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.una.ads.facade;

import com.una.ads.observer.Email;
import com.una.ads.observer.SMS;

/**
 *
 * @author Vericio
 */
public class Facade {

    public void executarComandoMySQL(String comando) {
        System.out.println("Comando SQL");
    }

    public void executarComandoOracle(String comando) {
        System.out.println("Comando Oracle");
    }

    public void executarComandoDB2(String comando) {
        System.out.println("Comando DB2");
    }
}
