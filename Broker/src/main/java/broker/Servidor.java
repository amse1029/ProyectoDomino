/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package broker;

import dominio.FichaJugador;
import dominio.Partida;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author alexa
 */
public class Servidor {

    private ServerSocket server;
//    private Broker broker;
    private static final int PUERTO = 8080;

    public Servidor() {
    }

    public void iniciar(Partida partida) throws IOException {
        try {
            // Crea un servidor socket que escuche en el puerto 8080
            server = new ServerSocket(PUERTO);

            // Espera una conexión entrante de un cliente
            Socket socket = server.accept();

            // Obtiene un objeto de la clase ObjectInputStream para leer los datos del cliente
            ObjectInputStream objectInputStream = new ObjectInputStream(socket.getInputStream());

            // Lee el objeto Partida del cliente
            partida = (Partida) objectInputStream.readObject();

            // Muestra la información de la partida
            System.out.println("Jugadores: " + partida.getJugadores());
            System.out.println("Tablero: " + partida.getTablero());
            System.out.println("Pozo: " + partida.getPozo());
            System.out.println("Cantidad de fichas: " + partida.getCantFichas());

            // Obtiene un objeto de la clase ObjectOutputStream para enviar datos al cliente
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(socket.getOutputStream());

            // Envia la información de la partida al cliente
            objectOutputStream.writeObject(partida);

            // Cierra el socket
            socket.close();
        } catch (Exception e) {

        }
    }

//    public void enviarFicha(FichaJugador ficha) {
//        broker.mandaFicha();
//    }
//    
//    public void actPozo() {
//        broker.mandaPozo();
//    }
//    
//    public void actTablero() {
//        broker.mandaTablero();
//    }
//    
//    public void pasarTurno() {
//        broker.mandaTurno();
//    }
}
