/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Front;

import java.awt.BorderLayout;

/**
 *
 * @author sebas
 */
public class configuracion extends javax.swing.JFrame {

    /**
     * Creates new form configuracion
     */
    int cq = 1;
    int cantProcs[] = new int[10];
    
    public configuracion() {
        initComponents();
        setLocationRelativeTo(null);
        def();
        /*Estilos*/
        ColorFondo colorFondo = new ColorFondo();
        getContentPane().setLayout(new BorderLayout());
        getContentPane().add(colorFondo, BorderLayout.CENTER);
    }
    
    private void def(){
        Q2.setVisible(false);
        jComboBox3.setVisible(false);
        Q3.setVisible(false);
        jComboBox4.setVisible(false);
        Q4.setVisible(false);
        jComboBox5.setVisible(false);
        Q5.setVisible(false);
        jComboBox6.setVisible(false);
        Q6.setVisible(false);
        jComboBox7.setVisible(false);
        Q7.setVisible(false);
        jComboBox8.setVisible(false);
        Q8.setVisible(false);
        jComboBox9.setVisible(false);
        Q9.setVisible(false);
        jComboBox10.setVisible(false);
        Q10.setVisible(false);
        jComboBox11.setVisible(false);
    }
    
    private void ActcantCola(){
        switch (cq) {
            case 1:
                Q1.setVisible(true);
                jComboBox2.setVisible(true);
                break;
            case 2:
                Q1.setVisible(true);
                jComboBox2.setVisible(true);
                Q2.setVisible(true);
                jComboBox3.setVisible(true);
                break;
            case 3:
                Q1.setVisible(true);
                jComboBox2.setVisible(true);
                Q2.setVisible(true);
                jComboBox3.setVisible(true);
                Q3.setVisible(true);
                jComboBox4.setVisible(true);
                break;
            case 4:
                Q1.setVisible(true);
                jComboBox2.setVisible(true);
                Q2.setVisible(true);
                jComboBox3.setVisible(true);
                Q3.setVisible(true);
                jComboBox4.setVisible(true);
                Q4.setVisible(true);
                jComboBox5.setVisible(true);
                break;
            case 5:
                Q1.setVisible(true);
                jComboBox2.setVisible(true);
                Q2.setVisible(true);
                jComboBox3.setVisible(true);
                Q3.setVisible(true);
                jComboBox4.setVisible(true);
                Q4.setVisible(true);
                jComboBox5.setVisible(true);
                Q5.setVisible(true);
                jComboBox6.setVisible(true);
                break;
            case 6:
                Q1.setVisible(true);
                jComboBox2.setVisible(true);
                Q2.setVisible(true);
                jComboBox3.setVisible(true);
                Q3.setVisible(true);
                jComboBox4.setVisible(true);
                Q4.setVisible(true);
                jComboBox5.setVisible(true);
                Q5.setVisible(true);
                jComboBox6.setVisible(true);
                Q6.setVisible(true);
                jComboBox7.setVisible(true);
                break;
            case 7:
                Q1.setVisible(true);
                jComboBox2.setVisible(true);
                Q2.setVisible(true);
                jComboBox3.setVisible(true);
                Q3.setVisible(true);
                jComboBox4.setVisible(true);
                Q4.setVisible(true);
                jComboBox5.setVisible(true);
                Q5.setVisible(true);
                jComboBox6.setVisible(true);
                Q6.setVisible(true);
                jComboBox7.setVisible(true);
                Q7.setVisible(true);
                jComboBox8.setVisible(true);
                break;
            case 8:
                Q1.setVisible(true);
                jComboBox2.setVisible(true);
                Q2.setVisible(true);
                jComboBox3.setVisible(true);
                Q3.setVisible(true);
                jComboBox4.setVisible(true);
                Q4.setVisible(true);
                jComboBox5.setVisible(true);
                Q5.setVisible(true);
                jComboBox6.setVisible(true);
                Q6.setVisible(true);
                jComboBox7.setVisible(true);
                Q7.setVisible(true);
                jComboBox8.setVisible(true);
                Q8.setVisible(true);
                jComboBox9.setVisible(true);
                break;
            case 9:
                Q1.setVisible(true);
                jComboBox2.setVisible(true);
                Q2.setVisible(true);
                jComboBox3.setVisible(true);
                Q3.setVisible(true);
                jComboBox4.setVisible(true);
                Q4.setVisible(true);
                jComboBox5.setVisible(true);
                Q5.setVisible(true);
                jComboBox6.setVisible(true);
                Q6.setVisible(true);
                jComboBox7.setVisible(true);
                Q7.setVisible(true);
                jComboBox8.setVisible(true);
                Q8.setVisible(true);
                jComboBox9.setVisible(true);
                Q9.setVisible(true);
                jComboBox10.setVisible(true);
                break;
            case 10:
                Q1.setVisible(true);
                jComboBox2.setVisible(true);
                Q2.setVisible(true);
                jComboBox3.setVisible(true);
                Q3.setVisible(true);
                jComboBox4.setVisible(true);
                Q4.setVisible(true);
                jComboBox5.setVisible(true);
                Q5.setVisible(true);
                jComboBox6.setVisible(true);
                Q6.setVisible(true);
                jComboBox7.setVisible(true);
                Q7.setVisible(true);
                jComboBox8.setVisible(true);
                Q8.setVisible(true);
                jComboBox9.setVisible(true);
                Q9.setVisible(true);
                jComboBox10.setVisible(true);
                Q10.setVisible(true);
                jComboBox11.setVisible(true);
                break;
            default:
                throw new AssertionError();
        }
    }
    
    private void getProcesos(){
        int p;
        for (int i = 0; i < cq; i++) {
            switch (i) {
                case 0:
                    p = Integer.parseInt(jComboBox2.getSelectedItem().toString());
                    cantProcs[i]=p;
                    break;
                case 1: 
                    p = Integer.parseInt(jComboBox3.getSelectedItem().toString());
                    cantProcs[i]=p;
                    break;
                case 2:
                    p = Integer.parseInt(jComboBox4.getSelectedItem().toString());
                    cantProcs[i]=p;
                    break;
                case 3:
                    p = Integer.parseInt(jComboBox5.getSelectedItem().toString());
                    cantProcs[i]=p;
                    break;
                case 4:
                    p = Integer.parseInt(jComboBox6.getSelectedItem().toString());
                    cantProcs[i]=p;
                    break;
                case 5:
                    p = Integer.parseInt(jComboBox7.getSelectedItem().toString());
                    cantProcs[i]=p;
                    break;
                case 6:
                    p = Integer.parseInt(jComboBox8.getSelectedItem().toString());
                    cantProcs[i]=p;
                    break;
                case 7:
                    p = Integer.parseInt(jComboBox9.getSelectedItem().toString());
                    cantProcs[i]=p;
                    break;
                case 8:
                    p = Integer.parseInt(jComboBox10.getSelectedItem().toString());
                    cantProcs[i]=p;
                    break;
                case 9:
                    p = Integer.parseInt(jComboBox11.getSelectedItem().toString());
                    cantProcs[i]=p;
                    break;
                default:
                    throw new AssertionError();
            }
        }  
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Q1 = new javax.swing.JLabel();
        Q2 = new javax.swing.JLabel();
        Q3 = new javax.swing.JLabel();
        Q4 = new javax.swing.JLabel();
        Q5 = new javax.swing.JLabel();
        Q6 = new javax.swing.JLabel();
        Q7 = new javax.swing.JLabel();
        Q8 = new javax.swing.JLabel();
        Q9 = new javax.swing.JLabel();
        Q10 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jComboBox3 = new javax.swing.JComboBox<>();
        jComboBox4 = new javax.swing.JComboBox<>();
        jComboBox5 = new javax.swing.JComboBox<>();
        jComboBox6 = new javax.swing.JComboBox<>();
        jComboBox7 = new javax.swing.JComboBox<>();
        jComboBox8 = new javax.swing.JComboBox<>();
        jComboBox9 = new javax.swing.JComboBox<>();
        jComboBox10 = new javax.swing.JComboBox<>();
        jComboBox11 = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cantidad de Colas y Procesos");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Q1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        Q1.setForeground(new java.awt.Color(255, 255, 255));
        Q1.setText("Q[1]");
        getContentPane().add(Q1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, 29));

        Q2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        Q2.setForeground(new java.awt.Color(255, 255, 255));
        Q2.setText("Q[2]");
        getContentPane().add(Q2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, 29));

        Q3.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        Q3.setForeground(new java.awt.Color(255, 255, 255));
        Q3.setText("Q[3]");
        getContentPane().add(Q3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, -1, 29));

        Q4.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        Q4.setForeground(new java.awt.Color(255, 255, 255));
        Q4.setText("Q[4]");
        getContentPane().add(Q4, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 130, -1, 29));

        Q5.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        Q5.setForeground(new java.awt.Color(255, 255, 255));
        Q5.setText("Q[5]");
        getContentPane().add(Q5, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 170, -1, -1));

        Q6.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        Q6.setForeground(new java.awt.Color(255, 255, 255));
        Q6.setText("Q[6]");
        getContentPane().add(Q6, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 210, -1, 20));

        Q7.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        Q7.setForeground(new java.awt.Color(255, 255, 255));
        Q7.setText("Q[7]");
        getContentPane().add(Q7, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 130, 40, 20));

        Q8.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        Q8.setForeground(new java.awt.Color(255, 255, 255));
        Q8.setText("Q[8]");
        getContentPane().add(Q8, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 170, 40, 20));

        Q9.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        Q9.setForeground(new java.awt.Color(255, 255, 255));
        Q9.setText("Q[9]");
        getContentPane().add(Q9, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 210, 40, -1));

        Q10.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        Q10.setForeground(new java.awt.Color(255, 255, 255));
        Q10.setText("Q[10]");
        getContentPane().add(Q10, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 260, 50, 20));

        jComboBox1.setForeground(new java.awt.Color(255, 255, 255));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 30, 74, -1));

        jButton1.setText("OK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 30, -1, -1));

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Cantidad de Colas");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 10, -1, 15));

        jComboBox2.setForeground(new java.awt.Color(255, 255, 255));
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5" }));
        getContentPane().add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, 74, -1));

        jComboBox3.setForeground(new java.awt.Color(255, 255, 255));
        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5" }));
        getContentPane().add(jComboBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, 74, -1));

        jComboBox4.setForeground(new java.awt.Color(255, 255, 255));
        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5" }));
        getContentPane().add(jComboBox4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 210, 74, -1));

        jComboBox5.setForeground(new java.awt.Color(255, 255, 255));
        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5" }));
        jComboBox5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox5ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox5, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 130, 74, -1));

        jComboBox6.setForeground(new java.awt.Color(255, 255, 255));
        jComboBox6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5" }));
        getContentPane().add(jComboBox6, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 170, 74, -1));

        jComboBox7.setForeground(new java.awt.Color(255, 255, 255));
        jComboBox7.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5" }));
        getContentPane().add(jComboBox7, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 210, 74, -1));

        jComboBox8.setForeground(new java.awt.Color(255, 255, 255));
        jComboBox8.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5" }));
        getContentPane().add(jComboBox8, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 130, 74, -1));

        jComboBox9.setForeground(new java.awt.Color(255, 255, 255));
        jComboBox9.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5" }));
        getContentPane().add(jComboBox9, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 170, 74, -1));

        jComboBox10.setForeground(new java.awt.Color(255, 255, 255));
        jComboBox10.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5" }));
        jComboBox10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox10ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox10, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 210, 74, -1));

        jComboBox11.setForeground(new java.awt.Color(255, 255, 255));
        jComboBox11.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5" }));
        getContentPane().add(jComboBox11, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 260, 74, -1));

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Cantidad de Procesos x Cola");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 70, -1, -1));

        jButton2.setText("Confirmar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 320, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        cq=Integer.parseInt(jComboBox1.getSelectedItem().toString());
        def();
        ActcantCola();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jComboBox5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox5ActionPerformed

    private void jComboBox10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox10ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        getProcesos();
        VistaPlanificador f1 = new VistaPlanificador();
        
        f1.setConfig(cq, cantProcs);
        
        this.setVisible(false);
        f1.setVisible(true);
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
            java.util.logging.Logger.getLogger(configuracion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(configuracion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(configuracion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(configuracion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new configuracion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Q1;
    private javax.swing.JLabel Q10;
    private javax.swing.JLabel Q2;
    private javax.swing.JLabel Q3;
    private javax.swing.JLabel Q4;
    private javax.swing.JLabel Q5;
    private javax.swing.JLabel Q6;
    private javax.swing.JLabel Q7;
    private javax.swing.JLabel Q8;
    private javax.swing.JLabel Q9;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox10;
    private javax.swing.JComboBox<String> jComboBox11;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JComboBox<String> jComboBox5;
    private javax.swing.JComboBox<String> jComboBox6;
    private javax.swing.JComboBox<String> jComboBox7;
    private javax.swing.JComboBox<String> jComboBox8;
    private javax.swing.JComboBox<String> jComboBox9;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
