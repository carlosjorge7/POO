package programador;

import empleado.Empleado;

public class Main{

    public static void main(String[] args) {

        String[] lenguajes = {"Java", "Php", "Vba", "JavaScript", "Python"};
        Programador programador = new Programador("Carlos", "675 584 239", lenguajes);
        //System.out.println(programador.getLenguajes()); No funciona por que hay que recorrer el array
        System.out.println(programador.getNombre());
        System.out.println(programador.getTelefono());

        System.out.println("Lenguajes:");
        for (String lenguaje : programador.getLenguajes()) {
            System.out.print(lenguaje + " , ");
        }

        Object obj = programador;
        Empleado em = programador;
        
        // err Programador p = new Empleado("nombre", "3");
        //Empleado e = new Programador("nombre", "telefono", lenguajes);
        Empleado empleado = new Empleado("Carlos", "2314552");

        Object[] objects = new Object[3];
        objects[0] = programador;
        objects[1] = new Empleado("nombre", "telefono");
        objects[2] = "Prueba";

        Programador p = (Programador) empleado;
        System.out.println(p.getLenguajes()); //Da error porque no tiene lenguajes el empleado 
        
        Empleado empleado1 = new Empleado("Carlos", "telefono");

        if(empleado1 instanceof Programador){
            Programador p1 = (Programador) empleado1;
            p1.getLenguajes();
        }



        

        
    }
}