package programador;

import empleado.Empleado;

public class Programador extends Empleado {

    /* Polimorfismo: poder instanciar objetos de la clase padre o hija */

    private String[] lenguajes;

    public Programador(String nombre, String telefono, String ... lenguajes) {
        super(nombre, telefono);
        this.lenguajes = lenguajes;
    }

    public String[] getLenguajes() {
        return lenguajes;
    }
    
}