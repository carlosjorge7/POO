package alumno;

import java.util.Scanner;

public class Main{

    private static Alumnos alumnos;
    private static Scanner sc;
    private static String nombre;

    public static void main(String[] args) {

        alumnos = new Alumnos(5);
        sc = new Scanner(System.in);
        String op = "";

        while(!op.equals("6")){

            mostrarMenu();
            op = sc.nextLine();

            switch(op){

                case "1":
                    listarAlumnos();
                    break;

                case "2":
                    anadirAlumno();
                    break;

                case "3":
                    eliminarAlumno();
                    break;

                case "4":
                    ponerNota();
                    break;
                case "5":
                    borrarNota();
                    break;
                case "6":
                    break;
            }
        } 
    }

    private static void listarAlumnos(){

        Alumno[] al = alumnos.getAlumnos();
        System.out.println("Nombre\t1ev\t2ev\t3ev");
        for(int i = 0; i < al.length; i++){

            System.out.println(al[i].getNombre()
                + "\t" + al[i].getNota(1)
                + "\t" + al[i].getNota(2)
                + "\t" + al[i].getNota(3));
        }
    }


    private static void anadirAlumno(){

        if(alumnos.estaLleno()){
            System.out.println("Todo lleno");
        }
        else{
            System.out.println("Nombre");
            nombre = sc.nextLine();
            if(alumnos.anadirAlumno(new Alumno(nombre))){
                System.out.println("Añadido");
            }
            else{
                System.out.println("Ya existe");
            }

        }

    }


    private static void eliminarAlumno(){

        System.out.println("Nombre");
        nombre = sc.nextLine();
        if(alumnos.eliminarAlumnoA(new Alumno(nombre))){
            System.out.println("Eliminado");
        }
        else{
            System.out.println("No existe");
        }

    }


    private static void ponerNota(){

        System.out.println("Nombre");
        nombre = sc.nextLine();

        if(alumnos.existeAlumno(new Alumno(nombre))){

            System.out.println("Evaluacion(1,2,3)");
            int evaluacion = Integer.parseInt(sc.nextLine());
            System.out.println("Nota");
            double nota = Double.parseDouble(sc.nextLine());

            if(alumnos.ponerNotaA(new Alumno(nombre), evaluacion, nota)){
                System.out.println("Añadido con exito");
            }
            else{
                System.out.println("Nota o evaluacion invalidas");
            }

        }
        else{
            System.out.println("No existe el alumno");
        }

    }


    private static void borrarNota(){

        System.out.println("Nombre");
        nombre = sc.nextLine();
        if(alumnos.existeAlumno(new Alumno(nombre))){

            System.out.println("Evaluacion(0,1,2)");
            int evaluacion = Integer.parseInt(sc.nextLine());
          
            if(alumnos.borrarNotaA(new Alumno(nombre), evaluacion)){
                System.out.println("Borrada con exito");
            }
            else{
                System.out.println("Evaluacion incorrecta");
            }

        }
        else{
            System.out.println("No existe");
        }

    }


	private static void mostrarMenu(){
		System.out.println("Opciones\n" +
			"1.- Listar alumnos.\n" +
			"2.- Añadir alumno.\n" +
			"3.- Eliminar alumno.\n" +
			"4.- Poner nota.\n" +
			"5.- Borrar nota.\n" +
			"6.- Salir.");
	}
}