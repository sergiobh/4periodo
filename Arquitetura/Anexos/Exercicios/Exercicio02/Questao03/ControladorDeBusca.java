package Questao03;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ControladorDeBusca {
	private TipoBusca tipoBusca;

    public ArrayList<ArrayList> executarBusca(String []args){
        ArrayList<ArrayList> resultado = new ArrayList<ArrayList>();
        resultado.add(tipoBusca.executarBusca(args));
        
        return resultado;
    }   
    
    public void setTipoBusca( TipoBusca tipoBusca){
    	this.tipoBusca = tipoBusca;
    }
}
