package empleado;

import java.util.Scanner;

import empleado.Empleado;

public class Main{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        String nombre, telefono;
        Empleado[] empleados = new Empleado[4];

        /* INPUT */
        for(int k = 0; k < empleados.length; k++){
            System.out.println("Nombre:");
            nombre = sc.nextLine();
            System.out.println("Telefono");
            telefono = sc.nextLine();

            empleados[k] = new Empleado(nombre, telefono);
        }
        sc.close();

        /* OUTPUT */
        for(int k = 0; k < empleados.length; k++){
            System.out.println("Nombre : " + empleados[k].getNombre() + " " +
                                "Telefono : " + empleados[k].getTelefono());
        }


       System.out.println("Número de empleados: " + Empleado.getNumeroEmpleados());

    }
}