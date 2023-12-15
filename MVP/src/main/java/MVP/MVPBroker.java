/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MVP;

import DTO.JugadorDTO;
import DTO.PartidaDTO;
import DTO.PeticionDTO;
import DTO.Peticiones;
import broker.Broker;
import dominio.Jugador;
import dominio.Partida;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author alexa
 */
public class MVPBroker implements IPeticiones, Serializable, IMVPBroker{
    
    private PartidaDTO partida;
    private PeticionDTO peticionDTO;
    private JugadorDTO jugador;
    IMVPBroker mvp;
    
    public MVPBroker() {
    }

    public MVPBroker(PeticionDTO peticionDTO, PartidaDTO partidaDTO) {
        this.peticionDTO = peticionDTO;
        this.partida = partidaDTO;
    }

    public MVPBroker(PeticionDTO peticionDTO, JugadorDTO jugador) {
        this.peticionDTO = peticionDTO;
        this.jugador = jugador;
    }

    public MVPBroker(PeticionDTO peticionDTO) {
        this.peticionDTO = peticionDTO;
    }

    public void setPartida(PartidaDTO partida) {
        this.partida = partida;
    }

    public void setPeticion(PeticionDTO peticionDTO) {
        this.peticionDTO = peticionDTO;
    }

    
//    public ServerSocket getServer() throws IOException {
//        try {
//            peticionDTO = new PeticionDTO(Peticiones.GET_SERVER);
//            InetAddress inetAddress = InetAddress.getLocalHost();
//            String ipAddress = inetAddress.getHostAddress();
//            String ip = ipAddress;
//            Socket socket = new Socket(ip, 80);
//            ObjectOutputStream salidaDatos = new ObjectOutputStream(socket.getOutputStream());
//            ObjectInputStream recibirDatos = new ObjectInputStream(socket.getInputStream());
//            salidaDatos.writeObject(peticionDTO);//BOLITA
//            ServerSocket respuesta = (ServerSocket) recibirDatos.readObject();
//
//            socket.close();//ESTO PUDIERA SER UN BREAK
//            return respuesta;
//        } catch (Exception e) {
//            System.out.println(e);
//        }
//        return null;
//    }
    
    public List<String> getIps() throws IOException {
        try {
            peticionDTO = new PeticionDTO(Peticiones.GET_IPS);
            InetAddress inetAddress = InetAddress.getLocalHost();
            String ipAddress = inetAddress.getHostAddress();
            String ip = ipAddress;
            Socket socket = new Socket(ip, 80);
            ObjectOutputStream salidaDatos = new ObjectOutputStream(socket.getOutputStream());
            ObjectInputStream recibirDatos = new ObjectInputStream(socket.getInputStream());
            salidaDatos.writeObject(peticionDTO);//BOLITA
            List<String> respuesta = (List<String>) recibirDatos.readObject();
            socket.close();//ESTO PUDIERA SER UN BREAK
            return respuesta;
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }

    @Override
    public JugadorDTO getJugador() {
        return jugador;
    }

    @Override
    public PartidaDTO getPartida() {
         try {
            peticionDTO = new PeticionDTO(Peticiones.GET_PARTIDA);
            InetAddress inetAddress = InetAddress.getLocalHost();
            String ipAddress = inetAddress.getHostAddress();
            String ip = ipAddress;
            Socket socket = new Socket(ip, 80);
            ObjectOutputStream salidaDatos = new ObjectOutputStream(socket.getOutputStream());
            ObjectInputStream recibirDatos = new ObjectInputStream(socket.getInputStream());
            salidaDatos.writeObject(peticionDTO);//BOLITA
            PartidaDTO respuesta = (PartidaDTO) recibirDatos.readObject();

            socket.close();//ESTO PUDIERA SER UN BREAK
            return respuesta;
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }

    @Override
    public PeticionDTO getPeticionDTO() {
        return peticionDTO;
    }

    public void unirsePartida(Peticiones peticion, JugadorDTO jugadorDTO) {
        try {
            peticionDTO = new PeticionDTO(peticion, jugadorDTO);
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
            peticionDTO = new PeticionDTO(Peticiones.AGREGAR_CLIENTE);
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
//            salidaDatos.writeObject(this.partida.getJugadores());//BOLITA
            // String respuesta = recibirDatos.readUTF();
            //Aqui se puede agregar la vuelta con el ObjectInputStream, hay que llamarle a un metodo de model
            //OTROS metodos para la respuesta
            socket.close();//ESTO PUDIERA SER UN BREAK
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public void CrearPartida(PartidaDTO partida,Peticiones peticion) {
        //Aqui se puede agregar la vuelta con el ObjectInputStream, hay que llamarle a un metodo de model y la ida
        //con el ObjectOutoutStream

        //Crear una interfaz
        try {
            peticionDTO = new PeticionDTO(peticion, partida);
            InetAddress inetAddress = InetAddress.getLocalHost();
            String ipAddress = inetAddress.getHostAddress();
            String ip = ipAddress;
            Socket socket = new Socket(ip, 80);
            ObjectOutputStream salidaDatos = new ObjectOutputStream(socket.getOutputStream());
            salidaDatos.writeObject(peticionDTO);//BOLITA
            //Aqui se puede agregar la vuelta con el ObjectInputStream
            socket.close();//ESTO PUDIERA SER UN BREAK
            //AQUI VA LO DE ACTUALIZAR EL LOBBY
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    public void GuardarJugador(JugadorDTO jugador,Peticiones peticion) {
        //Aqui se puede agregar la vuelta con el ObjectInputStream, hay que llamarle a un metodo de model y la ida
        //con el ObjectOutoutStream

        //Crear una interfaz
        try {
            peticionDTO = new PeticionDTO(peticion, jugador);
            InetAddress inetAddress = InetAddress.getLocalHost();
            String ipAddress = inetAddress.getHostAddress();
            String ip = ipAddress;
            Socket socket = new Socket(ip, 80);
            ObjectOutputStream salidaDatos = new ObjectOutputStream(socket.getOutputStream());
            ObjectInputStream recibirDatos = new ObjectInputStream(socket.getInputStream());
            salidaDatos.writeObject(peticionDTO);//BOLITA
            //Aqui se puede agregar la vuelta con el ObjectInputStream
            socket.close();//ESTO PUDIERA SER UN BREAK
            //AQUI VA LO DE ACTUALIZAR EL LOBBY
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    @Override
    public PartidaDTO partidaIsClosed() {
        return this.getPartida();
    }

    
}
