package exercicio05.questao3;

import java.sql.SQLException;

public class Principal {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		ConexaoSingleton conexao = null;
		
		conexao = conexao.getInstacia();
		System.out.println("Primeira: " + conexao);
		System.out.println("Ponteiro da persistência da conexão: " + conexao.getConector());
		
		
		conexao = conexao.getInstacia();
		System.out.println("Segunda: " + conexao);
		System.out.println("Ponteiro da persistência da conexão: " + conexao.getConector());
	}
}