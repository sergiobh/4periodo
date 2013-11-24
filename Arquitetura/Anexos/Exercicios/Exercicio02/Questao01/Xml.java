package Questao01;

public class Xml implements TipoArquivo {

	@Override
	public void abrirArquivo() {
		System.out.print("Abrindo Arquivo Xml..");
	}

	@Override
	public void salvarArquivo() {
		System.out.print("Salvando Arquivo Xml..");
	}

}
