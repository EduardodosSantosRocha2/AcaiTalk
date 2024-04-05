/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Windos;

import com.mycompany.Acaitalk.Decorator.Complement;
import com.mycompany.Acaitalk.Decorator.Fruit;
import com.mycompany.Acaitalk.Decorator.IAcai;
import com.mycompany.Acaitalk.Decorator.SweetSauce;
import com.mycompany.Acaitalk.Facade.FacadeAcai;
import com.mycompany.Acaitalk.Factory.IAcaiMaker;
import com.mycompany.Acaitalk.Singleton.IAcaiMakerSingleton;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.*;

/**
 *
 * @author guilh
 */
public class ComprarAcai extends javax.swing.JFrame {
    

    public ComprarAcai() {
        initComponents();
        this.setLocationRelativeTo(null);
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jRadioButtonPequeno = new javax.swing.JRadioButton();
        jRadioButtonGrande = new javax.swing.JRadioButton();
        jRadioButtonMedio = new javax.swing.JRadioButton();
        jRadioButtonExtraGrande = new javax.swing.JRadioButton();
        jCheckBoxMorango = new javax.swing.JCheckBox();
        jCheckBoxBanana = new javax.swing.JCheckBox();
        jCheckBoxKiwi = new javax.swing.JCheckBox();
        jCheckBoxManga = new javax.swing.JCheckBox();
        jCheckBoxAbacaxi = new javax.swing.JCheckBox();
        jCheckBoxMel = new javax.swing.JCheckBox();
        jCheckBoxFrutaVermelhas = new javax.swing.JCheckBox();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jCheckBoxChocolate = new javax.swing.JCheckBox();
        jCheckBoxCaramelo = new javax.swing.JCheckBox();
        jCheckBoxLeiteCondensado = new javax.swing.JCheckBox();
        jCheckBoxGranola = new javax.swing.JCheckBox();
        jCheckBoxLeiteNinho = new javax.swing.JCheckBox();
        jCheckBoxPacoca = new javax.swing.JCheckBox();
        jCheckBoxConfeti = new javax.swing.JCheckBox();
        jCheckBoxGostasChocolate = new javax.swing.JCheckBox();
        jButton1 = new javax.swing.JButton();
        enviar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldPrice = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaDescription = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));

        jPanel1.setBackground(new java.awt.Color(253, 226, 195));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 767, Short.MAX_VALUE)
        );

        jRadioButtonPequeno.setBackground(new java.awt.Color(253, 226, 195));
        buttonGroup2.add(jRadioButtonPequeno);
        jRadioButtonPequeno.setSelected(true);
        jRadioButtonPequeno.setText("Pequeno R$10,00");
        jRadioButtonPequeno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonPequenoActionPerformed(evt);
            }
        });

        jRadioButtonGrande.setBackground(new java.awt.Color(253, 226, 195));
        buttonGroup2.add(jRadioButtonGrande);
        jRadioButtonGrande.setText("Grande R$15,00");

        jRadioButtonMedio.setBackground(new java.awt.Color(253, 226, 195));
        buttonGroup2.add(jRadioButtonMedio);
        jRadioButtonMedio.setText("Medio R$12,00");

        jRadioButtonExtraGrande.setBackground(new java.awt.Color(253, 226, 195));
        buttonGroup2.add(jRadioButtonExtraGrande);
        jRadioButtonExtraGrande.setText("Extra Grande R$20,00");

        jCheckBoxMorango.setBackground(new java.awt.Color(253, 226, 195));
        jCheckBoxMorango.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jCheckBoxMorango.setText("Morango");
        jCheckBoxMorango.setToolTipText("");

        jCheckBoxBanana.setBackground(new java.awt.Color(253, 226, 195));
        jCheckBoxBanana.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jCheckBoxBanana.setText("Banana");

        jCheckBoxKiwi.setBackground(new java.awt.Color(253, 226, 195));
        jCheckBoxKiwi.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jCheckBoxKiwi.setText("Kiwi");

        jCheckBoxManga.setBackground(new java.awt.Color(253, 226, 195));
        jCheckBoxManga.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jCheckBoxManga.setText("Manga");

        jCheckBoxAbacaxi.setBackground(new java.awt.Color(253, 226, 195));
        jCheckBoxAbacaxi.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jCheckBoxAbacaxi.setText("Acabaxi");

        jCheckBoxMel.setBackground(new java.awt.Color(253, 226, 195));
        jCheckBoxMel.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jCheckBoxMel.setText("Mel");

        jCheckBoxFrutaVermelhas.setBackground(new java.awt.Color(253, 226, 195));
        jCheckBoxFrutaVermelhas.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jCheckBoxFrutaVermelhas.setText("Frutas Vermelhas");

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel2.setText("Frutas R$:4,00");

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel5.setText("Tamanhos");

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel6.setText("Calda R$5,00");

        jLabel7.setBackground(new java.awt.Color(0, 0, 0));
        jLabel7.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel7.setText("Complementos RS6,00");

        jCheckBoxChocolate.setBackground(new java.awt.Color(253, 226, 195));
        jCheckBoxChocolate.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jCheckBoxChocolate.setText("Chocolate");

        jCheckBoxCaramelo.setBackground(new java.awt.Color(253, 226, 195));
        jCheckBoxCaramelo.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jCheckBoxCaramelo.setText("Caramelo");

        jCheckBoxLeiteCondensado.setBackground(new java.awt.Color(253, 226, 195));
        jCheckBoxLeiteCondensado.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jCheckBoxLeiteCondensado.setText("Leite Cond.");
        jCheckBoxLeiteCondensado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxLeiteCondensadoActionPerformed(evt);
            }
        });

        jCheckBoxGranola.setBackground(new java.awt.Color(253, 226, 195));
        jCheckBoxGranola.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jCheckBoxGranola.setText("Granola");

        jCheckBoxLeiteNinho.setBackground(new java.awt.Color(253, 226, 195));
        jCheckBoxLeiteNinho.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jCheckBoxLeiteNinho.setText("Leite Ninho");

        jCheckBoxPacoca.setBackground(new java.awt.Color(253, 226, 195));
        jCheckBoxPacoca.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jCheckBoxPacoca.setText("Paçoca");

        jCheckBoxConfeti.setBackground(new java.awt.Color(253, 226, 195));
        jCheckBoxConfeti.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jCheckBoxConfeti.setText("Confeti");

        jCheckBoxGostasChocolate.setBackground(new java.awt.Color(253, 226, 195));
        jCheckBoxGostasChocolate.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jCheckBoxGostasChocolate.setText("Gotas Chocholate");

        jButton1.setText("Realizar Pedido");
        jButton1.setMaximumSize(new java.awt.Dimension(843, 233));
        jButton1.setPreferredSize(new java.awt.Dimension(843, 233));

        enviar.setText("Enviar");
        enviar.setMaximumSize(new java.awt.Dimension(843, 233));
        enviar.setPreferredSize(new java.awt.Dimension(843, 233));
        enviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enviarActionPerformed(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel3.setText("Descrição: ");

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel4.setText("Valor: ");

        jTextFieldPrice.setEditable(false);
        jTextFieldPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPriceActionPerformed(evt);
            }
        });

        jTextAreaDescription.setEditable(false);
        jTextAreaDescription.setColumns(20);
        jTextAreaDescription.setRows(5);
        jScrollPane1.setViewportView(jTextAreaDescription);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(165, 165, 165)
                        .addComponent(jLabel5))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jRadioButtonPequeno, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jCheckBoxBanana, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(124, 124, 124))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel2)
                                                .addGap(55, 55, 55)))
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jCheckBoxLeiteCondensado)
                                            .addComponent(jLabel6)
                                            .addComponent(jCheckBoxMel, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jCheckBoxChocolate, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jCheckBoxFrutaVermelhas)
                                            .addComponent(jCheckBoxCaramelo, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(jRadioButtonGrande, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(28, 28, 28)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jRadioButtonMedio, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jRadioButtonExtraGrande, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(88, 88, 88)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jCheckBoxGranola, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel7)
                                            .addComponent(jCheckBoxLeiteNinho, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jCheckBoxPacoca, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jCheckBoxConfeti, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jCheckBoxGostasChocolate)))))
                            .addComponent(enviar, javax.swing.GroupLayout.PREFERRED_SIZE, 465, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCheckBoxManga, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCheckBoxAbacaxi, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCheckBoxKiwi, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCheckBoxMorango, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 703, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(647, 647, 647)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGap(648, 648, 648)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButtonMedio, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jRadioButtonPequeno))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButtonGrande)
                    .addComponent(jRadioButtonExtraGrande))
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jCheckBoxMorango)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jCheckBoxBanana)
                            .addComponent(jCheckBoxMel)
                            .addComponent(jCheckBoxLeiteNinho))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jCheckBoxKiwi)
                            .addComponent(jCheckBoxFrutaVermelhas)
                            .addComponent(jCheckBoxPacoca))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jCheckBoxManga)
                            .addComponent(jCheckBoxChocolate)
                            .addComponent(jCheckBoxGostasChocolate))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jCheckBoxAbacaxi)
                            .addComponent(jCheckBoxCaramelo)
                            .addComponent(jCheckBoxConfeti)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCheckBoxLeiteCondensado)
                            .addComponent(jCheckBoxGranola))))
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextFieldPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(enviar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(372, 372, 372)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(373, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(216, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 892, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 757, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void enviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enviarActionPerformed
        enviar();
    }//GEN-LAST:event_enviarActionPerformed

    private void jTextFieldPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPriceActionPerformed

    private void jRadioButtonPequenoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonPequenoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButtonPequenoActionPerformed

    private void jCheckBoxLeiteCondensadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxLeiteCondensadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBoxLeiteCondensadoActionPerformed

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
            java.util.logging.Logger.getLogger(ComprarAcai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ComprarAcai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ComprarAcai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ComprarAcai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ComprarAcai().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton enviar;
    private javax.swing.JButton jButton1;
    private javax.swing.JCheckBox jCheckBoxAbacaxi;
    private javax.swing.JCheckBox jCheckBoxBanana;
    private javax.swing.JCheckBox jCheckBoxCaramelo;
    private javax.swing.JCheckBox jCheckBoxChocolate;
    private javax.swing.JCheckBox jCheckBoxConfeti;
    private javax.swing.JCheckBox jCheckBoxFrutaVermelhas;
    private javax.swing.JCheckBox jCheckBoxGostasChocolate;
    private javax.swing.JCheckBox jCheckBoxGranola;
    private javax.swing.JCheckBox jCheckBoxKiwi;
    private javax.swing.JCheckBox jCheckBoxLeiteCondensado;
    private javax.swing.JCheckBox jCheckBoxLeiteNinho;
    private javax.swing.JCheckBox jCheckBoxManga;
    private javax.swing.JCheckBox jCheckBoxMel;
    private javax.swing.JCheckBox jCheckBoxMorango;
    private javax.swing.JCheckBox jCheckBoxPacoca;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jRadioButtonExtraGrande;
    private javax.swing.JRadioButton jRadioButtonGrande;
    private javax.swing.JRadioButton jRadioButtonMedio;
    private javax.swing.JRadioButton jRadioButtonPequeno;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaDescription;
    private javax.swing.JTextField jTextFieldPrice;
    // End of variables declaration//GEN-END:variables

    private void enviar() {
        System.out.println(selectRadio());
        int cont = 0;
        IAcai type = null;

        switch (selectRadio()) {
            case "small":
                IAcaiMakerSingleton singletonSmall = new IAcaiMakerSingleton();
                IAcaiMaker acaiStoreSmall = singletonSmall.getInstance("acaiStore1");
                type = acaiStoreSmall.makeAcai("small");
                FacadeAcai facadeAcaiSmall = new FacadeAcai(type);
                facadeAcaiSmall.ReadyRequest();

                break;
            case "large":
                IAcaiMakerSingleton singletonLarge = new IAcaiMakerSingleton();
                IAcaiMaker acaiStoreLarge = singletonLarge.getInstance("acaiStore1");
                type = acaiStoreLarge.makeAcai("large");
                FacadeAcai facadeAcaiLarge = new FacadeAcai(type);
                facadeAcaiLarge.ReadyRequest();
                break;

            case "medium":
                IAcaiMakerSingleton singletonMedium = new IAcaiMakerSingleton();
                IAcaiMaker acaiStoreMedium = singletonMedium.getInstance("acaiStore1");
                type = acaiStoreMedium.makeAcai("medium");
                FacadeAcai facadeAcaiMedium = new FacadeAcai(type);
                facadeAcaiMedium.ReadyRequest();
                break;

            case "extra large":
                IAcaiMakerSingleton singletonExtraLarge = new IAcaiMakerSingleton();
                IAcaiMaker acaiStoreExtraLarge = singletonExtraLarge.getInstance("acaiStore1");
                type = acaiStoreExtraLarge.makeAcai("extra large");
                FacadeAcai facadeAcaiExtraLarge = new FacadeAcai(type);
                facadeAcaiExtraLarge.ReadyRequest();
                break;
            default:
                System.out.println("Nada selecionado");
        }

        ArrayList<String> selecionados = selectCheckBox();
        
        System.out.println("Selecionados:");
        for (String item : selecionados) {

            if (item.equals("Caramelo") || item.equals("Chocolate") || item.equals("Frutas Vermelhas") || item.equals("Leite Condensado") || item.equals("Mel")) {
                System.out.println("calda "+ item);
                if (cont == 0) {
                    type = new SweetSauce(type, item);
                }else{
                    type = new SweetSauce(type, item);
                }  
            }else if (item.equals("Granola") || item.equals("Paçoca") || item.equals("Confeti") || item.equals("Gotas de Chocolate") || item.equals("Leite Ninho")) {
                System.out.println("Complemento "+ item);
                if (cont == 0) {
                    type = new Complement(type, item);
                }else{
                    type = new Complement(type, item);
                }  
            }else if (item.equals("Abacaxi") || item.equals("Banana") || item.equals("Kiwi") || item.equals("Manga") || item.equals("Morango")) {
                System.out.println("fruta "+ item);
                if (cont == 0) {
                    type = new Fruit(type, item);
                }else{
                    type = new Fruit(type,item);
                } 
            }

            cont++;

        }
        
        
        jTextFieldPrice.setText(""+type.price()); 
        jTextAreaDescription.setText(""+type.getDesc().replaceAll("\\.", "\n"));

    }

    private String selectRadio() {
        String size;

        if (jRadioButtonPequeno.isSelected()) {
            size = "small";
        } else if (jRadioButtonGrande.isSelected()) {
            size = "large";
        } else if (jRadioButtonMedio.isSelected()) {
            size = "medium";
        } else if (jRadioButtonExtraGrande.isSelected()) {
            size = "extra large";
        } else {
            size = "Nenhum selecionado";
        }
        return size;
    }

    private ArrayList<String> selectCheckBox() {

        ArrayList<String> selecionados = new ArrayList<>();

        if (jCheckBoxCaramelo.isSelected()) {
            selecionados.add("Caramelo");
        }
        if (jCheckBoxChocolate.isSelected()) {
            selecionados.add("Chocolate");
        }

        if (jCheckBoxFrutaVermelhas.isSelected()) {
            selecionados.add("Frutas Vermelhas");
        }

        if (jCheckBoxLeiteCondensado.isSelected()) {
            selecionados.add("Leite Condensado");
        }

        if (jCheckBoxMel.isSelected()) {
            selecionados.add("Mel");
        }
        if (jCheckBoxConfeti.isSelected()) {
            selecionados.add("Confeti");
        }

        if (jCheckBoxGostasChocolate.isSelected()) {
            selecionados.add("Gotas de Chocolate");
        }
        if (jCheckBoxGranola.isSelected()) {
            selecionados.add("Granola");
        }

        if (jCheckBoxLeiteNinho.isSelected()) {
            selecionados.add("Leite Ninho");
        }

        if (jCheckBoxPacoca.isSelected()) {
            selecionados.add("Paçoca");
        }
        if (jCheckBoxAbacaxi.isSelected()) {
            selecionados.add("Abacaxi");
        }
        if (jCheckBoxBanana.isSelected()) {
            selecionados.add("Banana");
        }

        if (jCheckBoxKiwi.isSelected()) {
            selecionados.add("Kiwi");
        }

        if (jCheckBoxManga.isSelected()) {
            selecionados.add("Manga");
        }

        if (jCheckBoxMorango.isSelected()) {
            selecionados.add("Morango");
        }

        return selecionados;
    }

}

