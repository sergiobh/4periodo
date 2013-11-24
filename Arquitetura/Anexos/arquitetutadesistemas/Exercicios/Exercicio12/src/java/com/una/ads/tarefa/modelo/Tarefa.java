/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.una.ads.tarefa.modelo;

import java.util.Date;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author edgard.cardoso
 */
@XmlRootElement
public class Tarefa {
    
    public enum Status{
        AFAZER, FEITA, CANCELADA
    }
    
    private int id;
    private String descricao;
    private Date data;
    private Status status;

    public Tarefa() {
    }

    public Tarefa(int id, String descricao, Date data, Status status) {
        this.id = id;
        this.descricao = descricao;
        this.data = data;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
    
    
    
}
