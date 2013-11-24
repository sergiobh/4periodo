package exercicio07.questao01;

public class Principal {

	static boolean tipo = true;
	
	public static void main(String[] args) {
	
		LoggerFactory factory = new LoggerFactory();
		
		Logger logger = factory.getLogger();
		logger.log("Teste com Factory Method.");
		
	}
}
