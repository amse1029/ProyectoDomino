/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MVP;

import static DTO.IPeticiones.CREAR_PARTIDA;
import DTO.PartidaDTO;
import DTO.Peticiones;
import dominio.Partida;
import java.io.IOException;

/**
 *
 * @author usuario
 */
public class ConfPartidaModel {

    MVPBroker broker = new MVPBroker();
    private int cantFichas;
    private int cantJugadores;
    private PartidaDTO partida;

    public ConfPartidaModel() {
        this.partida = new PartidaDTO(this.cantFichas,this.cantJugadores);
    }

    public ConfPartidaModel(int cantFichas, int cantJugadores) {
        this.partida = new PartidaDTO(this.cantFichas,this.cantJugadores);
        this.cantFichas = cantFichas;
        this.cantJugadores = cantJugadores;
    }

    public ConfPartidaModel(PartidaDTO partida) {
        this.partida = partida;
    }

    public MVPBroker getBroker() {
        return broker;
    }

    public void setBroker(MVPBroker broker) {
        this.broker = broker;
    }

    public int getCantFichas() {
        return cantFichas;
    }

    public void setCantFichas(int cantFichas) {
        this.cantFichas = cantFichas;
    }

    public int getCantJugadores() {
        return cantJugadores;
    }

    public void setCantJugadores(int cantJugadores) {
        this.cantJugadores = cantJugadores;
    }

    public PartidaDTO getPartida() {
        return partida;
    }

    public void setPartida(PartidaDTO partida) {
        this.partida = partida;
    }
    
    /**
     * Método que guarda la configuración de la partida
     * @param cantFichas Cantidad de fichas de la partida
     * @param cantJugadores Cantidad de jugadores en la partida
     */
    public void guardaConfiguracion(int cantFichas, int cantJugadores) throws IOException {
        Peticiones peticion = null;
        partida.setCantFichas(cantFichas);
        partida.setCantJugadores(cantJugadores);
        System.out.println(partida);
        //DE AQUI SE HACE LA PETICION POR MEDIO DEL MVP BROKER
        broker.CrearPartida(this.partida,peticion.CREAR_PARTIDA);
        //broker.recibirPartida(partida);
    }
}
