/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package broker;

import DTO.PeticionDTO;
import DTO.Peticiones;
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
    Peticiones peticion;
    PeticionDTO peticionDTO;

    public Broker() throws IOException {
        this.server = new ServerSocket(PUERTO);
        this.clients = new ArrayList();
        this.servicios = new Servidor();
        Thread hilo = new Thread(this);
        hilo.start();
    }
    
    public ServerSocket getServer() {
        return server;
    }

    public void setServer(ServerSocket server) {
        this.server = server;
    }

    public List<Socket> getClients() {
        return clients;
    }
    //se van a mandar los nombres de los jugadores que halla en la lista

    public void notificarClientes(Partida partida) {
        for (Socket socket : this.getClients()) {

        }
    }

    @Override
    public void run() {
        try {
            System.out.println("Servidor de Domino esperando conexiones en el puerto: " + PUERTO);

            while (true) {
                String request;
                Socket clientSocket = this.getServer().accept();
                request = "Haciendo peticion: " + clientSocket.getInetAddress().toString();
                ObjectInputStream recibirDatos = new ObjectInputStream(clientSocket.getInputStream());
                ObjectOutputStream mandarDatos = new ObjectOutputStream(clientSocket.getOutputStream());
                //Esto pudiera dar nulo buzo caperuzo aqui
                peticionDTO = (PeticionDTO) recibirDatos.readObject();
                //Que va hacer cuando reciba la partida
                if (peticionDTO.getPeticion().equals(Peticiones.CREAR_PARTIDA)) {
                    this.servicios.crearPartidaServidor(peticionDTO.getPartidaDTO());
//                    System.out.println("Se agrego el jugador a la partida del servidor");
                    System.out.println("Se creo la nueva partida en el servidor");
//                    this.getClients().add(clientSocket); 
//                    System.out.println("Se agrego el cliente a la lista de sockets");
                }
                if (peticionDTO.getPeticion().equals(Peticiones.UNIRSE_PARTIDA)) {
                    this.servicios.agregarJugador(peticionDTO.getJugadorDTO());
                    //System.out.println(this.servicios.partidaDTO.toString());
                }
                if (peticionDTO.getPeticion().equals(Peticiones.AGREGAR_CLIENTE)) {
                     this.getClients().add(clientSocket); 
                     System.out.println("Se agrego el cliente a la lista de sockets");
                }
                if (peticionDTO.getPeticion().equals(Peticiones.GET_IPS)) {
                    List <String> ips = new ArrayList();
                    
                    for (int i = 0; i < this.getClients().size(); i++) {
                     ips.add(this.getClients().get(i).getLocalAddress().getHostName());
                    }
                     mandarDatos.writeObject(ips);
                    System.out.println("Se estan mandando la lista de jugadores");
                }
                if (peticionDTO.getPeticion().equals(Peticiones.GET_PARTIDA)) {
                    mandarDatos.writeObject(this.servicios.getPartida());
                    System.out.println("Si se manda la partida para validar, YUJUU");
                }
                if (peticionDTO.getPeticion().equals(Peticiones.GUARDAR_JUGADOR)) {
                    this.servicios.agregarJugador(peticionDTO.getJugadorDTO());
                    System.out.println("Se agrego al jugador: " + peticionDTO.getJugadorDTO());
                    //System.out.println(this.servicios.partidaDTO.toString());
                    this.getClients().add(clientSocket);
                    System.out.println("Se agrego el cliente a la lista de sockets");
                    for (int i = 1; i < clients.size(); i++) {
                        System.out.println("Cliente conectado con ip: " + clients.get(i).getLocalAddress().getHostName());
                    }
                }
            }
//PROBANDO GITHUB
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
