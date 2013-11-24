/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.una.ads.observer;

/**
 *
 * @author Vericio
 */
public interface Observador {
    public void notificarObservados();

    public void registrar(Observados obs);

    public void desRegister(Observados obs);
    
    public String getComandoSQL();
    
}
