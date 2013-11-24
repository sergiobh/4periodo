package exercicio07.questao02;

public class AModa implements Pizza {
	
	private double preco = 20;
	private static AModa aModa;

	private AModa(){
		
	}
	
	public static AModa getAModa(){
		if(aModa == null){
			aModa = new AModa();
		}
		
		return aModa;
	}
	
	@Override
	public double obterPreco() {
		
		return preco;
	}
}
