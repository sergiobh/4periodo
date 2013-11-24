package Questao03;

import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList result = new ArrayList();
		ControladorDeBusca busca = new ControladorDeBusca();
		
		busca.setTipoBusca(new Amazon());
		result.add(busca.executarBusca(args));
		
		System.out.println(result.toString() );
		
		busca.setTipoBusca(new Americanas());
		result.add(busca.executarBusca(args));
		
		System.out.println(result.toString() );
	} 
	
	

}
