/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package broker;

import socket.Cliente;
import dominio.Jugador;
import dominio.Partida;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author alexa
 */
public class Servidor{
     Partida partida;

    public Servidor() {
        this.partida = new Partida();
    }


   public void crearPartidaServidor(Partida partida){
       this.setPartida(partida);
   }

   public void agregarJugador(String jugador){
       this.partida.getJugadores().add(jugador);
   }
   
   public void unirsePartida(){
       
   }
    public Partida getPartida() {
        return partida;
    }

    public void setPartida(Partida partida) {
        this.partida = partida;
    }
   
   
}
