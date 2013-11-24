package Questao03;
import java.util.ArrayList;

public class Amazon implements TipoBusca {
    
     public ArrayList<String> executarBusca(String []args){
         //Pega os argumento e faz alguma busca no banco 
         //de dados
         ArrayList<String> resultado = new ArrayList<String>();
         resultado.add("Sistema Busca: Amazon\n");
         resultado.add("Produto 1 - R$ 32.50\n");
         resultado.add("Produto 2 - R$ 51.00\n");
         resultado.add("Produto 3 - R$ 68.00\n");
         resultado.add("Produto 4 - R$ 14.00\n");
         
         return resultado;
     }

}
