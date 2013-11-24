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
public class Saida {
    
    private String numeroConta;
	private String historico;
	private double valor;
	private Date data;
        
        FileUtil futil;
        

	public void salvar() {
            
            futil.writeToFile("Saida.txt", "1", true, true);

	}
        
        

	public boolean eValido() {
            
            Date datas = new Date();

		if (numeroConta.length() < 8 || historico == "" || valor <= 0 || datas.after(data)) {
			return false;
		}

		return true;
	}
    
    
}
