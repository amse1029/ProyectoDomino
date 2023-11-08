/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import javax.swing.JOptionPane;

/**
 *
 * @author alexa
 */
public class FrmJugador extends javax.swing.JFrame {

    /**
     * Creates new form FrmJugador
     */
    public FrmJugador() {
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
        lblJugador = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblAvatar = new javax.swing.JLabel();
        btnListo = new javax.swing.JButton();
        txtNombre = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlFondo.setBackground(new java.awt.Color(0, 102, 51));

        lblJugador.setFont(new java.awt.Font("Stencil", 0, 36)); // NOI18N
        lblJugador.setForeground(new java.awt.Color(255, 255, 255));
        lblJugador.setText("jugador");

        lblNombre.setFont(new java.awt.Font("Yu Gothic", 0, 18)); // NOI18N
        lblNombre.setForeground(new java.awt.Color(255, 255, 255));
        lblNombre.setText("Nombre:");

        lblAvatar.setFont(new java.awt.Font("Yu Gothic", 0, 18)); // NOI18N
        lblAvatar.setForeground(new java.awt.Color(255, 255, 255));
        lblAvatar.setText("Seleccione un avatar:");

        btnListo.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 24)); // NOI18N
        btnListo.setText("Listo");
        btnListo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlFondoLayout = new javax.swing.GroupLayout(pnlFondo);
        pnlFondo.setLayout(pnlFondoLayout);
        pnlFondoLayout.setHorizontalGroup(
            pnlFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFondoLayout.createSequentialGroup()
                .addGroup(pnlFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlFondoLayout.createSequentialGroup()
                        .addGap(131, 131, 131)
                        .addComponent(lblJugador))
                    .addGroup(pnlFondoLayout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(pnlFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlFondoLayout.createSequentialGroup()
                                .addComponent(lblNombre)
                                .addGap(27, 27, 27)
                                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblAvatar)))
                    .addGroup(pnlFondoLayout.createSequentialGroup()
                        .addGap(160, 160, 160)
                        .addComponent(btnListo)))
                .addContainerGap(103, Short.MAX_VALUE))
        );
        pnlFondoLayout.setVerticalGroup(
            pnlFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFondoLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(lblJugador)
                .addGap(37, 37, 37)
                .addComponent(lblAvatar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 106, Short.MAX_VALUE)
                .addGroup(pnlFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombre)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54)
                .addComponent(btnListo)
                .addGap(35, 35, 35))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlFondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnListoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListoActionPerformed
        FrmLobby lobby = new FrmLobby();
        lobby.setVisible(true);
    }//GEN-LAST:event_btnListoActionPerformed

    public void abrirPantJugador() {
         FrmJugador frm = new FrmJugador();
        frm.setVisible(true);
    }

    public void selectIniciar() {
    }

    public void muestraMsjError() {
        JOptionPane.showMessageDialog(null, "Ha ocurrido un error", "Error", 
                JOptionPane.ERROR_MESSAGE);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnListo;
    private javax.swing.JLabel lblAvatar;
    private javax.swing.JLabel lblJugador;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JPanel pnlFondo;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
