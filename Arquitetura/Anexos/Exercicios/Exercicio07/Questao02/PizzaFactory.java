package Questao02;

public class PizzaFactory {
	public enum TipoPizza{
		QUATRO_QUEITO, AMODA, PORTUGUESA;
	}
	
	public Pizza criarPizza(TipoPizza tipoPizza){
		switch (tipoPizza) {
			case QUATRO_QUEITO: 
				return new QuatroQueijos();
			case AMODA:	
				return new AModa();
			case PORTUGUESA:
			    return new Portuguesa();
			default: return null;			
		}	
	}
}
