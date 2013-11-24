package exercicio06.questao1;

import java.sql.Date;

public class GestorDeCaixa {

	private String numeroDaConta;
	private String historico;
	private double valor;
	private java.util.Date data;
    private double credito;
    private double debito;
    private Entrada entrada;
    private Saida saida;
    
    public GestorDeCaixa(String numeroDaConta, String historico, double valor, java.util.Date data, double credito, double debito) {
		this.numeroDaConta = numeroDaConta;
		this.historico = historico;
		this.valor = valor;
		this.data = data;
		this.credito = credito;
		this.debito = debito;
		
		if(credito > 0){
			this.entrada = new Entrada();
			this.SalvarEntrada();
			this.saida = null;
		}
		else{
			this.saida = new Saida();
			this.SalvarSaida();
			this.entrada = null;
		}
	}
    
    public void SalvarEntrada(){
    	entrada.setNumeroDaConta(numeroDaConta);
    	entrada.setHistorico(historico);
    	entrada.setValor(valor);
    	entrada.setData(data);

    	if(entrada.eValido()){
    		entrada.salvar();
    	}
    }
    
    public void SalvarSaida(){
    	saida.setNumeroDaConta(numeroDaConta);
    	saida.setHistorico(historico);
    	saida.setValor(valor);
    	saida.setData(data);

    	if(saida.eValido()){
    		saida.salvar();
    	}
    }
}
