package Questao03;
import java.util.ArrayList;

public class Americanas implements TipoBusca {
    
     public ArrayList<String> executarBusca(String []args){
         //Pega os argumento e faz alguma busca no banco 
         //de dados
         ArrayList<String> resultado = new ArrayList<String>();
         resultado.add("Sistema Busca: Americanas\n");
         resultado.add("Produto 1 - R$ 33.00\n");
         resultado.add("Produto 2 - R$ 55.00\n");
         resultado.add("Produto 3 - R$ 66.00\n");
         resultado.add("Produto 4 - R$ 11.00\n");
         
         return resultado;
     }
    
}
