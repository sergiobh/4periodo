/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package prova01.questao01;

/**
 *
 * @author edgard.cardoso
 */
public class Produto {
    
    private String titulo;
    private double preco;

    public Produto(String titulo, double preco) {
        this.titulo = titulo;
        this.preco = preco;
    }
    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }  
}
