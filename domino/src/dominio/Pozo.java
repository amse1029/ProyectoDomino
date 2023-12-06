/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dominio;

import java.util.ArrayList;

/**
 *
 * @author alexa
 */
public class Pozo {
    
    private ArrayList <Ficha> fichasPozo;

    public Pozo() {
        this.fichasPozo=new ArrayList<>();
    }

    public ArrayList<Ficha> getFichasPozo() {
        return fichasPozo;
    }

    public void setFichasPozo(ArrayList<Ficha> fichasPozo) {
        this.fichasPozo = fichasPozo;
    }
    //Este metodo se va pasar a tablero model
    public boolean validaPozo(ArrayList<Ficha> fichas){
        for(int i=0;i<fichasPozo.size();i++){
            if(fichasPozo.get(i)!=null){
                return true;
            }
        }
        return false;
    }
    public void restarPozo(){
        //EN CONSTRUCCION
//        for(int i=0;i<fichas.size();i++){
//            if(fichas.get(i)==fichaDelete){
//                fichas.remove(fichas.get(i));
//            }
//        }
    }
    
    public void sumarPozo(){}//EN CONSTRUCCIÓN
    
}
