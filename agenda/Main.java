package agenda;

import java.util.Scanner;

public class Main{

    private static Agenda agenda;
    private static Scanner sc;
    private static String nombre;

    public static void main(String[] args) {

        agenda = new Agenda(5);
        sc = new Scanner(System.in);
        String op = "";

        while(!op.equals("6")){

            mostarMenu();
            op = sc.nextLine();

            switch(op){

                case "1":
                    listarContactos();
                    break;

                case "2":
                    anadirContacto();
                    break;

                case "3":
                    eliminarContacto();
                    break;

                case "4":
                    existeContacto();
                    break;
                case "5":
                    buscarContacto();
                    break;
                case "6":
                    break;
            }
        }

    }

    private static void listarContactos(){

    }

    private static void anadirContacto(){

    }

    private static void eliminarContacto(){

    }

    private static void existeContacto(){

    }

    private static void buscarContacto(){

    }

    private static void mostarMenu(){
        System.out.println("Opciones\n" +
			"1.- Listar alumnos.\n" +
			"2.- Añadir alumno.\n" +
			"3.- Eliminar alumno.\n" +
			"4.- Poner nota.\n" +
			"5.- Borrar nota.\n" +
			"6.- Salir.");
    }
}