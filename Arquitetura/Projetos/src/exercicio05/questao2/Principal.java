package exercicio05.questao2;

import exercicio05.FileUtil;
//import exercicio05.MiscUtil;

public class Principal {

	public static void main(String[] args) {

		String msg = "Dizem que somos loucos da cabe�a... Amamos o cruzeiro � o que interessa... O mundo inteiro teme a La Besta Negra!!! N�s somos loucos, somos Cruzeiro!";
	
        FileUtil fileutil = new FileUtil();
        boolean retorno = fileutil.writeToFile("cruzeiro.txt",msg, true, true);
        
        System.out.print("Retorno: ");

        if(retorno){
        	System.out.print("sucesso");
        }
        else{
        	System.out.print("erro!");
        }
        
	}

}
