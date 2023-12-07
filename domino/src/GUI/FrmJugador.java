/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import MVP.IJugador;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

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
        lblAvatar = new javax.swing.JLabel();
        btnListo = new javax.swing.JButton();
        txtNombre = new javax.swing.JTextField();
        btnAvatar1 = new javax.swing.JButton();
        btnAvatar2 = new javax.swing.JButton();
        btnAvatar3 = new javax.swing.JButton();
        btnAvatar4 = new javax.swing.JButton();

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

        txtNombre.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        btnAvatar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/avatar5.png"))); // NOI18N
        btnAvatar1.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btnAvatar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAvatar1ActionPerformed(evt);
            }
        });

        btnAvatar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/avatar6.png"))); // NOI18N
        btnAvatar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAvatar2ActionPerformed(evt);
            }
        });

        btnAvatar3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/avatar7.png"))); // NOI18N
        btnAvatar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAvatar3ActionPerformed(evt);
            }
        });

        btnAvatar4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/avatar8.png"))); // NOI18N
        btnAvatar4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAvatar4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlFondoLayout = new javax.swing.GroupLayout(pnlFondo);
        pnlFondo.setLayout(pnlFondoLayout);
        pnlFondoLayout.setHorizontalGroup(
            pnlFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFondoLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(pnlFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlFondoLayout.createSequentialGroup()
                        .addComponent(lblAvatar)
                        .addGap(18, 18, 18)
                        .addComponent(btnAvatar1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnAvatar2, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlFondoLayout.createSequentialGroup()
                        .addComponent(lblNombre)
                        .addGap(26, 26, 26)
                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlFondoLayout.createSequentialGroup()
                        .addComponent(btnAvatar3, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAvatar4, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnListo))
                .addContainerGap(48, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlFondoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblJugador)
                .addGap(283, 283, 283))
        );
        pnlFondoLayout.setVerticalGroup(
            pnlFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFondoLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(lblJugador)
                .addGap(39, 39, 39)
                .addGroup(pnlFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAvatar2, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAvatar3, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAvatar4, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblAvatar)
                        .addComponent(btnAvatar1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(pnlFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNombre)
                    .addComponent(btnListo))
                .addGap(34, 34, 34))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlFondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
       
    private void btnListoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListoActionPerformed
        this.selectIniciar();
    }//GEN-LAST:event_btnListoActionPerformed

    private void btnAvatar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAvatar1ActionPerformed
        avatarIcono = "avatar5.png";
    }//GEN-LAST:event_btnAvatar1ActionPerformed

    private void btnAvatar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAvatar2ActionPerformed
        avatarIcono = "avatar6.png";
    }//GEN-LAST:event_btnAvatar2ActionPerformed

    private void btnAvatar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAvatar3ActionPerformed
        avatarIcono = "avatar7.png";
    }//GEN-LAST:event_btnAvatar3ActionPerformed

    private void btnAvatar4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAvatar4ActionPerformed
        avatarIcono = "avatar8.png";
    }//GEN-LAST:event_btnAvatar4ActionPerformed

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
        JOptionPane.showMessageDialog(null, "Seleccione avatar y un nombre sin caracteres especiales   ", "Error", 
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
    private javax.swing.JButton btnAvatar1;
    private javax.swing.JButton btnAvatar2;
    private javax.swing.JButton btnAvatar3;
    private javax.swing.JButton btnAvatar4;
    private javax.swing.JButton btnListo;
    private javax.swing.JLabel lblAvatar;
    private javax.swing.JLabel lblJugador;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JPanel pnlFondo;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
