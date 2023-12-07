/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package broker;

import dominio.FichaJugador;
import dominio.Partida;
import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author alexa
 */
public class Servidor {
    
    private ServerSocket server;
    private Broker broker;
    private static final int PUERTO = 8080;
    
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(PUERTO);
            System.out.println("Esperando jugadires");

            while (true) {
                Socket clientSocket = serverSocket.accept();
                System.out.println("Cliente conectado");

                // Crea un hilo para manejar la conexión del cliente.
                Thread cliente = new Thread(new Cliente(clientSocket));
                cliente.start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    
    public void iniciar(Partida partida) {
        
    }
    
    public void enviarFicha(FichaJugador ficha) {
        broker.mandaFicha();
    }
    
    public void actPozo() {
        broker.mandaPozo();
    }
    
    public void actTablero() {
        broker.mandaTablero();
    }
    
    public void pasarTurno() {
        broker.mandaTurno();
    }
}
