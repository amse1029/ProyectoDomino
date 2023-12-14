/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MVP;

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
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author alexa
 */
public class MVPBroker implements IPeticiones,Serializable{
    
    //private Broker broker;
    private Partida partida;
    private String peticion;
    private String nomJugador;
    
//    public MVPBroker(){
//        try {
//            this.broker= new Broker();
//        } catch (IOException ex) {
//            Logger.getLogger(MVPBroker.class.getName()).log(Level.SEVERE, null, ex);
//        }
//    }
    
   public MVPBroker(){
     
   }
    
   public MVPBroker (String peticion, Partida partida){
       this.peticion = peticion;
       this.partida = partida;
       
       
   }
     public MVPBroker (String peticion,String nomJugador){
       this.peticion = peticion;
       this.nomJugador = nomJugador;
      
   }

    public MVPBroker(String peticion) {
        this.peticion = peticion;
      
    }

    public void setPartida(Partida partida) {
        this.partida = partida;
    }

    public void setPeticion(String peticion) {
        this.peticion = peticion;
    }
     
//    public void recibirPartida(Partida partida) throws IOException {
//      this.broker.recibirPartida(partida);
//    }
//    
//    public void getClientesConectados() {
////        this.broker.getClientesConectados();
//    }
    //CONVERTIR ESTO A UNA PETICION AL BROKER YA QUE ESTA EN OTRA MAQUINA
    public ServerSocket getServer() throws IOException {
         try {
             MVPBroker mvp = new MVPBroker (GET_SERVER);
        InetAddress inetAddress = InetAddress.getLocalHost();
        String ipAddress =inetAddress.getHostAddress();
        String ip=ipAddress;
            Socket socket = new Socket (ip,80);
            ObjectOutputStream salidaDatos = new ObjectOutputStream (socket.getOutputStream());
            ObjectInputStream recibirDatos= new ObjectInputStream(socket.getInputStream());
            salidaDatos.writeObject(mvp);//BOLITA
            ServerSocket respuesta = (ServerSocket) recibirDatos.readObject();
             
            socket.close();//ESTO PUDIERA SER UN BREAK
            return respuesta;
        } catch (Exception e) {
            System.out.println(e);
        }
        
        //this.broker = new Broker();
        //return broker.getServer();
        return null;
        
    }

    public String getNomJugador() {
        return nomJugador;
    }
 
//    public Broker getBroker(){
//        return broker;
//        
//    }

    public Partida getPartida() {
        return partida;
    }

//    public void hayPartida() {
//        
//    }
//    
//    public void actTablero() {
//        
//    }
//    
//    public void cambiarTurnoB() {
//        
//    }
//    
//    public void colocaFicha() {
//        
//    }
//    
//    public void tomaPozo() {
//        
//    }
    public String getPeticion() {
        return peticion;
    }

    public void unirsePartida(String peticion,String nomJugador) {
        try {
          MVPBroker mvp = new MVPBroker (peticion,nomJugador);
        InetAddress inetAddress = InetAddress.getLocalHost();
        String ipAddress =inetAddress.getHostAddress();
        String ip=ipAddress;
            Socket socket = new Socket (ip,80);
            ObjectOutputStream salidaDatos = new ObjectOutputStream (socket.getOutputStream());
            salidaDatos.writeObject(mvp);//BOLITA
            //Aqui se puede agregar la vuelta con el ObjectInputStream
            socket.close();//ESTO PUDIERA SER UN BREAK
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
    public void AgregarCliente(){
         try {
             MVPBroker mvp = new MVPBroker (AGREGAR_CLIENTE);
        InetAddress inetAddress = InetAddress.getLocalHost();
        String ipAddress =inetAddress.getHostAddress();
        String ip=ipAddress;
            Socket socket = new Socket (ip,80);
            ObjectOutputStream salidaDatos = new ObjectOutputStream (socket.getOutputStream());
            salidaDatos.writeObject(mvp);//BOLITA
            //Aqui se puede agregar la vuelta con el ObjectInputStream, hay que llamarle a un metodo de model
            socket.close();//ESTO PUDIERA SER UN BREAK
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
    public void actualizarLobbyCrearPartida(String nombre){
        try {
        MVPBroker mvp = new MVPBroker (ACTUALIZAR_LOBBY_CREARPARTIDA);    
        InetAddress inetAddress = InetAddress.getLocalHost();
        String ipAddress =inetAddress.getHostAddress();
        String ip=ipAddress;
            Socket socket = new Socket (ip,80);
            ObjectOutputStream salidaDatos = new ObjectOutputStream (socket.getOutputStream());
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
    
    public void CrearPartida(Partida partida,String peticion){
         //Aqui se puede agregar la vuelta con el ObjectInputStream, hay que llamarle a un metodo de model y la ida
         //con el ObjectOutoutStream
         
         //Crear una interfaz
          try {
              
              
              this.setPeticion(CREAR_PARTIDA);
              this.setPartida(partida);
        InetAddress inetAddress = InetAddress.getLocalHost();
        String ipAddress =inetAddress.getHostAddress();
        String ip=ipAddress;
            Socket socket = new Socket (ip,80);
            ObjectOutputStream salidaDatos = new ObjectOutputStream (socket.getOutputStream());
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
