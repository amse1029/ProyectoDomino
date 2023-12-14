/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MVP;

import java.net.ServerSocket;

/**
 *
 * @author alexa
 */
public class PrincipalModel {
    
    MVPBroker broker = new MVPBroker();
    
    public ServerSocket getServer() {
        return broker.getServer();
    }
}
