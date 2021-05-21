package programador;

import java.util.Scanner;

import empleado.Empleado;

public class Main1{

    private static final int NUM_EMPL = 5;

    public static void main(String[] args) {

        /** Creamos un array de Empleados pudiendo guardar empleado o programadors */
        Empleado[] empleados = new Empleado[NUM_EMPL];
        Scanner sc = new Scanner(System.in);
        String nombre;
        String telefono;

        String esProgramador;
        String[] lenguajes;

        for(int i = 0; i < empleados.length; i++){
            System.out.println("Nombre");
            nombre = sc.nextLine();
            System.out.println("Telefono");
            telefono = sc.nextLine();
            System.out.println("Eres programador (s / n)");
            esProgramador = sc.nextLine();

            if(esProgramador.equals("s")){
                System.out.println("Lengujes separados por comas (split)");
                lenguajes = sc.nextLine().split(",");
                empleados[i] = new Programador(nombre, telefono, lenguajes);
            }
            else{
                empleados[i] = new Empleado(nombre, telefono);
            }
        }
        sc.close();

        /** Polimorfismo */

        System.out.println("Listado de empleado:");
        for(int i = 0; i < empleados.length; i++){

            System.out.println("Nombre : " + empleados[i].getNombre() + " " +
            "Telefono : " + empleados[i].getTelefono());

            if(empleados[i] instanceof Programador){

                Programador p = (Programador) empleados[i];
                System.out.println("Lenguajes: ");
                for(String lenguaje : p.getLenguajes()){
                    System.out.print(lenguaje);
                }
            }
        }
    }
}