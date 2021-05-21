package herencia;

public class Perro extends Animal{

    private String lengua;

    public Perro(String nombre, double peso, int fecha, String lengua){
        super(nombre, peso, "marron", fecha); //Por defecto
        this.lengua = lengua;
    }

    public String getLengua() {
        setPeso(11);
        return lengua;
    }

    public void sonidoPerro(){
        System.out.println("Guau");
    }
  
}