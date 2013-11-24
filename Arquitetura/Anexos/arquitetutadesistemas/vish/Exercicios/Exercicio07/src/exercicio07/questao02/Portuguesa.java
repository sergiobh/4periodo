package exercicio07.questao02;

public class Portuguesa implements Pizza {

	private double preco = 25;
	
	private static Portuguesa portuguesa;
	
	private Portuguesa(){
		
	}
	
	public static Portuguesa getPortuguesa(){
		if(portuguesa == null){
			portuguesa = new Portuguesa();
		}
		
		return portuguesa;
	}
	
	@Override
	public double obterPreco() {

		return preco;
	}
}
