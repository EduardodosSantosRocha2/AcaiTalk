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
import java.util.ArrayList;

/**
 *
 * @author guilh
 */
public class NewJFrame1 extends javax.swing.JFrame {

    public NewJFrame1() {
        initComponents();
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
        jRadioButtonPequeno.setText("Pequeno");

        jRadioButtonGrande.setBackground(new java.awt.Color(253, 226, 195));
        buttonGroup2.add(jRadioButtonGrande);
        jRadioButtonGrande.setText("Grande");

        jRadioButtonMedio.setBackground(new java.awt.Color(253, 226, 195));
        buttonGroup2.add(jRadioButtonMedio);
        jRadioButtonMedio.setText("Medio");

        jRadioButtonExtraGrande.setBackground(new java.awt.Color(253, 226, 195));
        buttonGroup2.add(jRadioButtonExtraGrande);
        jRadioButtonExtraGrande.setText("Extra Grande");

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
        jCheckBoxFrutaVermelhas.setText("Frutas Ver.");

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel2.setText("Frutas");

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel5.setText("Tamanhos");

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel6.setText("Calda");

        jLabel7.setBackground(new java.awt.Color(0, 0, 0));
        jLabel7.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel7.setText("Complementos");

        jCheckBoxChocolate.setBackground(new java.awt.Color(253, 226, 195));
        jCheckBoxChocolate.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jCheckBoxChocolate.setText("Chocolate");

        jCheckBoxCaramelo.setBackground(new java.awt.Color(253, 226, 195));
        jCheckBoxCaramelo.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jCheckBoxCaramelo.setText("Caramelo");

        jCheckBoxLeiteCondensado.setBackground(new java.awt.Color(253, 226, 195));
        jCheckBoxLeiteCondensado.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jCheckBoxLeiteCondensado.setText("Leite Cond.");

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
        jCheckBoxGostasChocolate.setText("Gotas Choc.");

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jCheckBoxBanana, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(43, 43, 43)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jCheckBoxFrutaVermelhas, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jCheckBoxMel, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(9, 9, 9)
                                                .addComponent(jLabel6))
                                            .addComponent(jCheckBoxChocolate, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jCheckBoxCaramelo, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jCheckBoxLeiteCondensado))
                                        .addGap(25, 25, 25))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jRadioButtonGrande, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(145, 145, 145))
                                    .addComponent(jRadioButtonPequeno, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(28, 28, 28)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jCheckBoxGranola, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jCheckBoxConfeti, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jCheckBoxGostasChocolate, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jRadioButtonExtraGrande, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jRadioButtonMedio, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jCheckBoxPacoca, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(82, 82, 82))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jCheckBoxLeiteNinho, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jCheckBoxManga, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jCheckBoxAbacaxi, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jCheckBoxKiwi, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jCheckBoxMorango, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(290, 290, 290)))
                            .addComponent(enviar, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(165, 165, 165)
                        .addComponent(jLabel5)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(647, 647, 647)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGap(648, 648, 648)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButtonMedio, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jRadioButtonPequeno))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButtonGrande)
                    .addComponent(jRadioButtonExtraGrande))
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jCheckBoxMorango)
                        .addGap(18, 18, 18)
                        .addComponent(jCheckBoxBanana)
                        .addGap(18, 18, 18)
                        .addComponent(jCheckBoxKiwi)
                        .addGap(18, 18, 18)
                        .addComponent(jCheckBoxManga)
                        .addGap(18, 18, 18)
                        .addComponent(jCheckBoxAbacaxi))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCheckBoxGranola, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jCheckBoxLeiteCondensado))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jCheckBoxMel)
                            .addComponent(jCheckBoxLeiteNinho))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jCheckBoxFrutaVermelhas)
                            .addComponent(jCheckBoxPacoca))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jCheckBoxChocolate)
                            .addComponent(jCheckBoxGostasChocolate))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCheckBoxConfeti)
                            .addComponent(jCheckBoxCaramelo))))
                .addGap(18, 18, 18)
                .addComponent(enviar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
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
            java.util.logging.Logger.getLogger(NewJFrame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame1().setVisible(true);
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
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jRadioButtonExtraGrande;
    private javax.swing.JRadioButton jRadioButtonGrande;
    private javax.swing.JRadioButton jRadioButtonMedio;
    private javax.swing.JRadioButton jRadioButtonPequeno;
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
                    type = new SweetSauce(type);
                }else{
                    type = new SweetSauce(type);
                }  
            }else if (item.equals("Granola") || item.equals("Paçoca") || item.equals("Confeti") || item.equals("Gotas de Chocolate") || item.equals("Leite Ninho")) {
                System.out.println("Complemento "+ item);
                if (cont == 0) {
                    type = new Complement(type);
                }else{
                    type = new Complement(type);
                }  
            }else if (item.equals("Abacaxi") || item.equals("Banana") || item.equals("Kiwi") || item.equals("Manga") || item.equals("Morango")) {
                System.out.println("fruta "+ item);
                if (cont == 0) {
                    type = new Fruit(type);
                }else{
                    type = new Fruit(type);
                } 
            }

            cont++;

        }
        
        System.out.println(type.price());
        System.out.println(type.getDesc());

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
