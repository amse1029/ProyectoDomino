/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import MVP.IJugador;
import javax.swing.JOptionPane;

/**
 *
 * @author alexa
 */
public class FrmJugador extends javax.swing.JFrame {
    
    IJugador presenterJug;
    private String avatarIcono = "";
   
    /**
     * Creates new form FrmJugador
     * @param presenterJug
     */
    public FrmJugador(IJugador presenterJug) {
        this.presenterJug = presenterJug;
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
        btnListo = new javax.swing.JButton();
        txtNombre = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Jugador");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlFondo.setBackground(new java.awt.Color(0, 102, 51));
        pnlFondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblJugador.setFont(new java.awt.Font("Stencil", 0, 36)); // NOI18N
        lblJugador.setForeground(new java.awt.Color(255, 255, 255));
        lblJugador.setText("jugador");
        pnlFondo.add(lblJugador, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, -1, -1));

        lblNombre.setFont(new java.awt.Font("Yu Gothic", 0, 18)); // NOI18N
        lblNombre.setForeground(new java.awt.Color(255, 255, 255));
        lblNombre.setText("Nombre:");
        pnlFondo.add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, -1, -1));

        btnListo.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 24)); // NOI18N
        btnListo.setText("Listo");
        btnListo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListoActionPerformed(evt);
            }
        });
        pnlFondo.add(btnListo, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 200, -1, -1));

        txtNombre.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        pnlFondo.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 130, 206, -1));

        getContentPane().add(pnlFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 410, 360));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
       
    private void btnListoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListoActionPerformed
        this.selectIniciar();
    }//GEN-LAST:event_btnListoActionPerformed

    /**
     * Método que abre la pantalla jugador
     */
    public void abrirPantJugador() {
//        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    /**
     * Método que indica cuando el jugador selecciona "iniciar"
     */
    public void selectIniciar() {
        this.dispose();
        presenterJug.selectIniciar();
        
    }

    /**
     * Método que muestra un mensaje de error
     */
    public void muestraMsjError() {
        JOptionPane.showMessageDialog(null, "Seleccione avatar y un nombre sin caracteres especiales", "Error", 
                JOptionPane.ERROR_MESSAGE);
        abrirPantJugador();
    }
    
    /**
     * Método que obtiene el nombre del jugador
     * @return Nombre del jugador
     */
    public String getTxtNombre(){
        String nombre = txtNombre.getText();
        return nombre;
    }
    
    public String getAvatar(){
        return avatarIcono;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnListo;
    private javax.swing.JLabel lblJugador;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JPanel pnlFondo;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
