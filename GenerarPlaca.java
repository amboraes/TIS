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
public class GenerarPlaca implements Placa {

    public GenerarPlaca() {
    }
    
    Random r = new Random();
    @Override
    public void obtPlaca(ArrayList l) {
        String pl = placa();
        if(l.isEmpty()){
            System.out.println("Placa:"+pl);;
        }else{
            while(l.contains(pl)==true){
                pl = placa();
            }
            System.out.println("Placa:"+pl);
        }
    }
    public String placa(){
        int tmp1 = (int)(Math.random()*999)+1;
        String tmp ="";
        for(int i = 0;i<3;i++){
            tmp+=(char)(r.nextInt(25)+'a');
        }
        tmp+=String.valueOf(tmp1);
        return tmp.toUpperCase();
    }
}
