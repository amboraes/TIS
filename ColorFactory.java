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
public class ColorFactory implements Color{
    Random r = new Random();
    ArrayList<String> color = new ArrayList<>();
    public void llenarlista(){
        if(color.isEmpty()){
            color.add("Azul");
            color.add("Rojo");
            color.add("Amarillo");
            color.add("Naranja");
            color.add("Negro");
            color.add("Gris");
            color.add("Verde");
        }
    }
    @Override
    public void obtColor(){
        llenarlista();
        System.out.println("El carro es de color:"+color.get(r.nextInt(6)));
    }
}
    