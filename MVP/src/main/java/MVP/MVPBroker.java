/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MVP;

import DTO.IPeticiones;
import DTO.PeticionDTO;
import dominio.Jugador;
import dominio.Partida;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author alexa
 */
public class MVPBroker implements IPeticiones, Serializable, IMVPBroker{
    
    private Partida partida;
    private PeticionDTO peticionDTO;
    private Jugador jugador;
    IMVPBroker mvp;
    
    public MVPBroker() {
    }

    public MVPBroker(PeticionDTO peticionDTO, Partida partida) {
        this.peticionDTO = peticionDTO;
        this.partida = partida;
    }

    public MVPBroker(PeticionDTO peticionDTO, Jugador jugador) {
        this.peticionDTO = peticionDTO;
        this.jugador = jugador;
    }

    public MVPBroker(PeticionDTO peticionDTO) {
        this.peticionDTO = peticionDTO;
    }

    public void setPartida(Partida partida) {
        this.partida = partida;
    }

    public void setPeticion(PeticionDTO peticionDTO) {
        this.peticionDTO = peticionDTO;
    }

    public ServerSocket getServer() throws IOException {
        try {
            mvp = new MVPBroker(peticionDTO);
            InetAddress inetAddress = InetAddress.getLocalHost();
            String ipAddress = inetAddress.getHostAddress();
            String ip = ipAddress;
            Socket socket = new Socket(ip, 80);
            ObjectOutputStream salidaDatos = new ObjectOutputStream(socket.getOutputStream());
            ObjectInputStream recibirDatos = new ObjectInputStream(socket.getInputStream());
            salidaDatos.writeObject(mvp);//BOLITA
            ServerSocket respuesta = (ServerSocket) recibirDatos.readObject();

            socket.close();//ESTO PUDIERA SER UN BREAK
            return respuesta;
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }

    @Override
    public Jugador getJugador() {
        return jugador;
    }

    @Override
    public Partida getPartida() {
        return partida;
    }

    @Override
    public PeticionDTO getPeticionDTO() {
        return peticionDTO;
    }

    public void unirsePartida(PeticionDTO peticion, Jugador jugador) {
        try {
            mvp = new MVPBroker(peticionDTO, jugador);
            InetAddress inetAddress = InetAddress.getLocalHost();
            String ipAddress = inetAddress.getHostAddress();
            String ip = ipAddress;
            Socket socket = new Socket(ip, 80);
            ObjectOutputStream salidaDatos = new ObjectOutputStream(socket.getOutputStream());
            salidaDatos.writeObject(mvp);//BOLITA
            //Aqui se puede agregar la vuelta con el ObjectInputStream
            socket.close();//ESTO PUDIERA SER UN BREAK
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void AgregarCliente() {
        try {
            mvp = new MVPBroker(peticionDTO);
            InetAddress inetAddress = InetAddress.getLocalHost();
            String ipAddress = inetAddress.getHostAddress();
            String ip = ipAddress;
            Socket socket = new Socket(ip, 80);
            ObjectOutputStream salidaDatos = new ObjectOutputStream(socket.getOutputStream());
            salidaDatos.writeObject(mvp);//BOLITA
            //Aqui se puede agregar la vuelta con el ObjectInputStream, hay que llamarle a un metodo de model
            socket.close();//ESTO PUDIERA SER UN BREAK
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void actualizarLobbyCrearPartida(String nombre) {
        try {
            mvp = new MVPBroker(peticionDTO);
            InetAddress inetAddress = InetAddress.getLocalHost();
            String ipAddress = inetAddress.getHostAddress();
            String ip = ipAddress;
            Socket socket = new Socket(ip, 80);
            ObjectOutputStream salidaDatos = new ObjectOutputStream(socket.getOutputStream());
            //ObjectInputStream recibirDatos= new ObjectInputStream(socket.getInputStream());

            salidaDatos.writeObject(this.partida.getJugadores());//BOLITA

            // String respuesta = recibirDatos.readUTF();
            //Aqui se puede agregar la vuelta con el ObjectInputStream, hay que llamarle a un metodo de model
            //OTROS metodos para la respuesta
            socket.close();//ESTO PUDIERA SER UN BREAK
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public void CrearPartida(Partida partida, String peticion) {
        //Aqui se puede agregar la vuelta con el ObjectInputStream, hay que llamarle a un metodo de model y la ida
        //con el ObjectOutoutStream

        //Crear una interfaz
        try {
            mvp = new MVPBroker(peticionDTO, partida);
            InetAddress inetAddress = InetAddress.getLocalHost();
            String ipAddress = inetAddress.getHostAddress();
            String ip = ipAddress;
            Socket socket = new Socket(ip, 80);
            ObjectOutputStream salidaDatos = new ObjectOutputStream(socket.getOutputStream());
            salidaDatos.writeObject(mvp);//BOLITA
            //Aqui se puede agregar la vuelta con el ObjectInputStream
            socket.close();//ESTO PUDIERA SER UN BREAK
            this.AgregarCliente();

            //AQUI VA LO DE ACTUALIZAR EL LOBBY
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
