package Model;

import View.Home_GUI;
import javax.swing.JOptionPane;

public class VerificaLogin_DAO {
    
    static  int cont = 0;
    public static void confereSenha(){
        String usu = View.TelaLogin_GUI.usuario.getText();
        int sen = Integer.parseInt(View.TelaLogin_GUI.senha.getText());
        
       
        
        if(cont<10){
            if(usu.equals("Vinicius") && sen == 123){
                new Home_GUI().setVisible(true);
                             
            }else{
                JOptionPane.showMessageDialog(null, "Usuário ou senha incorretos");
                View.TelaLogin_GUI.usuario.setText("");
                View.TelaLogin_GUI.senha.setText("");    
        }   
        }
        
            
         
        /*while(!usu.equals("Vinicius") && sen != 123){
            JOptionPane.showMessageDialog(null, "Usuário ou senha incorretos");
            View.TelaLogin_GUI.usuario.setText("");
            View.TelaLogin_GUI.sanha.setText("");
        }
        new Home_GUI().setVisible(true);*/
    }

    
}
