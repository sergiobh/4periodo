/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio06;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author 311115755
 */
public class GestorDeCaixa {
    
   
    
    private String numeroConta;
    private String historico;
    private String credito;
    private String debito;
    private String valor;
    private String data;

    
    private Entrada entrada;
    private Saida saida;
    
    public GestorDeCaixa(){
        
    }
    
     public GestorDeCaixa(Entrada entrada, Saida saida){
        this.entrada = entrada;
        this.saida = saida;
    }
   
    public void salvarEntrada(){
        
        if (entrada.eValido() == true){
        
        entrada.Salvar();    
    }
        
    }
    
    public void salvarSaida(){
        
        if(saida.eValido() == true){
            saida.salvar();
        }
        
    }
    
    //verificar motivo para sets
    
    public void setHistorico(String historico){
        this.historico = historico;
    }
    
    public void setValor(String valor){
        this.valor = valor;
    }
    
     public void setData(String data){
       this.data = data;
   }
    
    public void setConta(String numeroConta){
       this.numeroConta = numeroConta;
   }
    
    public void setCredito(String credito){
        this.credito = credito;
    }
    
    
    public void setDebito(String debito){
        this.debito = debito;
    }

    
    

    // verificar pra que serve esse método
    public boolean saveCustomerData() {
        
        if(0 == 0){
            
         String saveCostumerData = new SimpleDateFormat("dd/MM/yyyy HH:mm").format(new Date()).toString(); 
            
        }
        
        return true;
   
   }
   
    
}
