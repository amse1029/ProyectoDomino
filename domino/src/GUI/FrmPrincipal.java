/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import MVP.IPrincipal;
import MVP.PrincipalPresenter;

/**
 *
 * @author alexa
 */
public class FrmPrincipal extends javax.swing.JFrame {

    private IPrincipal presenter;
    
    /**
     * Creates new form FrmPrincipal
     */
    public FrmPrincipal(IPrincipal presenter) {
        this.presenter = presenter;
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

        pnlFondo = new javax.swing.JPanel();
        lblBienvenido = new javax.swing.JLabel();
        btnCrearPartida = new javax.swing.JButton();
        btnUnirse = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlFondo.setBackground(new java.awt.Color(0, 102, 51));

        lblBienvenido.setFont(new java.awt.Font("Stencil", 0, 36)); // NOI18N
        lblBienvenido.setForeground(new java.awt.Color(255, 255, 255));
        lblBienvenido.setText("Bienvenido");

        btnCrearPartida.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 24)); // NOI18N
        btnCrearPartida.setText("Crear partida");
        btnCrearPartida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearPartidaActionPerformed(evt);
            }
        });

        btnUnirse.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 24)); // NOI18N
        btnUnirse.setText("Unirse a partida");
        btnUnirse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUnirseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlFondoLayout = new javax.swing.GroupLayout(pnlFondo);
        pnlFondo.setLayout(pnlFondoLayout);
        pnlFondoLayout.setHorizontalGroup(
            pnlFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFondoLayout.createSequentialGroup()
                .addGroup(pnlFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlFondoLayout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(btnCrearPartida)
                        .addGap(41, 41, 41)
                        .addComponent(btnUnirse))
                    .addGroup(pnlFondoLayout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(lblBienvenido)))
                .addContainerGap(74, Short.MAX_VALUE))
        );
        pnlFondoLayout.setVerticalGroup(
            pnlFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFondoLayout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(lblBienvenido)
                .addGap(120, 120, 120)
                .addGroup(pnlFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCrearPartida)
                    .addComponent(btnUnirse))
                .addContainerGap(198, Short.MAX_VALUE))
        );

        getContentPane().add(pnlFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 480, 460));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCrearPartidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearPartidaActionPerformed
        this.selectCrearPartida();
    }//GEN-LAST:event_btnCrearPartidaActionPerformed

    private void btnUnirseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUnirseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnUnirseActionPerformed
  
    public void abrirPantalla() {
        this.setVisible(true);
    }

    public void selectCrearPartida() {
        this.dispose();
        presenter.selectCrearPartida();
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCrearPartida;
    private javax.swing.JButton btnUnirse;
    private javax.swing.JLabel lblBienvenido;
    private javax.swing.JPanel pnlFondo;
    // End of variables declaration//GEN-END:variables
}
