/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

/**
 *
 * @author Alunos
 */
public class ValorNutricional_GUI extends javax.swing.JFrame {

    /**
     * Creates new form ValorNutricional_GUI
     */
    public ValorNutricional_GUI() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel8 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        PesquisarAlimento = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        gramatura = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        carbo = new javax.swing.JLabel();

        jLabel8.setText("jLabel8");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setLayout(null);

        jLabel1.setText("Pesquisa de Alimentos");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(180, 10, 130, 17);

        jButton1.setText("Menu sand");
        jPanel1.add(jButton1);
        jButton1.setBounds(10, 50, 120, 23);
        jPanel1.add(PesquisarAlimento);
        PesquisarAlimento.setBounds(150, 50, 180, 23);

        jButton2.setText("lupa");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(330, 50, 60, 23);

        jButton3.setText("Perfil");
        jPanel1.add(jButton3);
        jButton3.setBounds(420, 50, 70, 23);

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Cálculo de Kcal"));
        jPanel2.setLayout(null);

        jLabel2.setText("gramas");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(70, 20, 43, 17);
        jPanel2.add(gramatura);
        gramatura.setBounds(10, 20, 50, 23);

        jLabel3.setText("=");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(140, 20, 34, 17);

        jLabel4.setText("Kcal");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(240, 20, 34, 17);

        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        jPanel2.add(jTextField3);
        jTextField3.setBounds(180, 20, 50, 23);

        jButton4.setText("Calcular");
        jPanel2.add(jButton4);
        jButton4.setBounds(103, 60, 90, 23);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(110, 90, 290, 90);

        jPanel4.setBackground(new java.awt.Color(204, 204, 204));
        jPanel4.setLayout(null);

        jLabel5.setText("Tabela Nutricional");
        jPanel4.add(jLabel5);
        jLabel5.setBounds(10, 10, 110, 17);

        jLabel6.setText("Quantidade");
        jPanel4.add(jLabel6);
        jLabel6.setBounds(164, 10, 60, 17);

        jLabel7.setText("%");
        jPanel4.add(jLabel7);
        jLabel7.setBounds(250, 10, 12, 17);

        jLabel9.setText("---------------------------------------------------------------------");
        jPanel4.add(jLabel9);
        jLabel9.setBounds(10, 30, 276, 17);

        jLabel10.setText("Carboidratos");
        jPanel4.add(jLabel10);
        jLabel10.setBounds(10, 50, 80, 17);

        jLabel11.setText("Proteínas");
        jPanel4.add(jLabel11);
        jLabel11.setBounds(10, 80, 80, 17);

        jLabel12.setText("Gorduras Totais");
        jPanel4.add(jLabel12);
        jLabel12.setBounds(10, 110, 100, 17);

        jLabel13.setText("Açúcares");
        jPanel4.add(jLabel13);
        jLabel13.setBounds(10, 140, 80, 17);

        jLabel14.setText("Sódio");
        jPanel4.add(jLabel14);
        jLabel14.setBounds(10, 170, 60, 17);
        jPanel4.add(carbo);
        carbo.setBounds(160, 50, 0, 0);

        jPanel1.add(jPanel4);
        jPanel4.setBounds(110, 190, 290, 200);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(500, 400));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Model.PesquisaAlimentar_DAO.Comidas();
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ValorNutricional_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ValorNutricional_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ValorNutricional_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ValorNutricional_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ValorNutricional_GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JTextField PesquisarAlimento;
    public static javax.swing.JLabel carbo;
    public static javax.swing.JTextField gramatura;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}
