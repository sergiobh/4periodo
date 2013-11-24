/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio06;

import java.util.Date;


/**
 *
 * @author 311115755
 */
public class Entrada {
    
    private String numeroConta, historico;
    private double valor;
    private Date data;
    
    FileUtil futil;
    
     

    public void Salvar(){
        
        futil.writeToFile("Entrada.txt", "1", true, true);
        
    }
    
 public boolean eValido() {

		Date datas = new Date();

		//SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");

		if (numeroConta.length() < 8 || historico.equals("") || valor <= 0 || datas.after(data)) {
			return false;
		}

		return true;
	}
    
    
}
