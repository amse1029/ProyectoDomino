/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MVP;

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

    private String nombreInicio = "";
    private String avatarInicio = "";
    private Jugador jugador= new Jugador(nombreInicio, avatarInicio);
    MVPBroker broker = new MVPBroker();
    
    public JugadorModel() {
    }

    public JugadorModel(String nombre, String avatar) {
        this.jugador = new Jugador(nombre, avatar);
    }

    public boolean validarNombreAvatar(String nombre, String avatar){
        if(nombre == null || nombre.trim().isEmpty() || (avatar == "" || nombre.trim().isEmpty())){
            return false;
        }
        for(char c: nombre.toCharArray()){
            if(!Character.isLetter(c) && !Character.isSpaceChar(c)){
                return false;
            }  
        }
        guardaJugador(nombre, avatar);
        System.out.println(jugador.getNombre() + " " + jugador.getUrlAvatar());
        return true;        
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
        guardaJugadorNombre(nombre);
        System.out.println(jugador.getNombre());
        return true;        
    }
    
    public void guardaJugador(String name, String avatar){
        jugador.setNombre(name);
        jugador.setUrlAvatar(avatar);
    }
    
    public void guardaJugadorNombre(String name){
        jugador.setNombre(name);
    }

    public String getNombreInicio() {
        return nombreInicio;
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
     public void actualizarLobbyCrearPartida(Jugador jugador){
         broker.actualizarLobbyCrearPartida(jugador.getNombre());
     }
}
