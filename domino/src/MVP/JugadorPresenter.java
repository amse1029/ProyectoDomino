/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MVP;

import GUI.FrmJugador;

/**
 *
 * @author usuario
 */
public class JugadorPresenter implements IJugador {
    
    private FrmJugador frmJugador = new FrmJugador(this);
    private JugadorModel model = new JugadorModel();

    @Override
    public void selectIniciar() {
        model.validarNombre();
    }

    @Override
    public void abrirPantallaJug() {
        frmJugador.abrirPantJugador();
    }
}
