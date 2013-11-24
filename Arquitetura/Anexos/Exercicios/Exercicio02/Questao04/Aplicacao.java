package Questao04;

public class Aplicacao {
 
   IAcao Acao;
   
   public void executarAcao(IAcao Acao){
	   Acao.executarAcao();               
   }
   
   public void setAcao(IAcao Acao){
	   this.Acao = Acao;
   }
   
   
}
