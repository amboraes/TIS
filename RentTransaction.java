/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LabCarro;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author user
 */
public class RentTransaction {
    String id;
    Date fecha,picjupdate,returndate;
    int valorhora, valortotal;
    CarFactory cr;
    Customer cu;
    ArrayList<String> l = new ArrayList<>();

    public RentTransaction(Date fecha, Date picjupdate, Date returndate, CarFactory cr, Customer cu) {
        this.id = idaleatorio();
        this.fecha = fecha;
        this.picjupdate = picjupdate;
        this.returndate = returndate;
        this.valorhora = cr.getCosto();
        this.valortotal = cr.getCosto()*(this.returndate.compareTo(this.picjupdate)*24  );
        this.cr = cr;
        this.cu = cu;
    }
    private String idaleatorio(){
        int tmp1 = (int)(Math.random()*99999)+1;
        return String.valueOf(tmp1);
    }
    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Date getPicjupdate() {
        return picjupdate;
    }

    public void setPicjupdate(Date picjupdate) {
        this.picjupdate = picjupdate;
    }

    public Date getReturndate() {
        return returndate;
    }

    public void setReturndate(Date returndate) {
        this.returndate = returndate;
    }
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getValorhora() {
        return valorhora;
    }

    public void setValorhora(int valorhora) {
        this.valorhora = valorhora;
    }

    public int getValortotal() {
        return valortotal;
    }

    public void setValortotal(int valortotal) {
        this.valortotal = valortotal;
    }
    
    public void datos(){
        System.out.println("Id transacción: "+ id);
        System.out.println("Fecha que se realiza el recibo: "+fecha);
        System.out.println("Fecha recoge el carro: "+picjupdate);
        System.out.println("Fecha retorno carro: "+returndate);
        System.out.println("Valor total a pagar:" +valortotal);
        cr.crear(l);
    }
    
    
}
