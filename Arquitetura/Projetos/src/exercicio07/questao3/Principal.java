package exercicio07.questao3;

import exercicio07.questao3.controle.Venda;
import exercicio07.questao3.modelo.Produto;
import exercicio07.questao3.relatorio.IRelatorio;
import exercicio07.questao3.relatorio.RelatorioFactory;
import exercicio07.questao3.relatorio.TipoRelatorio;

public class Principal {
    private Venda venda;
    
    public Principal(){
        venda = new Venda();
    }
    
    public void criarVenda(){
        venda.adicionaProduto(new Produto(1, "computador", "dell", 1000.99), 2);
        venda.adicionaProduto(new Produto(1, "computador", "IBM", 1000.99), 2);
        venda.adicionaProduto(new Produto(1, "computador", "Mac", 1000.99), 2);
    }
    
    public void gerarRelatorio(TipoRelatorio tipoRelatorio){
        RelatorioFactory factory = new RelatorioFactory();
        IRelatorio relatorio = factory.getRelatorio(tipoRelatorio);
        System.out.println(relatorio.getRelatorio(venda.getItensDeVenda()));
    }
}