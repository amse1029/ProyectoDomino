/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package socket;

import DTO.JugadorDTO;
import broker.Broker;
import dominio.FichaJugador;
import dominio.Jugador;
import dominio.Partida;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.List;
import java.util.Observable;

/**
 *
 * @author alexa
 */
public class Cliente {
    
    private Broker broker;
    private JugadorDTO jugador;

    public Cliente(JugadorDTO jugador) {
        this.jugador = jugador;
        Thread hilo =  new Thread();
        hilo.start();

    }

    public JugadorDTO getJugador() {
        return jugador;
    }

//    @Override
//    public void run() {
//        while (true) {
//            try {      
//                
//                ObjectInputStream recibirDatos = new ObjectInputStream(clientSocket.getInputStream());
//            } catch (Exception e) {
//                // Se produjo un error
//                e.printStackTrace();
//            }
//        }
//
//    }

}
