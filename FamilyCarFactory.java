package LabCarro;

import java.util.ArrayList;
import java.util.Random;

public class FamilyCarFactory implements CarFactory{
    int valorhora = 30000;
    String seguro;
    
    Random r = new Random();
    public String getSeguro() {
        return seguro;
    }

    public void setSeguro(String seguro) {
        this.seguro = seguro;
    }
    

    @Override
    public void getDescription() {
        System.out.println("Este es un carro familiar");
    }

    @Override
    public GenerarPlaca crearPlaca() {
        return new GenerarPlaca();
    }

    @Override
    public Cilindraje crearCilindraje() {
        return new CilindrajeSportCar();
    }

    @Override
    public MarcaFactory crearMarca() {
        return new MarcaFactory();
    }

    @Override
    public ColorFactory crearColor() {
        return new ColorFactory();
    }

    @Override
    public TransmisionFactory crearTransmision() {
        return new TransmisionFactory();
    }
    
    int pt = r.nextInt(8-5)+2;
    public final String pasajeros = "El carro tiene espacio para "+ String.valueOf(pt)+ " ocupantes";
    @Override
    public void getPasajeros() {
        System.out.println(pasajeros);
    }

    @Override
    public int getCosto() {
        return valorhora;
    }

    @Override
    public void crear(ArrayList<String> l) {
        getDescription();
        crearMarca().obtMarca();
        crearColor().obtColor();
        crearCilindraje().obtCilindraje();
        crearTransmision().obtTransmision();
        getPasajeros();
        crearPlaca().obtPlaca(l);
        System.out.println("Valor por hora:"+getCosto());
    }
    
}
