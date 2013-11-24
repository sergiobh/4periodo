/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio07.questao03.principal;

import exercicio07.questao03.controle.Venda;
import exercicio07.questao03.modelo.Produto;
import exercicio07.questao03.relatorio.IRelatorio;
import exercicio07.questao03.relatorio.RelatorioFactory;
import exercicio07.questao03.relatorio.TipoRelatorio;

/**
 *
 * @author edgardcardoso
 */
public class Principal {

    private static Venda venda;

    public static void main(String[] args) {
        criarVenda();
        gerarRelatorio(TipoRelatorio.ANALITICO);
        gerarRelatorio(TipoRelatorio.SINTETICO);
    }

    private static void criarVenda() {
        venda = new Venda();
        venda.adicionaProduto(new Produto(1, "picole", "muito bom", 2.50), 5);
        venda.adicionaProduto(new Produto(2, "sorvete", "galo", 2.80), 3);
        venda.adicionaProduto(new Produto(3, "brigadeiro", "campeao", 4.50), 7);
        venda.adicionaProduto(new Produto(4, "refri", "libetadores", 7.50), 3);
        venda.adicionaProduto(new Produto(5, "ovo de codorno", "2013", 1.50), 1);
        
    }

    private static void gerarRelatorio(TipoRelatorio tipoRelatorio) {
        IRelatorio relatorio = RelatorioFactory.getRelatorio(tipoRelatorio);
        String resultado = relatorio.getRelatorio(venda.getItensDeVenda());
        
        System.out.println(resultado);
    }
}
