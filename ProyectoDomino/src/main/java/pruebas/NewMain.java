/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pruebas;

import broker.Broker;
import java.io.IOException;

/**
 *
 * @author alexa
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        Broker broker = new Broker();
//        broker.getServer().close();
        if(broker.getServer().isClosed()) {
            System.out.println("error");
        } else {
            System.out.println("server abierto");
        }
    }
    
}
