package Questao01;

public class TXT implements TipoArquivo {

	@Override
	public void abrirArquivo() {
		System.out.print("Abrindo Arquivo TXT..");
	}

	@Override
	public void salvarArquivo() {
		System.out.print("Salvando Arquivo TXT..");

	}

}
