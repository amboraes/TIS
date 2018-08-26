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
public class MarcaFactory implements Marca {
    ArrayList<String> marc = new ArrayList<>();
    Random r;
    
    public void llenar(){
        if(marc.isEmpty()){
            marc.add("Mazda");
            marc.add("Mercedes");
            marc.add("BMW");
            marc.add("Jeep");
            marc.add("Renault");
            marc.add("Land Rover");
            marc.add("Nissan");
            marc.add("Audi");
            marc.add("Dodge");
            marc.add("Chevrolet");
        }
    }
    
    @Override
    public String obtMarca(){
        llenar();
        r = new Random();
        int ind = r.nextInt(marc.size());
        return "El carro es de marca:"+marc.get(ind);
    }
}
