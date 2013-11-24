package Questao01;


public class Editor {
    
	TipoArquivo tipoArquivo;
    
    // Construtor que recebe o tipo de arquivo de trabalho
    public Editor(TipoArquivo tipoArquivo){
        this.tipoArquivo = tipoArquivo;
    }     


    public void setTipoArquivo(TipoArquivo tipoArquivo){
    	this.tipoArquivo = tipoArquivo;
    }    
    
    // Método para salvar o arquivo dependendo do seu tipo
    public void abrirArquivo(){
        this.tipoArquivo.abrirArquivo();
     }

    //Implementa a rotina para salvar um arquivo XML
    public void salvarArquivo(){
        this.tipoArquivo.salvarArquivo();
     }
    
}
