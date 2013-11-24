
package Strategy;


public class Facade {
    

    void publicarNoticia(String msg, String tipo){
    
        INoticia noticia;        
        NoticiaFactory factory = new NoticiaFactory();
        noticia = factory.criarNoticia(tipo);
        noticia.formatar(msg);
                  
    }
    
}
