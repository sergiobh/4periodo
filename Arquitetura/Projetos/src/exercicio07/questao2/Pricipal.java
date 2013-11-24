package exercicio07.questao2;

public class Pricipal {

	public static void main(String[] args) {
		PizzaFactory factory = new PizzaFactory();
		Pizza pizza = factory.criarPizza(PizzaFactory.TipoPizza.AMODA);
		System.out.printf("Preço Unitário: %f", pizza.obterPreco());
		
	}

}
