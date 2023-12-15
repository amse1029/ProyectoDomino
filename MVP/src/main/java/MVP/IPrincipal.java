/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MVP;

import DTO.PartidaDTO;
import java.net.ServerSocket;

/**
 *
 * @author usuario
 */
public interface IPrincipal {
    
    public void selectCrearPartida();
    public void abrirPantConf();
    public void abrirPantPrincipal();
    public void selectUnirsePartida();
    public PartidaDTO verificarPartida();
}
