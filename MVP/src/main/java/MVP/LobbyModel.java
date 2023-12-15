/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MVP;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author usuario
 */
public class LobbyModel {
    List <String> nombres;
    MVPBroker mvp = new MVPBroker();
    public LobbyModel() {
        this.nombres = new ArrayList();
    }

    public List<String> getNombres() throws IOException {
        return mvp.getIps();
    }

    public void setNombres(List<String> nombres) {
        this.nombres = nombres;
    }
   
}
