/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package broker;

import MVP.MVPBroker;
import dominio.Partida;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author alexa
 */
public class Broker implements Runnable {
 private ObjectOutputStream out;
    private ObjectInputStream in;
    private static final int PUERTO = 80;
    ServerSocket server;
    private List<Socket> clients;
    Servidor servicios;
    public Broker() throws IOException {
        this.server = new ServerSocket(PUERTO);
        this.clients = new ArrayList();
        this.servicios=new Servidor();
        Thread hilo = new Thread(this);
        hilo.start();
    }
    
//    public void recibirPartida(Partida partida) throws IOException {
//        servidor.iniciar(partida);
//    }
//    
//    public ServerSocket getServer() {
//        return servidor.getServer();
//    }
//    
//    public void añadirCliente(Socket cliente) {
//        clientes.add(cliente);
//    }
//    
//    public void getClientesConectados() {
//        for (Socket cliente : clientes) {
//            System.out.println("El cliente: " + cliente.getLocalAddress()
//                    + " está conectado");
//        }
//    }

//    public void enviarFicha(FichaJugador ficha) {
//        servidor.enviarFicha(ficha);
//        servidor.actTablero();
//    }
//    
//    public void tomaPozo() {
//        servidor.actPozo();
//        servidor.actTablero();
//    }
//    
//    public void pasarTurno() {
//        servidor.pasarTurno();
//        servidor.actTablero();
//    }
//    
//    public void mandaPozo() {
//        cliente.recibePozo();
//    }
//    
//    public void mandaFicha() {
//        cliente.recibeFicha();
//    }
//    
//    public void mandaTablero() {
//        cliente.recibeTablero();
//    }
//    
//    public void mandaTurno() {
//        cliente.pasarTurno();
//    }
    
    public ServerSocket getServer() {
        return server;
    }

    public void setServer(ServerSocket server) {
        this.server = server;
    }
 public  List<Socket> getClients() {
        return clients;
    }
 //se van a mandar los nombres de los jugadores que halla en la lista
 public void notificarClientes(Partida partida){
     for(Socket socket : this.getClients()){
         
     }
 }
    @Override
    public void run() {
        try {
            System.out.println("Servidor de Domino esperando conexiones en el puerto: " + PUERTO);
            
            while(true){
                String request;
                Socket clientSocket = this.getServer().accept();
                request="Haciendo peticion: " + clientSocket.getInetAddress().toString();
                ObjectInputStream recibirDatos= new ObjectInputStream(clientSocket.getInputStream());
                ObjectOutputStream mandarDatos = new ObjectOutputStream(clientSocket.getOutputStream());
                //Esto pudiera dar nulo buzo caperuzo aqui
                MVPBroker peticion = (MVPBroker) recibirDatos.readObject();
                //Que va hacer cuando reciba la partida
                if("AgregarCliente".equals(peticion.getPeticion())){
                    this.getClients().add(clientSocket);
                     System.out.println("Se agrego un nuevo jugador a la lista de clientes");
                }
                if("CrearPartida".equals(peticion.getPeticion())){
                    this.servicios.crearPartidaServidor(peticion.getPartida());
                     System.out.println("Se creo la nueva partida en el servidor");
                     
                }
                if("UnirsePartida".equals(peticion.getPeticion())){
                    this.servicios.agregarJugador(peticion.getNomJugador());
                }
                if("GetServer".equals(peticion.getPeticion())){
                   mandarDatos.writeObject(this.getServer());
                }
                if("ActualizarLobbyCrearPartida".equals(peticion.getPeticion())){
                  this.servicios.agregarJugador(peticion.getNomJugador());
                  System.out.println("Se agrego el jugador a la partida del servidor");
                }
            }
            
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
