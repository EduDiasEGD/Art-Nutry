
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
       System.out.print(Calorias[0]*(gramatur/100));
       System.out.print(Carboidrato[0]*(gramatur/100));
       System.out.print(Proteina[0]*(gramatur/100));
       System.out.print(Gorduras[0]*(gramatur/100));
       System.out.print(Sodio[0]*(gramatur/100));
         
       break;
     case "Feijao":
       System.out.print(Calorias[1]*(gramatur/100));
       System.out.print(Carboidrato[1]*(gramatur/100));
       System.out.print(Proteina[1]*(gramatur/100));
       System.out.print(Gorduras[1]*(gramatur/100));
       System.out.print(Sodio[1]*(gramatur/100));
       break;
     case "Batata":
       System.out.print(Calorias[2]*(gramatur/100));
       System.out.print(Carboidrato[2]*(gramatur/100));
       System.out.print(Proteina[2]*(gramatur/100));
       System.out.print(Gorduras[2]*(gramatur/100));
       System.out.print(Sodio[2]*(gramatur/100));
       break;
     case "Chocolate":
        System.out.print(Calorias[3]*(gramatur/100));
       System.out.print(Carboidrato[3]*(gramatur/100));
       System.out.print(Proteina[3]*(gramatur/100));
       System.out.print(Gorduras[3]*(gramatur/100));
       System.out.print(Sodio[3]*(gramatur/100));
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
