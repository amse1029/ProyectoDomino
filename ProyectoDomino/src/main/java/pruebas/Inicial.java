/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pruebas;

import MVP.IPrincipal;
import MVP.PrincipalPresenter;

/**
 *
 * @author alexa
 */
public class Inicial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        IPrincipal presenter = PrincipalPresenter.getInstance();
        presenter.abrirPantPrincipal();
    }  
}
