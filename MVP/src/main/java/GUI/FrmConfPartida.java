/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import MVP.IConfPartida;
import MVP.ConfPartidaPresenter;
import javax.swing.JOptionPane;

/**
 *
 * @author alexa
 */
public class FrmConfPartida extends javax.swing.JFrame {

    IConfPartida presenter;
//    ConfPartidaPresenter confPartidaPresenter;
    
//    private int cantFichas;
//    private int cantJugadores;
    
    /**
     * Creates new form FrmConfPartida
     */
    public FrmConfPartida(IConfPartida presenter) {
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
        lblConf = new javax.swing.JLabel();
        lblCantFichas = new javax.swing.JLabel();
        lblCantJug = new javax.swing.JLabel();
        cbxFichas = new javax.swing.JComboBox<>();
        btnGuardar = new javax.swing.JButton();
        cbxJugadores = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlFondo.setBackground(new java.awt.Color(0, 102, 51));

        lblConf.setFont(new java.awt.Font("Stencil", 0, 36)); // NOI18N
        lblConf.setForeground(new java.awt.Color(255, 255, 255));
        lblConf.setText("Configuración de la partida");

        lblCantFichas.setFont(new java.awt.Font("Yu Gothic", 0, 18)); // NOI18N
        lblCantFichas.setForeground(new java.awt.Color(255, 255, 255));
        lblCantFichas.setText("Cantidad de fichas (2-7)");

        lblCantJug.setFont(new java.awt.Font("Yu Gothic", 0, 18)); // NOI18N
        lblCantJug.setForeground(new java.awt.Color(255, 255, 255));
        lblCantJug.setText("Cantidad de jugadores");

        cbxFichas.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N
        cbxFichas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2", "3", "4", "5", "6", "7" }));

        btnGuardar.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 24)); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        cbxJugadores.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N
        cbxJugadores.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2", "3", "4" }));
        cbxJugadores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxJugadoresActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlFondoLayout = new javax.swing.GroupLayout(pnlFondo);
        pnlFondo.setLayout(pnlFondoLayout);
        pnlFondoLayout.setHorizontalGroup(
            pnlFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFondoLayout.createSequentialGroup()
                .addGroup(pnlFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlFondoLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(lblConf))
                    .addGroup(pnlFondoLayout.createSequentialGroup()
                        .addGroup(pnlFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlFondoLayout.createSequentialGroup()
                                .addGap(81, 81, 81)
                                .addComponent(lblCantJug))
                            .addGroup(pnlFondoLayout.createSequentialGroup()
                                .addGap(126, 126, 126)
                                .addComponent(cbxJugadores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(63, 63, 63)
                        .addGroup(pnlFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCantFichas, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(pnlFondoLayout.createSequentialGroup()
                                .addGap(61, 61, 61)
                                .addComponent(cbxFichas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(48, 48, 48))))
                    .addGroup(pnlFondoLayout.createSequentialGroup()
                        .addGap(230, 230, 230)
                        .addComponent(btnGuardar)))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        pnlFondoLayout.setVerticalGroup(
            pnlFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFondoLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(lblConf)
                .addGap(43, 43, 43)
                .addGroup(pnlFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlFondoLayout.createSequentialGroup()
                        .addComponent(lblCantFichas)
                        .addGap(18, 18, 18)
                        .addComponent(cbxFichas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 136, Short.MAX_VALUE)
                        .addComponent(btnGuardar)
                        .addGap(30, 30, 30))
                    .addGroup(pnlFondoLayout.createSequentialGroup()
                        .addComponent(lblCantJug)
                        .addGap(26, 26, 26)
                        .addComponent(cbxJugadores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        getContentPane().add(pnlFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 400));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        this.selectGuardar();
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void cbxJugadoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxJugadoresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxJugadoresActionPerformed
    
    /**
     * Método que abre la pantalla de configuración partida
     */
    public void abrirPantConf() {
        this.setVisible(true);
    }
    
    /**
     * Método que indica que guarda la configuración de la partida
     */
    public void selectGuardar() {
        this.dispose();
        try {
            int cantFichas = Integer.parseInt((String) this.cbxFichas.getSelectedItem());
            int cantJugadores = Integer.parseInt((String) this.cbxJugadores.getSelectedItem());
            presenter.selectGuardar(cantFichas, cantJugadores);
            this.abrirPantJug();
        } catch (Exception e) {
            this.muestraMsjError();
        }

    }

    /**
     * Método que abre la pantalla del jugador
     */
    public void abrirPantJug(){
       presenter.abrirPantallaJugador();
    }
    
    /**
     * Método que muestra un mensaje de error
     */
    public void muestraMsjError() {
        JOptionPane.showMessageDialog(null, "Ha ocurrido un error", "Error", 
                JOptionPane.ERROR_MESSAGE);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardar;
    private javax.swing.JComboBox<String> cbxFichas;
    private javax.swing.JComboBox<String> cbxJugadores;
    private javax.swing.JLabel lblCantFichas;
    private javax.swing.JLabel lblCantJug;
    private javax.swing.JLabel lblConf;
    private javax.swing.JPanel pnlFondo;
    // End of variables declaration//GEN-END:variables
}