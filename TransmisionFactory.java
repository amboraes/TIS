/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LabCarro;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author user
 */
public class TransmisionFactory implements Transmision{
    ArrayList<String> lista = new ArrayList<>();
    
    Random r = new Random();

    public TransmisionFactory() {
    }
    
    public void llenar(){
        lista.add("Automatica");
        lista.add("Mecanica");
    }

    @Override
    public void obtTransmision() {
        llenar();
        System.out.println("La transmision es: "+lista.get(r.nextInt(1)));
        
    }
    
}
