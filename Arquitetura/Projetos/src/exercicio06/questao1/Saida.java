package exercicio06.questao1;

import exercicio05.FileUtil;

public class Saida {

	private String numeroDaConta;
	private String historico;
	private double valor;
	private java.util.Date data;
	
	public Saida() {
		
	}

	public void salvar(){
		String msg = "numeroDaConta: "+numeroDaConta+" historico: "+historico+" valor: "+valor+" data: "+data.toString();
		
        FileUtil fileutil = new FileUtil();
        boolean retorno = fileutil.writeToFile("Saida.txt",msg, true, true);
        
        if(retorno){
        	System.out.println("Gravação concluída!");
        }
        else{
        	System.out.println("Ocorreu um erro na gravação!");
        }
	}
	
	public boolean eValido(){
		Validacao validacao = new Validacao();
		
		// validar o numeroDaConta, contem pelo menos 8 caracteres
		// validar o historico, não pode ser vázio
		// validar o valor, deve ser maior que 0
		// validar data deve ser maior que a atual
		
		if(validacao.validaConta(numeroDaConta) && validacao.validaHistorico(historico) && validacao.validaValor(valor) && validacao.validaData(data)){
			System.out.println("A validação foi aprovada!");
			return true;
		}
		else{
			System.out.println("A validação foi reprovada!");
			return false;
		}
	}
	
	public String getNumeroDaConta() {
		return numeroDaConta;
	}


	public void setNumeroDaConta(String numeroDaConta) {
		this.numeroDaConta = numeroDaConta;
	}


	public String getHistorico() {
		return historico;
	}


	public void setHistorico(String historico) {
		this.historico = historico;
	}


	public double getValor() {
		return valor;
	}


	public void setValor(double valor) {
		this.valor = valor;
	}


	public java.util.Date getData() {
		return data;
	}


	public void setData(java.util.Date data) {
		this.data = data;
	}
}
