package vehiculo;

public class Main{

    public static void main(final String[] args) {

        Vehiculo v1 = new Vehiculo(4, 120, 50, 1000); // Coche
        Vehiculo v2 = new Vehiculo(2, 120, 0, 500); // Moto

        v1.copia(v2);

        if(v1.esIgual(v2)){
            System.out.println("Son iguales");
        }
        else{
            System.out.print("Son distintos");
        }

        //v1.copia(v2);



    }
}