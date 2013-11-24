/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package questao3;

import questao3.controle.Venda;
import questao3.modelo.Produto;
import questao3.relatorio.IRelatorio;
import questao3.relatorio.RelatorioFactory;
import questao3.relatorio.TipoRelatorio;

/**
 *
 * @author edgard.cardoso
 */
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
