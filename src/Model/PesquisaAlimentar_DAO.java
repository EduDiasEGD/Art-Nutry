
package Model;

import javax.swing.JOptionPane;


public class PesquisaAlimentar_DAO {
    public static void Comidas(){
      double Calorias[]={128, 100, 230, 479 };
      double Carboidrato[]={26 , 8.2 , 6.0, 60 };
      double Proteina[]={2.1 , 4.77, 0.51, 4.8};
      double Gorduras[]={1 ,1.4 , 0.03, 30.8};
      double Sodio[]={76 , 91, 1.5, 44 };
      float gramatur = 0;
                
       String comida = View.ValorNutricional_GUI.PesquisarAlimento.getText();
       String gramatura= View.ValorNutricional_GUI.gramatura.getText();
       gramatur = Float.parseFloat(gramatura);
       
       if(gramatur == 0){
          System.out.println("Digite a quantidade do alimento");
       }
       else{
     switch (comida) {
     case "Arroz":
       View.ValorNutricional_GUI.caloria.setText(String.valueOf(Calorias[0]*(gramatur/100))); 
       View.ValorNutricional_GUI.carboidrato.setText(String.valueOf(Carboidrato[0]*(gramatur/100)));
       View.ValorNutricional_GUI.proteina.setText(String.valueOf(Proteina[0]*(gramatur/100)));
       View.ValorNutricional_GUI.gordura.setText(String.valueOf(Gorduras[0]*(gramatur/100)));
       View.ValorNutricional_GUI.sodio.setText(String.valueOf(Sodio[0]*(gramatur/100)));
         
       break;
     case "Feijao":
       View.ValorNutricional_GUI.caloria.setText(String.valueOf(Calorias[1]*(gramatur/100))); 
       View.ValorNutricional_GUI.carboidrato.setText(String.valueOf(Carboidrato[1]*(gramatur/100)));
       View.ValorNutricional_GUI.proteina.setText(String.valueOf(Proteina[1]*(gramatur/100)));
       View.ValorNutricional_GUI.gordura.setText(String.valueOf(Gorduras[1]*(gramatur/100)));
       View.ValorNutricional_GUI.sodio.setText(String.valueOf(Sodio[1]*(gramatur/100)));
       break;
     case "Batata":
       View.ValorNutricional_GUI.caloria.setText(String.valueOf(Calorias[2]*(gramatur/100))); 
       View.ValorNutricional_GUI.carboidrato.setText(String.valueOf(Carboidrato[2]*(gramatur/100)));
       View.ValorNutricional_GUI.proteina.setText(String.valueOf(Proteina[2]*(gramatur/100)));
       View.ValorNutricional_GUI.gordura.setText(String.valueOf(Gorduras[2]*(gramatur/100)));
       View.ValorNutricional_GUI.sodio.setText(String.valueOf(Sodio[2]*(gramatur/100)));
       break;
     case "Chocolate":
       View.ValorNutricional_GUI.caloria.setText(String.valueOf(Calorias[3]*(gramatur/100))); 
       View.ValorNutricional_GUI.carboidrato.setText(String.valueOf(Carboidrato[3]*(gramatur/100)));
       View.ValorNutricional_GUI.proteina.setText(String.valueOf(Proteina[3]*(gramatur/100)));
       View.ValorNutricional_GUI.gordura.setText(String.valueOf(Gorduras[3]*(gramatur/100)));
       View.ValorNutricional_GUI.sodio.setText(String.valueOf(Sodio[3]*(gramatur/100)));
       break;
     
     default:
       JOptionPane.showMessageDialog(null, "Alimento não cadastrado em nossa base de dados.");
   }
    
       }
       
       
        
        
        
        /*String valor[]={"Frango ", "100", "13f"};
        int i;
        
        for(i=0; i<3;i++){
            System.out.print(valor[i]);
        }*/
        
    }
}
