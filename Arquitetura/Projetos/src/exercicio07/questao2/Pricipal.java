package exercicio07.questao2;

public class Pricipal {

	public static void main(String[] args) {
		PizzaFactory factory = new PizzaFactory();
		Pizza pizza = factory.criarPizza(PizzaFactory.TipoPizza.AMODA);
		System.out.printf("Pre�o Unit�rio: %f", pizza.obterPreco());
		
	}

}
