package exercicio06.questao1;

import java.util.Date;

public class Validacao {
	
	public static boolean validaConta(String numeroConta){
		if(numeroConta.length() >= 8){
			return true;
		}
		else{
			System.out.println("N�mero da Conta Inv�lido");
			return false;
		}
	}
	
	public static boolean validaHistorico(String historico){
		if(historico != ""){
			return true;
		}
		else{
			System.out.println("Hist�rico Inv�lido");
			return false;
		}
	}

	public static boolean validaValor(double valor){
		if(valor > 0){
			return true;
		}
		else{
			System.out.println("Valor Inv�lido");
			return false;
		}
	}

	public static boolean validaData(java.util.Date data){
		Date hoje = new Date();

		if(hoje.after(data)){
			return true;
		}
		else{
			System.out.println("Data Inv�lida");
			return false;
		}
	}
}