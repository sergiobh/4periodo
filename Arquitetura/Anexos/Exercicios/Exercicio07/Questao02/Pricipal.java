package Questao02;

public class Pricipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PizzaFactory factory = new PizzaFactory();
		Pizza pizza = factory.criarPizza(PizzaFactory.TipoPizza.AMODA);
		System.out.printf("Pre�o Unit�rio: %f", pizza.obterPreco());
		
	}

}
