/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;


import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import model.Jogador;
import model.Cartela;

/**
 *
 * @author Lucas
 */
public class EscolhaUsuarioGUI extends javax.swing.JFrame {
    
    
    ImageIcon fundo = new ImageIcon("Image/FundoIncio.png");
    Cartela cartela = new Cartela();
    
    public EscolhaUsuarioGUI() {
        initComponents();
        esconderComponentes();
       this.add(cartela.gerarLabelFundoCartelaInicio());
       this.setLocationRelativeTo(null);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField4 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jsRoletaJogadores = new javax.swing.JSpinner();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jlJogador1 = new javax.swing.JLabel();
        jlJogador2 = new javax.swing.JLabel();
        jlJogador3 = new javax.swing.JLabel();
        jlJogador4 = new javax.swing.JLabel();
        jtfJogador1 = new javax.swing.JTextField();
        jtfJogador3 = new javax.swing.JTextField();
        jtfJogador4 = new javax.swing.JTextField();
        jtfJogador2 = new javax.swing.JTextField();
        jbConfirmar = new javax.swing.JButton();

        jTextField4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                formPropertyChange(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setText("QUANTIDADE DE JOGADORES:");

        jsRoletaJogadores.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jsRoletaJogadores.setModel(new javax.swing.SpinnerNumberModel(0, 0, 4, 1));
        jsRoletaJogadores.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jsRoletaJogadoresStateChanged(evt);
            }
        });
        jsRoletaJogadores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jsRoletaJogadoresMouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jlJogador1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jlJogador1.setText("Joogador 01:");

        jlJogador2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jlJogador2.setText("Joogador 02:");

        jlJogador3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jlJogador3.setText("Joogador 03:");

        jlJogador4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jlJogador4.setText("Joogador 04:");

        jtfJogador1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jtfJogador1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfJogador1ActionPerformed(evt);
            }
        });

        jtfJogador3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jtfJogador3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfJogador3ActionPerformed(evt);
            }
        });

        jtfJogador4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jtfJogador4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfJogador4ActionPerformed(evt);
            }
        });

        jtfJogador2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jbConfirmar.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jbConfirmar.setText("Começar Jogo");
        jbConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbConfirmarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(192, 192, 192)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jlJogador2)
                    .addComponent(jlJogador1)
                    .addComponent(jlJogador3)
                    .addComponent(jlJogador4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jtfJogador1, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(144, 144, 144)
                                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(60, 60, 60)
                                        .addComponent(jLabel2)
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jtfJogador3, javax.swing.GroupLayout.DEFAULT_SIZE, 253, Short.MAX_VALUE)
                                    .addComponent(jtfJogador4))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(185, 185, 185))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jtfJogador2, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(201, 201, 201))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(299, 299, 299)
                        .addComponent(jsRoletaJogadores, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(353, 353, 353)
                        .addComponent(jbConfirmar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jsRoletaJogadores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jLabel2)
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jlJogador1)
                        .addComponent(jtfJogador1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlJogador2)
                    .addComponent(jtfJogador2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlJogador3)
                    .addComponent(jtfJogador3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlJogador4)
                    .addComponent(jtfJogador4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jbConfirmar)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_formPropertyChange
        // TODO add your handling code here:
        
    }//GEN-LAST:event_formPropertyChange

    private void jsRoletaJogadoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jsRoletaJogadoresMouseClicked
        // TODO add your handling code here:
        
        
        
    }//GEN-LAST:event_jsRoletaJogadoresMouseClicked

    private void jsRoletaJogadoresStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jsRoletaJogadoresStateChanged
        // TODO add your handling code here:
        esconderComponentes();
        if ((int) jsRoletaJogadores.getValue() == 1) {
            jlJogador1.setVisible(true);
            jtfJogador1.setVisible(true);
        }
        if ((int) jsRoletaJogadores.getValue() == 2) {
            jlJogador1.setVisible(true);
            jlJogador2.setVisible(true);
            jtfJogador1.setVisible(true);
            jtfJogador2.setVisible(true);
        }
        if ((int) jsRoletaJogadores.getValue() == 3) {
            jlJogador1.setVisible(true);
            jlJogador2.setVisible(true);
            jlJogador3.setVisible(true);
            jtfJogador1.setVisible(true);
            jtfJogador2.setVisible(true);
            jtfJogador3.setVisible(true);
        }
        if ((int) jsRoletaJogadores.getValue() == 4) {
            jlJogador1.setVisible(true);
            jlJogador2.setVisible(true);
            jlJogador3.setVisible(true);
            jlJogador4.setVisible(true);
            jtfJogador1.setVisible(true);
            jtfJogador2.setVisible(true);
            jtfJogador3.setVisible(true);
            jtfJogador4.setVisible(true);
        }
        
        
    }//GEN-LAST:event_jsRoletaJogadoresStateChanged

    private void jtfJogador1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfJogador1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfJogador1ActionPerformed

    private void jtfJogador3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfJogador3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfJogador3ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jtfJogador4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfJogador4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfJogador4ActionPerformed

    private void jbConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbConfirmarActionPerformed
            List<Jogador> jogadores = new ArrayList();
          
           String nome1 = jtfJogador1.getText();
           String nome2 = jtfJogador2.getText();
           String nome3 = jtfJogador3.getText();
           String nome4 = jtfJogador4.getText();
           if(!nome1.equals("")){
               Jogador jogador1 = new Jogador(jtfJogador1.getText(),30,50);
               jogadores.add(jogador1);
           }
           if(!nome2.equals("")){
                Jogador jogador2 = new Jogador(jtfJogador2.getText(),900,50);
               jogadores.add(jogador2);
           }
           if(!nome3.equals("")){
               Jogador jogador3 = new Jogador(jtfJogador3.getText(),30,400);
               jogadores.add(jogador3);
           }
           if(!nome4.equals("")){
               Jogador jogador4 = new Jogador(jtfJogador4.getText(),900,400);
               jogadores.add(jogador4);
           }
           new BingoGUI(jogadores).setVisible(true);
               
           this.dispose();
    }//GEN-LAST:event_jbConfirmarActionPerformed

    /**
     * @param args the command line arguments
     */
    
    private void gerarLabelNome(String nome, int x, int y){
        JLabel label = new JLabel();
            label.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
            label.setForeground(new java.awt.Color(0, 50, 255));
            label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            label.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 0, 0)));
            label.setText(nome);
            label.setBounds(10, 10, 200, 45);
            this.add(label);
    }
    
    
    private void esconderComponentes() {
        jlJogador1.setVisible(false);
        jlJogador2.setVisible(false);
        jlJogador3.setVisible(false);
        jlJogador4.setVisible(false);
        jtfJogador1.setVisible(false);
        jtfJogador2.setVisible(false);
        jtfJogador3.setVisible(false);
        jtfJogador4.setVisible(false);
    };
    
    
    
    
        
    
    public static void main(String args[]) {
        

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EscolhaUsuarioGUI().setVisible(true);
  
            }
     
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JButton jbConfirmar;
    private javax.swing.JLabel jlJogador1;
    private javax.swing.JLabel jlJogador2;
    private javax.swing.JLabel jlJogador3;
    private javax.swing.JLabel jlJogador4;
    private javax.swing.JSpinner jsRoletaJogadores;
    private javax.swing.JTextField jtfJogador1;
    private javax.swing.JTextField jtfJogador2;
    private javax.swing.JTextField jtfJogador3;
    private javax.swing.JTextField jtfJogador4;
    // End of variables declaration//GEN-END:variables
}
