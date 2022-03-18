
package com.mycompany.swingabas1;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.Date;
import java.util.Locale;

/**
 *
 * @author Victoria Santos
 */
public class TelaAbas1 extends javax.swing.JFrame {

    /**
     * Abaixo está o Método construtor
     * Nele podem ser colocados algumas alterações manuais
     * como mudar o background das abas, mudar a visibilidade dos objetos
     * tamanho e cor das fontes dentre outras.
     */
    public TelaAbas1() {
        initComponents();
    }

    /**
     * Esse método é chamado junto ao método construtor.
     * ATENÇÃO: NÃO MODIFIQUE esse método. O conteúdo deste método
     * é gerado pelo  Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlTela = new javax.swing.JTabbedPane();
        pnlData = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btnData = new javax.swing.JButton();
        lblData = new javax.swing.JLabel();
        pnlIdioma = new javax.swing.JPanel();
        lblIdioma = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnIdioma = new javax.swing.JButton();
        pnlResolucao = new javax.swing.JPanel();
        lblResolucao = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnResolucao = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);

        pnlTela.setDoubleBuffered(true);
        pnlTela.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\victo\\Downloads\\relogio.png")); // NOI18N

        btnData.setBackground(javax.swing.UIManager.getDefaults().getColor("Table.dropLineShortColor"));
        btnData.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnData.setForeground(new java.awt.Color(51, 51, 51));
        btnData.setText("Clique aqui para ver!");
        btnData.setBorderPainted(false);
        btnData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDataActionPerformed(evt);
            }
        });

        lblData.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblData.setForeground(new java.awt.Color(0, 0, 153));

        javax.swing.GroupLayout pnlDataLayout = new javax.swing.GroupLayout(pnlData);
        pnlData.setLayout(pnlDataLayout);
        pnlDataLayout.setHorizontalGroup(
            pnlDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDataLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnData)
                    .addComponent(lblData, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(74, Short.MAX_VALUE))
        );
        pnlDataLayout.setVerticalGroup(
            pnlDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDataLayout.createSequentialGroup()
                .addGroup(pnlDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlDataLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlDataLayout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(btnData, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(lblData, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pnlTela.addTab("Data e Hora", pnlData);

        lblIdioma.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblIdioma.setForeground(new java.awt.Color(0, 0, 153));

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\victo\\Downloads\\earth.png")); // NOI18N

        btnIdioma.setBackground(javax.swing.UIManager.getDefaults().getColor("Table.dropLineShortColor"));
        btnIdioma.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnIdioma.setForeground(new java.awt.Color(51, 51, 51));
        btnIdioma.setText("Clique aqui para ver!");
        btnIdioma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIdiomaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlIdiomaLayout = new javax.swing.GroupLayout(pnlIdioma);
        pnlIdioma.setLayout(pnlIdiomaLayout);
        pnlIdiomaLayout.setHorizontalGroup(
            pnlIdiomaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlIdiomaLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addGap(38, 38, 38)
                .addGroup(pnlIdiomaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnIdioma)
                    .addComponent(lblIdioma, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(107, Short.MAX_VALUE))
        );
        pnlIdiomaLayout.setVerticalGroup(
            pnlIdiomaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlIdiomaLayout.createSequentialGroup()
                .addGroup(pnlIdiomaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlIdiomaLayout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(btnIdioma, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(lblIdioma, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlIdiomaLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pnlTela.addTab("Idioma", pnlIdioma);

        lblResolucao.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblResolucao.setForeground(new java.awt.Color(0, 0, 153));

        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\victo\\Downloads\\monitor2.png")); // NOI18N

        btnResolucao.setBackground(javax.swing.UIManager.getDefaults().getColor("Table.dropLineShortColor"));
        btnResolucao.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnResolucao.setForeground(new java.awt.Color(51, 51, 51));
        btnResolucao.setText("Clique aqui para ver!");
        btnResolucao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResolucaoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlResolucaoLayout = new javax.swing.GroupLayout(pnlResolucao);
        pnlResolucao.setLayout(pnlResolucaoLayout);
        pnlResolucaoLayout.setHorizontalGroup(
            pnlResolucaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlResolucaoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addGap(29, 29, 29)
                .addGroup(pnlResolucaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnResolucao)
                    .addComponent(lblResolucao, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(108, Short.MAX_VALUE))
        );
        pnlResolucaoLayout.setVerticalGroup(
            pnlResolucaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlResolucaoLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlResolucaoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnResolucao, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(lblResolucao, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59))
        );

        pnlTela.addTab("Resolução da tela", pnlResolucao);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("INFORMAÇÕES DO SISTEMA");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(pnlTela, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(109, 109, 109)
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(pnlTela, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
     
    private void btnIdiomaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIdiomaActionPerformed
        Locale lang = Locale.getDefault();
        lblIdioma.setText(lang.getDisplayLanguage());
    }//GEN-LAST:event_btnIdiomaActionPerformed

    private void btnResolucaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResolucaoActionPerformed
        Toolkit tk= Toolkit.getDefaultToolkit();
        Dimension d= tk.getScreenSize();
        lblResolucao.setText(d.width+" X "+d.height);
    }//GEN-LAST:event_btnResolucaoActionPerformed

    private void btnDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDataActionPerformed
        Date relogio = new Date();
        lblData.setText(relogio.toString());
    }//GEN-LAST:event_btnDataActionPerformed
    
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
            java.util.logging.Logger.getLogger(TelaAbas1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaAbas1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaAbas1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaAbas1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaAbas1().setVisible(true);
                
            }
        });    
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnData;
    private javax.swing.JButton btnIdioma;
    private javax.swing.JButton btnResolucao;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel lblData;
    private javax.swing.JLabel lblIdioma;
    private javax.swing.JLabel lblResolucao;
    private javax.swing.JPanel pnlData;
    private javax.swing.JPanel pnlIdioma;
    private javax.swing.JPanel pnlResolucao;
    private javax.swing.JTabbedPane pnlTela;
    // End of variables declaration//GEN-END:variables

}
