
package LabCarro;

public class Customer {
    //Esto no se aun si lo voy a usar
    public enum Genero{
        Masculino,Femenino,Otro
    }    
    
    int id;
    String nombre,genero,tipo;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Customer(int id, String nombre, String genero, String tipo) {
        this.id = id;
        this.nombre = nombre;
        this.genero = genero;
        this.tipo = tipo;
    }
    
    
    
    
}
