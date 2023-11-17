/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MVP;

/**
 *
 * @author usuario
 */
public interface ITablero {

    public void colocaFicha();

    public void tomaPozo();

    public void pasarTurno();

    public void notificarCambioTurno();

    public void actPantallaTableroFicha();
    
    public void actPantallaTableroPozo();

    public void muestraMensajeError();

    public void msjCambioTurno();
}
