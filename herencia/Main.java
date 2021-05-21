package herencia;

public class Main{

    public static void main(String[] args) {
        
        Gato gato = new Gato("Gardfield", 10.5, "Naranja", 1997, "comun");
        System.out.println(gato.toString());
        gato.sonidoGato();
        System.out.println(gato.getRaza());

        Perro perro = new Perro("Groucho", 30.8, 2000, "Azul"); //color no se lo paso
        System.out.println(perro.toString());
        perro.sonidoPerro();
        
    }
}