package exercicio06.questao1;

import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class LivroCaixa {

	private String numeroDaConta;
	private String historico;
	private double valor;
	private java.util.Date data;
    private double credito;
    private double debito;
	
	private GestorDeCaixa gestorDeCaixa;

    // http://www.devmedia.com.br/entrada-de-dados-classe-scanner/21366
    public Scanner ler = new Scanner(System.in);
	
	public LivroCaixa() throws ParseException {
		this.menu();

		this.setNumeroDaConta();
		
		this.setHistorico();
		
		this.setValor();
		
		this.setData();
		
		this.setCredito();
		
		this.setDebito();		

		
		
		this.limpatela();
		
		gestorDeCaixa = new GestorDeCaixa(this.numeroDaConta, this.historico, this.valor, this.data, this.credito, this.debito);
	}
	
	public void menu(){
		System.out.println(" ***** Livro de Caixa *****\n\n");		
	}
	
	public void limpatela(){
		for (int i = 0; i < 20; i++) {
			System.out.println("\n");			
		}
	}
	
	public String getNumeroDaConta() {
		return numeroDaConta;
	}

	public void setNumeroDaConta() {
		System.out.print("Digite o Número da Conta: ");
		this.numeroDaConta = ler.nextLine();
	}

	public String getHistorico() {
		return historico;
	}

	public void setHistorico() {
		System.out.print("Digite o Historico: ");
		this.historico = ler.nextLine();
	}

	public double getValor() {
		return valor;
	}

	public void setValor() {
		System.out.printf("Informe o valor: R$ ");
		this.valor = ler.nextDouble();
	}

	public java.util.Date getData() {
		return data;
	}

	public void setData() throws ParseException {
		System.out.print("Data: ");
		System.out.print("Digite o dia: ");
		String Dia = ler.next();
		
		System.out.print("Digite o mês: ");
		String Mes = ler.next();
		
		System.out.print("Digite o ano: ");
		String Ano = ler.next();
	
		//DateFormat f = DateFormat.getDateInstance();
		//this.data = (Date) f.parse(Dia+"/"+Mes+"/"+Ano);

		
		this.data = this.transformaData(Dia+'/'+Mes+'/'+Ano);
        //this.data = date;
	}

	public java.util.Date transformaData(String data){
	  SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy"); // kk:hh:ss
	  try {
	  	return formatador.parse(data);
	  }
	  catch(ParseException ex){ 
		  throw new RuntimeException(ex);
	  }
	}

	
	public double getCredito() {
		return credito;
	}

	public void setCredito() {
		System.out.printf("Informe o crédito: R$ ");
		this.credito = ler.nextDouble();
	}

	public double getDebito() {
		return debito;
	}

	public void setDebito() {
		System.out.printf("Informe o débito: R$ ");
		this.debito = ler.nextDouble();
	}

}
