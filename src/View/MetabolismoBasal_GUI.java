/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

/**
 *
 * @author eduar
 */
public class MetabolismoBasal_GUI extends javax.swing.JFrame {
    public static int aparece1 = 1;
    public static int aparece2 = 1;
    
    
    /**
     * Creates new form MetabolismoBasal_GUI
     */
    public MetabolismoBasal_GUI() {
        initComponents();
        homemFormula.setVisible(false);
        mulherFormula.setVisible(false);
        painelMenuSand.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jToggleButton1 = new javax.swing.JToggleButton();
        painelMenuSand = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jButton3 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        homemFormula = new javax.swing.JLabel();
        mulherFormula = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setLayout(null);

        jToggleButton1.setBackground(new java.awt.Color(250, 133, 34));
        jToggleButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jToggleButton1.setText("Fórmula");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jToggleButton1);
        jToggleButton1.setBounds(380, 170, 90, 40);

        painelMenuSand.setBackground(new java.awt.Color(255, 255, 255));
        painelMenuSand.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(250, 133, 34), 2));
        painelMenuSand.setLayout(null);

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/home.png"))); // NOI18N
        jButton2.setText(" Início");
        jButton2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        painelMenuSand.add(jButton2);
        jButton2.setBounds(10, 10, 110, 30);

        jButton5.setBackground(new java.awt.Color(255, 255, 255));
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/maisReceitas.png"))); // NOI18N
        jButton5.setText(" Receitas");
        jButton5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        painelMenuSand.add(jButton5);
        jButton5.setBounds(10, 40, 110, 30);

        jButton6.setBackground(new java.awt.Color(255, 255, 255));
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/valorNutri.png"))); // NOI18N
        jButton6.setText(" Nutrição");
        jButton6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        painelMenuSand.add(jButton6);
        jButton6.setBounds(10, 100, 110, 30);

        jButton7.setBackground(new java.awt.Color(255, 255, 255));
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/mercado.png"))); // NOI18N
        jButton7.setText(" Mercado");
        jButton7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        painelMenuSand.add(jButton7);
        jButton7.setBounds(10, 70, 110, 30);

        jButton8.setBackground(new java.awt.Color(255, 51, 51));
        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/sair.png"))); // NOI18N
        jButton8.setText("  Sair");
        jButton8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        painelMenuSand.add(jButton8);
        jButton8.setBounds(10, 130, 110, 30);

        jPanel1.add(painelMenuSand);
        painelMenuSand.setBounds(0, 60, 130, 170);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cálculo", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 12))); // NOI18N
        jPanel3.setLayout(null);

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel10.setText("Peso (Kg):");
        jPanel3.add(jLabel10);
        jLabel10.setBounds(20, 30, 70, 15);

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel11.setText("Idade:");
        jPanel3.add(jLabel11);
        jLabel11.setBounds(20, 90, 50, 15);

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel12.setText("Altura (cm):");
        jPanel3.add(jLabel12);
        jLabel12.setBounds(20, 60, 70, 15);

        jTextField1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jPanel3.add(jTextField1);
        jTextField1.setBounds(100, 30, 90, 20);

        jTextField2.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jPanel3.add(jTextField2);
        jTextField2.setBounds(100, 60, 90, 20);

        jTextField3.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jPanel3.add(jTextField3);
        jTextField3.setBounds(100, 90, 90, 20);

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel13.setText("Sexo:");
        jPanel3.add(jLabel13);
        jLabel13.setBounds(20, 120, 40, 15);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Masculino", "Feminino" }));
        jPanel3.add(jComboBox1);
        jComboBox1.setBounds(100, 120, 90, 20);

        jButton3.setBackground(new java.awt.Color(250, 133, 34));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton3.setText("Calcular");
        jPanel3.add(jButton3);
        jButton3.setBounds(280, 110, 110, 30);

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel14.setText("Resultado:");
        jPanel3.add(jLabel14);
        jLabel14.setBounds(300, 20, 70, 20);

        jTextField4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField4.setText("- - -");
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });
        jPanel3.add(jTextField4);
        jTextField4.setBounds(290, 50, 90, 40);

        jPanel1.add(jPanel3);
        jPanel3.setBounds(20, 230, 450, 150);

        homemFormula.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        homemFormula.setText("Homens: 66 + (13,7 x Peso) + (5,0 x Altura) - (6,8 x Idade)");
        jPanel1.add(homemFormula);
        homemFormula.setBounds(40, 170, 350, 15);

        mulherFormula.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        mulherFormula.setText("Mulheres: 665 + (9,6 x Peso) + (1,8 x Altura) - (4,7 x Idade)");
        jPanel1.add(mulherFormula);
        mulherFormula.setBounds(40, 190, 350, 15);

        jLabel4.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel4.setText("O que é:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(20, 70, 60, 15);

        jButton1.setBackground(new java.awt.Color(250, 133, 34));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/menu.png"))); // NOI18N
        jButton1.setBorderPainted(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(10, 10, 50, 50);

        jButton4.setBackground(new java.awt.Color(250, 133, 34));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/iconePerfil (1).png"))); // NOI18N
        jButton4.setBorderPainted(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4);
        jButton4.setBounds(430, 10, 50, 50);

        jLabel15.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel15.setText("<html>Metabolismo basal ou Taxa metabólica basal é um método matemático para calcular a quantidade calórica que o corpo necessita, em vinte e quatro horas, para manter-se nutrido durante o decorrer das atividades diárias sem prejudicar o funcionamento dos principais órgãos\n\n\n\n\n</html>");
        jPanel1.add(jLabel15);
        jLabel15.setBounds(20, 80, 450, 80);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/background3.png"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 500, 400);

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

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        aparece1++;
        if(aparece1%2 == 0){
            homemFormula.setVisible(true);
            mulherFormula.setVisible(true);
        }else{
            homemFormula.setVisible(false);
            mulherFormula.setVisible(false);
        }
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        new Perfil_GUI().setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        aparece2++;
        if(aparece2%2 == 0){
            painelMenuSand.setVisible(true);
        }else{
            painelMenuSand.setVisible(false);      
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        new Home_GUI().setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        new Receitas_GUI().setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        new Mercado_GUI().setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        new ValorNutricional_GUI().setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton6ActionPerformed

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
            java.util.logging.Logger.getLogger(MetabolismoBasal_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MetabolismoBasal_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MetabolismoBasal_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MetabolismoBasal_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MetabolismoBasal_GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel homemFormula;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JLabel mulherFormula;
    private javax.swing.JPanel painelMenuSand;
    // End of variables declaration//GEN-END:variables
}
