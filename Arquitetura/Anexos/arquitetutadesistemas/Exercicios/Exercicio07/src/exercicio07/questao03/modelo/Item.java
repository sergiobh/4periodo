/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio07.questao03.modelo;

import java.util.Date;

/**
 *
 * @author edgardcardoso
 */
public class Item {
    
    private Produto produto;
    private int quantidade;
    private Date data;

    public Item() {
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }
    
    
    
    
}
