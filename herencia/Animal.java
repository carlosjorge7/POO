package herencia;

public abstract class Animal{

    /* El concepto de herencia significa en la clase padre Animal y la clase hija Gato
    , donde la clase Gato hereda los ATTS y METODOS de la clase Animal
    Palabras clave: super y extends   (abstract)*/ 
    private String nombre;
    private double peso;
    private String color;
    private int fecha;

    public Animal(String nombre, double peso, String color, int fecha){
        this.nombre = nombre;
        this.peso = peso;
        this.color = color;
        this.fecha = fecha;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getColor() {
        return color;
    }

    public int getFecha() {
        return fecha;
    }

    @Override
    public String toString() {
        return "Animal [color=" + color + ", fecha=" 
        + fecha + ", nombre=" + nombre + ", peso=" + peso + "]";
    }

    


    
}