/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;
import MVP.ITablero;
import MVP.TableroPresenter;
import dominio.Ficha;
import javax.swing.JOptionPane;

/**
 *
 * @author alexa
 */
public class FrmTablero extends javax.swing.JFrame {

    private Ficha ficha;
    ITablero tableroPresenter;

    /**
     * Creates new form FrmTablero
     */

    public FrmTablero() {
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

        colocarFicha = new javax.swing.JButton();
        tomarPozo = new javax.swing.JToggleButton();
        pasarTurno = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 153, 0));
        setSize(new java.awt.Dimension(400, 400));

        colocarFicha.setText("ColocarFicha");
        colocarFicha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                colocarFichaActionPerformed(evt);
            }
        });

        tomarPozo.setText("Tomar ficha pozo");

        pasarTurno.setText("Pasar turno");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("TABLERO PARTIDA");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(colocarFicha)
                .addGap(18, 18, 18)
                .addComponent(tomarPozo)
                .addGap(18, 18, 18)
                .addComponent(pasarTurno)
                .addGap(35, 35, 35))
            .addGroup(layout.createSequentialGroup()
                .addGap(112, 112, 112)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 178, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(colocarFicha)
                    .addComponent(tomarPozo)
                    .addComponent(pasarTurno))
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void colocarFichaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_colocarFichaActionPerformed
    /*
        try {
        
        // Creamos un panel con una imagen
        ImagenPanel panel = new ImagenPanel("src\\Resources\\6 0.png");
                 int panelX = (getWidth() - panel.getWidth() - getInsets().left - getInsets().right) / 2;
	    	int panelY = ((getHeight() - panel.getHeight() - getInsets().top - getInsets().bottom) / 2);
        // Creamos un marco y lo añadimos el panel
        this.add(panel).setLocation(panelX, panelY);
        this.pack();
        panel.setSize(30, 40);
        //panel.setVisible(true);
        //this.setVisible(true);
    } catch (IOException ex) {
        Logger.getLogger(FrmTablero.class.getName()).log(Level.SEVERE, null, ex);
    }
         */
    }//GEN-LAST:event_colocarFichaActionPerformed

    public void colocaFicha() {
        tableroPresenter.colocaFicha();
    }

    public void muestraMensajeError() {
        JOptionPane.showMessageDialog(null, "Ha ocurrido un error", "Error",
                JOptionPane.ERROR_MESSAGE);
    }

    public void msjCambioTurno() {
        JOptionPane.showMessageDialog(null, "El jugador cambio de turno", "Advertencia",
                JOptionPane.WARNING_MESSAGE);
    }

    public void actPantallaTableroFicha() {

    }
    
    public void actPantallaTableroPozo() {

    }

    public void tomaPozo() {
        tableroPresenter.tomaPozo();
    }
    
    public void pasarTurno() {
        tableroPresenter.pasarTurno();
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton colocarFicha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton pasarTurno;
    private javax.swing.JToggleButton tomarPozo;
    // End of variables declaration//GEN-END:variables
}
