package Questao04;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Aplicacao app = new Aplicacao();
		
		app.setAcao(new Novo());
	
		app.Acao.executarAcao();
		
		app.setAcao(new Editar());
		app.Acao.executarAcao();

	}

}
