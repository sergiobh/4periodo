/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio08_observer;

import exercicio08_observer.facade.Facade;
import java.util.Scanner;

/**
 *
 * @author edgardcardoso
 */
public class Principal {
    public static void main(String []args){
        Scanner in = new Scanner(System.in);
        
        String entrada;
        Facade facade = new Facade();
        do{
         
         System.out.println("Digite uma notícia");
         entrada = in.nextLine();
         facade.publicarNoticia(entrada);
         System.out.println("");
        }while (!entrada.contains("sair"));
    }
}
