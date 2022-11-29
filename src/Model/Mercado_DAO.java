
package Model;

import java.awt.Desktop;
import java.net.URI;

public class Mercado_DAO {
    public static void ebooks() throws Exception{
        int cotBook = View.Mercado_GUI.contBook;
        
            if(cotBook==1){
                Desktop d = Desktop.getDesktop();
                d.browse(new URI("https://www.saraiva.com.br/carne-de-soja--40-receitas-gostosas-e-saudaveis-27291/p"));
                
                
            }
            else if(cotBook==2){
                Desktop d = Desktop.getDesktop();
                d.browse(new URI("https://www.saraiva.com.br/o-paradoxo-dos-vegetais-os-perigos-ocultos-em-alimentos--saudaveis--que-causam-doencas-e-ganho-de-peso/p"));
            }
            else if(cotBook == 3){
                Desktop d = Desktop.getDesktop();
                d.browse(new URI("https://www.saraiva.com.br/comida-como-cultura-19875/p"));
            
    
        
}
    
    
    }
    public static void courses() throws Exception{
        int Course = View.Mercado_GUI.contCourses;
        
            if(Course==1){
                Desktop d = Desktop.getDesktop();
                d.browse(new URI("https://www.biotreino.com.br/?gclid=Cj0KCQiA1ZGcBhCoARIsAGQ0kkp60Vfe4iGG4qQHDb7ea_zfYVGCaQCiaKCSmU6N2tliw8SUdsT0YrMaAjBZEALw_wcB"));
                
                
            }
            else if(Course==2){
                Desktop d = Desktop.getDesktop();
                d.browse(new URI("https://www.biotreino.com.br/?gclid=Cj0KCQiA1ZGcBhCoARIsAGQ0kkp60Vfe4iGG4qQHDb7ea_zfYVGCaQCiaKCSmU6N2tliw8SUdsT0YrMaAjBZEALw_wcB"));
            }
            else if(Course == 3){
                Desktop d = Desktop.getDesktop();
                d.browse(new URI("https://www.biotreino.com.br/?gclid=Cj0KCQiA1ZGcBhCoARIsAGQ0kkp60Vfe4iGG4qQHDb7ea_zfYVGCaQCiaKCSmU6N2tliw8SUdsT0YrMaAjBZEALw_wcB"));
            
    
        
}
    
    
    }
}
