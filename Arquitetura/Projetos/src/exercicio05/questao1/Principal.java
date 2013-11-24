package exercicio05.questao1;

public class Principal {

	public static void main(String[] args) {

		Singleton singleton = null;
		
		singleton = singleton.getInstancia();

		System.out.println("Primeira: " + singleton);
		
		singleton = singleton.getInstancia();

		System.out.println("Segunda:  " + singleton);
	}
}