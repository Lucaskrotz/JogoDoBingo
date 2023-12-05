/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import model.Cartela;
import model.Jogo;
import controller.EscolhaUsuarioGUI;
import model.Jogador;
import model.Cartela;;

/**
 *
 * @author Mauri
 */
public class BingoGUI extends javax.swing.JFrame {

    Jogo jogo = new Jogo();
    
    List<Integer> sorteados = new ArrayList<>();
    
    Cartela cartela = new Cartela();
    
    List<Cartela> cartelas = new ArrayList();
    String nome1;
    String nome2;
    String nome3;
    String nome4;

    public BingoGUI() {
    }

    public BingoGUI(List<Jogador> jogadores) {
        initComponents();
        this.setLocationRelativeTo(null);
            
            for(Jogador j: jogadores){
            cartelas.add(criarCartela(j.getNome(), j.getPosX(), j.getPosY()));
            jogo.setCartelas(cartelas);
            this.add(cartela.gerarLabelFundoCartela(j.getPosX(),j.getPosY()));
            }
            this.add(cartela.gerarLabelFundoCartelaMeio(600, 200));
            this.add(jogo.gerarLabelFundo());
            
    }

    @SuppressWarnings("unchecked")

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jbSorteio = new javax.swing.JButton();
        jlNumeroSorteado = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jbSorteio.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jbSorteio.setText("SORTEAR");
        jbSorteio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSorteioActionPerformed(evt);
            }
        });

        jlNumeroSorteado.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jlNumeroSorteado.setForeground(new java.awt.Color(225, 225, 225));
        jlNumeroSorteado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlNumeroSorteado.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(485, 485, 485)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jlNumeroSorteado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbSorteio, javax.swing.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE))
                .addContainerGap(498, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(jlNumeroSorteado, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jbSorteio, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(343, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void jbSorteioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSorteioActionPerformed
        // TODO add your handling code here:
        Random r = new Random();
        int n = r.nextInt(100);
        while(sorteados.contains(n)){
             n = r.nextInt(100);            
        }
        sorteados.add(n);  
        jlNumeroSorteado.setText(n + "");
        jogo.conferirCartelas(n);
        if (jogo.confereVencedor() != null) {
            JOptionPane.showMessageDialog(null, jogo.confereVencedor().getNome().getText() + " é o vencedor!!!");
        }
    }//GEN-LAST:event_jbSorteioActionPerformed

    private Cartela criarCartela(String nome, int... posicoes) {
        Cartela cartela = new Cartela(nome, posicoes);
        this.add(cartela.getNome());
        for (JLabel l : cartela.getLabels()) {
            this.add(l);
        }
        return cartela;
    }

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
            java.util.logging.Logger.getLogger(BingoGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BingoGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BingoGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BingoGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BingoGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jbSorteio;
    private javax.swing.JLabel jlNumeroSorteado;
    // End of variables declaration//GEN-END:variables
}
