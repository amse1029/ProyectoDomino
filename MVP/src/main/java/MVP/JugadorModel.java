/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MVP;

import DTO.JugadorDTO;
import DTO.Peticiones;
import dominio.Jugador;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import socket.Cliente;


/**
 *
 * @author usuario
 */
public class JugadorModel {

    private String nombreInicio;
    private JugadorDTO jugador = new JugadorDTO();
    MVPBroker broker = new MVPBroker();
    
    public JugadorModel() {
    }

    public JugadorModel(String nombre) {
        this.jugador = new JugadorDTO(nombre);
    }
    
    public boolean validarNombre(String nombre){
        if(nombre == null || nombre.trim().isEmpty()){
            return false;
        }
        for(char c: nombre.toCharArray()){
            if(!Character.isLetter(c) && !Character.isSpaceChar(c)){
                return false;
            }  
        }
        System.out.println(nombre);
        return true;        
    }
    

    public String getNombreInicio() {
        return nombreInicio;
    }

    public JugadorDTO getJugador() {
        return jugador;
    }

    public void setJugador(JugadorDTO jugador) {
        this.jugador = jugador;
    }

    public MVPBroker getBroker() {
        return broker;
    }

    public void setBroker(MVPBroker broker) {
        this.broker = broker;
    }
    
//    public void getJugadoresPartida() {
//        broker.getClientesConectados();
//    }
    public void unirsePartida() throws IOException{
        Socket socket;
        String ipAddress;
        String ip;
        InetAddress inetAddress = InetAddress.getLocalHost();
        ipAddress =inetAddress.getHostAddress();
        ip=ipAddress;
        socket = new Socket(ip, 8080);
        Cliente cliente = new Cliente(socket);
    }
     public Cliente crearClienteSocket() throws IOException {
         Socket socket = new Socket ("localhost",8080);
         Cliente cliente = new Cliente(socket);
         return cliente;
   }
     public void actualizarLobbyCrearPartida(JugadorDTO jugador){
         broker.actualizarLobbyCrearPartida(jugador.getNombre());
     }
     public void guardaJugador(String nombre) throws IOException {
        Peticiones peticion = null;
        jugador.setNombre(nombre);
        System.out.println(nombre);
        //DE AQUI SE HACE LA PETICION POR MEDIO DEL MVP BROKER
        broker.GuardarJugador(this.jugador,peticion.GUARDAR_JUGADOR);
        //broker.recibirPartida(partida);
    }
}
