package Exercicio03.questao01;
public class TvACabo {

    private String descricaoDoProduto;
    private String preco;
    private String quantidadeDeCanais;

    public void imprimir() {
        System.out.println("Produto: TV a Cabo");
    }

    public void formaDePagamento(String forma) {

        if (forma.equals(Venda.PAGAMENTO_BOLETO)) {
            imprimir();
            System.out.println("Executa pagamento com boleto");
        } else if (forma.equals(Venda.PAGAMENTO_CARTAO_DE_CREDITO)) {
            imprimir();
            System.out.println("Executa pagamento com cartão de crédito");
        }

    }

    public void opcaoDeCompra(String opcao) {
        if (opcao.equals(Venda.COMPRA_MENSAL)) {
            imprimir();
            System.out.println("Executa opção de compra mensal");
        } else if (opcao.equals(Venda.COMPRA_ANUAL)) {
            imprimir();
            System.out.println("Executa opção de compara anual");
        }
    }
}
