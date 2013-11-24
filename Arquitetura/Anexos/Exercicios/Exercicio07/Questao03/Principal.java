package Questao03;

import Questao03.modelo.*;
import Questao03.controle.Venda;

import Questao03.relatorio.IRelatorio;
import Questao03.relatorio.RelatorioFactory;
import Questao03.relatorio.TipoRelatorio;

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
