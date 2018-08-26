/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LabCarro;

import java.util.Random;

/**
 *
 * @author user
 */
public class CilindrajeSportCar implements Cilindraje{
    Random r;
    
    @Override
    public void obtCilindraje() {
        int min = 2000,max=6300;
        r = new Random();
        System.out.println("Cilindraje:"+(r.nextInt(max-min)+min)); 
    }
    
}
