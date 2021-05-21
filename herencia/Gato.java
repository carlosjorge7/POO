package herencia;

public class Gato extends Animal{

    //Podemos especializar el Gato
    private String raza;

    public Gato(String nombre, double peso, String color, int fecha, String raza){
        super(nombre, peso, color, fecha);
        this.raza = raza;
    }

    public String getRaza() {
        setPeso(11);
        return raza;
    }

    public void sonidoGato(){
        System.out.println("Miau");
    }
  
}