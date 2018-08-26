/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LabCarro;

import java.util.ArrayList;

/**
 *
 * @author user
 */
public interface CarFactory {
    public abstract void getDescription();
    public abstract GenerarPlaca crearPlaca();
    public abstract Cilindraje crearCilindraje();
    public abstract MarcaFactory crearMarca();
    public abstract ColorFactory crearColor();
    public abstract TransmisionFactory crearTransmision();
    public abstract void getPasajeros();
    public abstract int getCosto();
    public abstract void crear(ArrayList<String> l);
}
