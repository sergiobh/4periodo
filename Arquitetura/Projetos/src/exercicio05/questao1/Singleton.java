package exercicio05.questao1;

public class Singleton {
	private static Singleton singleton;
	
	public Singleton(){
		
	}
	
	public static Singleton getInstancia(){
		if(singleton == null){
			singleton = new Singleton();
		}
		
		return singleton;
	}
}
