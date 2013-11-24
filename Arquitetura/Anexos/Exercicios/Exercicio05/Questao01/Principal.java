package Questao01;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Singleton singleton = Singleton.getSingleton();
		
		Singleton s = Singleton.getSingleton();
		
		System.out.println(singleton);
		System.out.println(s);		
		
	}

}
