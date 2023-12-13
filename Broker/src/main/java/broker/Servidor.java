/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package broker;

import dominio.Jugador;
import dominio.Partida;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
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
public class Servidor {

    private static final int PUERTO = 8080;
    ServerSocket server;
    private static List<Cliente> clients = new ArrayList();

    public Servidor() throws IOException {
        this.server = new ServerSocket(PUERTO);
    }

    public void iniciar(Partida partida) throws IOException {
        try {

            System.out.println("Servidor de Domino esperando conexiones en el puerto " + PUERTO);

            // Espera una conexión entrante de un cliente
            while (true) {
                Socket clientSocket = server.accept();
                System.out.println("Nuevo jugador conectado");

                Jugador jugador = new Jugador("Jugador" + clients.size());
                Cliente client = new Cliente(clientSocket, clients, jugador);
                clients.add(client);
                new Thread(client).start();

//            while (true) {
//                Socket socket = server.accept();
//
//                // Obtiene un objeto de la clase ObjectInputStream para leer los datos del cliente
//                ObjectInputStream objectInputStream = new ObjectInputStream(socket.getInputStream());
//
//                // Lee el objeto Partida del cliente
//                partida = (Partida) objectInputStream.readObject();
//
//                // Muestra la información de la partida
//                System.out.println("Configuración de la partida");
//                System.out.println("Cantidad de jugadores: " + partida.getCantJugadores());
//                System.out.println("Cantidad de fichas: " + partida.getCantFichas());
//
//                // Obtiene un objeto de la clase ObjectOutputStream para enviar datos al cliente
//                ObjectOutputStream objectOutputStream = new ObjectOutputStream(socket.getOutputStream());
//
//                // Envia la información de la partida al cliente
//                objectOutputStream.writeObject(partida);
//
//                // Cierra el socket
//                socket.close();
            }
        } catch (Exception ex) {
            Logger.getLogger(Servidor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public ServerSocket getServer() {
        return server;
    }

    public void setServer(ServerSocket server) {
        this.server = server;
    }
   
}
