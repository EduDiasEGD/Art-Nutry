
package Model;

import java.awt.Desktop;
import java.io.OutputStream;
import java.net.URI;
import java.nio.file.Files;
import java.nio.file.Path;


public class Receitas_DAO {
    public static void receitas() throws Exception{
        int contReceita = View.Receitas_GUI.receitas;
        
        if (contReceita == 1){
            Desktop d = Desktop.getDesktop();
            d.browse(new URI("https://www.receiteria.com.br/receita/mingau-de-tapioca-sem-acucar/"));
        }
        else if (contReceita == 2){
            Desktop d = Desktop.getDesktop();
            d.browse(new URI("https://www.receiteria.com.br/receita/pao-de-queijo-de-frigideira/"));
        }
        else if (contReceita == 3){
            Desktop d = Desktop.getDesktop();
            d.browse(new URI("https://www.receiteria.com.br/receita/smoothie-de-morango-e-banana/"));
        }
    }
}
