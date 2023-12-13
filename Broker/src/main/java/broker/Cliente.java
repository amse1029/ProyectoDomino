/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package broker;

import dominio.FichaJugador;
import dominio.Jugador;
import dominio.Partida;
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
public class Cliente extends Observable implements Runnable {

    private Socket clientSocket;
    private ObjectOutputStream out;
    private ObjectInputStream in;
    private Broker broker;
    private int puerto;
    private List<Cliente> clients;
    private Jugador jugador;

    public Cliente(Socket clientSocket, List<Cliente> clients, Jugador jugador) {
        this.clientSocket = clientSocket;
        this.clients = clients;
        this.jugador = jugador;
        
        try {
            this.in = (ObjectInputStream) clientSocket.getInputStream();
            this.out = (ObjectOutputStream) clientSocket.getOutputStream();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void unirsePartida(Partida partida) throws Exception {
        // Envia un mensaje al servidor indicando que el jugador quiere unirse a la partida
        out.writeObject("JOIN_PARTIDA");
        out.flush();

        // Recibe un mensaje del servidor indicando si la operación fue exitosa
        String respuesta = (String) in.readObject();
        if (respuesta.equals("OK")) {
            // La operación fue exitosa, el jugador se ha unido a la partida
            System.out.println("Jugador " + jugador.getNombre() + " se ha unido a la partida");
        } else {
            // La operación no fue exitosa, el jugador no pudo unirse a la partida
            System.out.println("El jugador " + jugador.getNombre() + " no pudo unirse a la partida");
        }

//        // Crea un objeto Socket
//        clientSocket = new Socket(("localhost"), 8081);
//
//        // Obtiene un objeto ObjectInputStream para leer los datos del servidor
//        in = new ObjectInputStream(clientSocket.getInputStream());
//
//        // Lee el objeto Partida del servidor
//        partida = (Partida) in.readObject();
//
//        broker.añadirCliente(clientSocket);
//        
//        // Cierra el socket
//        clientSocket.close();
    }

    public Cliente(Socket clientSocket) {
        this.clientSocket = clientSocket;
        try {
            this.out = new ObjectOutputStream(clientSocket.getOutputStream());
            this.in = new ObjectInputStream(clientSocket.getInputStream());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public Cliente(Broker broker, int puerto) {
        this.broker = broker;
        this.puerto = puerto;
    }

    public Socket getClientSocket() {
        return clientSocket;
    }

    public Jugador getJugador() {
        return jugador;
    }

    @Override
    public void run() {
        while (true) {
            try {
                // Recibe un mensaje del servidor
                String mensaje = (String) in.readObject();

                // Procesa el mensaje
                switch (mensaje) {
                    case "JOIN_PARTIDA":
                        // El jugador se ha unido a la partida
                        break;
                    case "OK":
                        // La operación fue exitosa
                        break;
                    case "ERROR":
                        // La operación no fue exitosa
                        break;
                }
            } catch (IOException | ClassNotFoundException e) {
                // Se produjo un error
                e.printStackTrace();
            }
        }

    }

}
