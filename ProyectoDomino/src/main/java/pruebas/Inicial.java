/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pruebas;

import MVP.IPrincipal;
import MVP.PrincipalPresenter;
import broker.Broker;

/**
 *
 * @author alexa
 */
public class Inicial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        IPrincipal presenter = new PrincipalPresenter();
        presenter.abrirPantPrincipal();
        
//         Broker broker = new Broker();
////        broker.getServer().close();
//        if(broker.getServer().isClosed()) {
//            System.out.println("error");
//        } else {
//            System.out.println("server abierto");
//        }
    }
//FrmPrincipal frm = new FrmPrincipal(presenter);
//frm.setVisible(true);
    }  
//}
