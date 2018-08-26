/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LabCarro;

import java.util.Date;

/**
 *
 * @author user
 */
public class ArrendarCar {
    private static RentTransaction rent;
    
    public static RentTransaction rentar(String tipocarro, Customer cu, Date fecha,Date pd, Date rd){
        RentTransaction renti;
        CarFactory cr;
        if(tipocarro.toLowerCase().contains("deportivo")){
            cr = new SportCarFactory();
            return renti = new RentTransaction(fecha, pd, rd, cr, cu);
        }else{
            if(tipocarro.toLowerCase().contains("estandar")){
                cr = new StandarCarFActory();
                return renti =new RentTransaction(fecha, pd, rd, cr, cu);
            }else{
                cr = new FamilyCarFactory();
                return renti = new RentTransaction(fecha, pd, rd, cr, cu);
            }
        }
    }
    
    public static void main(String[] args){
        Customer cu = new Customer(1040748666,"Tomas","Masculino","VIP");
        Date ini = new Date(2018,8,26);
        Date fin = new Date(2018,8,28);
        Date hoy = new Date();
        if(rent==null){
            rent = rentar("familiar", cu, hoy, ini, fin);
        }
        rent.datos();
    }
}
