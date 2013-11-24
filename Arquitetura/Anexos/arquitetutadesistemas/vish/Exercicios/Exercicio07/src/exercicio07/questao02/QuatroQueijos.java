package exercicio07.questao02;

public class QuatroQueijos implements Pizza {

	private double preco = 15;
	
	private static QuatroQueijos qq;
	
	private QuatroQueijos(){
		
	}
	
	public static QuatroQueijos getQuatroQueijos(){
		if(qq == null){
			qq = new QuatroQueijos();
		}
		
		return qq;
	}
	
	@Override
	public double obterPreco() {
		
		return preco;
	}
}
