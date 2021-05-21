package nombres;

import java.util.Scanner;

import nombres.Nombres;

public class Main{

    private static Scanner sc;
    private static Nombres nombres;
    private static String nombre;

    public static void main(String[] args){

        sc = new Scanner(System.in);
        String opcion = "";

        nombres = new Nombres(10);

        while(!opcion.equals("6")){

            mostrarMenu();
            opcion = sc.nextLine();

            switch(opcion){

                case "1": //Introducir nombre

                    introducirNombres();
                    break;

                case "2": //Listar nombres
                    listarNombres();
                    break;

                case "3": //Buscar nombre
                    buscarNombres();
                    break;

                case "4": //Eliminar nombre
                    eliminarNombres();
                    break;

                case "5": //Eliminar todos los nombres
                    vaciarNombres();
                    break;

                case "6": //Salir
                    break;
                
                default:
                    System.out.print("Opcion no valida");
                    break;
                
            }
        }

    }

    public static void mostrarMenu(){

        System.out.println("Menú:\n" +
        "1.-Introducir nombre.\n" +
        "2.-Listar nombres.\n" +
        "3.-Buscar nombre. (Se mostrarán todos los nombres que contengan la cadena de\n" +
        "búsqueda)\n" +
        "4.-Eliminar nombre.\n" +
        "5.-Eliminar todos los nombres.\n" +
        "6.-Salir.");
    }

    private static void introducirNombres(){

        if(nombres.estaLena()){
            System.out.println("Esta llena");
            return;
        }
        
        System.out.println("Introducir nombre");
        nombre = sc.nextLine();

        if(nombres.anadir(nombre)){
            System.out.println("Añadido");
        }
        else{
            System.out.println("Ya existe el nombre");
        }
        
    }

    private static void listarNombres(){

        for(int i = 0; i < nombres.getNumeroNombres(); i++){
            System.out.println(nombres.getNombre(i));
        }
    }

    private static void buscarNombres(){

        System.out.println("Buscar nombre");
        nombre = sc.nextLine();

        if(nombres.buscarNombre(nombre)){
            System.out.println("Encontrado");
        }
        else{
            System.out.println("No existe");
        }
    }

    private static void eliminarNombres(){

        System.out.println("Eliminar nombre");
        nombre = sc.nextLine();

        if(nombres.eliminar(nombre)){
            System.out.println("Eliminado");
        }
        else{
            System.out.println("No existe");
        }
    }

    private static void vaciarNombres(){
        nombres.vaciar();
    }

}