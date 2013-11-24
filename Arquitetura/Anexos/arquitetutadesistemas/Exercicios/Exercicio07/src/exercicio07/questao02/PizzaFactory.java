package exercicio07.questao02;

public class PizzaFactory {

	public Pizza criarPizza(TipoPizza tipo) {

		switch (tipo) {
			case PORTUGUESA:
				return Portuguesa.getPortuguesa();
				
			case AMODA:
				return AModa.getAModa();
				
			case QUATROQUEIJOS:
				return QuatroQueijos.getQuatroQueijos();
				
			default:
				System.out.println("Esta pizza não existe!!");
				return null;
		}		
	}
}
