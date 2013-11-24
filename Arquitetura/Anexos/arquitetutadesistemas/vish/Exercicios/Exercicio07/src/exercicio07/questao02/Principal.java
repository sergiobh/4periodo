package exercicio07.questao02;


public class Principal {

	public static void main(String[] args) {
	
		PizzaFactory factory = new PizzaFactory();
		
		Pizza pizza = factory.criarPizza(TipoPizza.PORTUGUESA);
		System.out.println(pizza.obterPreco());
		
		pizza = factory.criarPizza(TipoPizza.AMODA);
		System.out.println(pizza.obterPreco());
		
		pizza = factory.criarPizza(TipoPizza.QUATROQUEIJOS);
		System.out.println(pizza.obterPreco());
	}
}
