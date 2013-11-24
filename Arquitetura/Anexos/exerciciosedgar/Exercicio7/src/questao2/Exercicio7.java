/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package questao2;

/**
 *
 * @author edgard.cardoso
 */
public class Exercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PizzaFactory factory = new PizzaFactory();
        Pizza pizza = factory.criarPizza(PizzaFactory.TipoPizza.AMODA);
        pizza.obterPreco();
       
    }   
}
