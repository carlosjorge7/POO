package cuenta;

public class Main{

    public static void main(String[] args){

        Cuenta cuenta1 = new Cuenta("Carlos");
        Cuenta cuenta2 = new Cuenta("CJ", 1000);

        cuenta1.ingrearCantidad(200);
        cuenta1.ingrearCantidad(100);
        cuenta1.retirarCantidad(50);
        /*System.out.println("Cantidad de " + cuenta1.getTitular() + 
            " tiene un total de " + cuenta1.getCantidad() );*/
        System.out.println(cuenta1.toString());

        cuenta2.ingrearCantidad(1000);
        cuenta2.retirarCantidad(500);
        /*System.out.println("Cantidad de " + cuenta2.getTitular() + 
            " tiene un total de " + cuenta2.getCantidad() );*/
        System.out.println(cuenta2.toString());
        
        
    }
}