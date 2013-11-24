/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package prova01.questao01;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author edgard.cardoso
 */
public class Conversor {

    public static String xml = "xml";
    public static String json = "json";
    public static String csv = "csv";
    List<Produto> produtos;

    public Conversor() {
        produtos = new LinkedList<>();
    }

    public void adicionaProduto(Produto produto) {
        produtos.add(produto);
    }

    public String converterPara(String tipo) {
        StringBuilder stringBuilder = new StringBuilder();
        if (tipo.equals(xml)) {
            stringBuilder.append("<Produtos>");
            stringBuilder.append("\n");
            for (Produto produto : produtos) {
                stringBuilder.append("    <Produto>");
                stringBuilder.append("\n");
                stringBuilder.append("        <Titulo>");
                stringBuilder.append(produto.getTitulo());
                stringBuilder.append("</Titulo>");
                stringBuilder.append("\n");
                stringBuilder.append("        <Preco>");
                stringBuilder.append(produto.getPreco());
                stringBuilder.append("</Preco>");
                stringBuilder.append("\n");
                stringBuilder.append("    </Produto>");
                stringBuilder.append("\n");
            }
            stringBuilder.append("</Produtos>");
        } else if (tipo.equals(json)) {
            stringBuilder.append("{").append("\n");
            stringBuilder.append("    \"Produtos\": {");
            stringBuilder.append("\n");
            stringBuilder.append("        \"Produto\": [").append("\n");
            for (Produto produto : produtos) {
                stringBuilder.append("        {");
                stringBuilder.append("\n");
                stringBuilder.append("            \"Titulo\":");
                stringBuilder.append("\"").append(produto.getTitulo()).append("\"");
                stringBuilder.append("\n");
                stringBuilder.append("            \"Preco\":");
                stringBuilder.append("\"").append(produto.getPreco()).append("\"");
                stringBuilder.append("\n");
                stringBuilder.append("        },");
                stringBuilder.append("\n");
            }
            stringBuilder.append("        ]").append("\n");
            stringBuilder.append("   }").append("\n");
            stringBuilder.append("}");
        } else if (tipo.equals(csv)) {
            stringBuilder.append("Titulo;Preco");
            stringBuilder.append("\n");
            for (Produto produto : produtos) {
                stringBuilder.append(produto.getTitulo());
                stringBuilder.append(";");
                stringBuilder.append(produto.getPreco());
                stringBuilder.append("\n");
            }
        }
        return stringBuilder.toString();
    }
}
