package Questao01;

import java.util.*;
import java.util.LinkedList;
import java.util.List;

public class Noticias implements Observador {
	private String noticia;
	private List <Observados> listaObservados;	

	public Noticias() {
		listaObservados = new LinkedList<>();
	}

	@Override
	public void notificarObserver() {
		// TODO Auto-generated method 
		for (Observados observados: listaObservados ){
			observados.atualizar(noticia);
		}
	}

	public String getNoticia() {
		return noticia;
	}

	public void setNoticia(String noticia) {
		this.noticia = noticia;
	}

	@Override
	public void registrarObserver() {
		// TODO Auto-generated method stub

	}

	@Override
	public void unRegistraObserver() {
		// TODO Auto-generated method stub

	}

	@Override
	public void registrarObserver(String msg) {
		// TODO Auto-generated method stub
		
	}
	
	public void monitorNoticias(){
		int contador =0;
		while (true){
			try {
				noticia = "Noticia n:  " + contador;
				this.notificarObserver();
				contador++;
				Thread.sleep(3000);
				
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
	


}
