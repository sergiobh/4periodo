package Exercicio03.questao01;

public class Venda {

	public enum TipoProduto {
		INTERNET, TV_A_CABO 
	}
        
        public static final String PAGAMENTO_BOLETO = "Boleto";
        public static final String PAGAMENTO_CARTAO_DE_CREDITO = "Crédito";
        
        
        public static final String COMPRA_MENSAL = "Mensal";
        public static final String COMPRA_ANUAL = "Anual";
        
	
	TipoProduto tipoDeProduto;
	
        public Venda(){
            tipoDeProduto = TipoProduto.TV_A_CABO;
        }
        
	public void executarVenda(String formaDePagamento, String opcaoDeCompra) {
		switch (tipoDeProduto) {
		case INTERNET:
			Internet internet = new Internet();
			internet.formaDePagamento(formaDePagamento);
			internet.opcaoDeCompra(opcaoDeCompra);
			break;
		case TV_A_CABO:
			TvACabo tv = new TvACabo();
			tv.formaDePagamento(formaDePagamento);
			tv.opcaoDeCompra(opcaoDeCompra);
			break;
		}		
	}
	
	public void setProduto(TipoProduto tipoDeProduto) {
		this.tipoDeProduto = tipoDeProduto;
	}
}
