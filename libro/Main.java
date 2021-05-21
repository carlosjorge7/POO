package libro;

public class Main{

    public static void main(String[] args){

        /*
        En el fichero main, crear 2 objetos Libro (los valores que se quieran)
         y mostrarlos por pantalla.

        Por último, indicar cuál de los 2 tiene más páginas.
        */
        Libro libro1 = new Libro(0001, "La nueva mente del emperador", "Penrose", 499);
        Libro libro2 = new Libro(1200, "Marina", "Zafon", 120);

        System.out.println("Libro1 " + libro1.toString() +
                            "Libro 2 " + libro2.toString());

        if(libro1.getNumpaginas() > libro2.getNumpaginas()){
            System.out.println("El libro " + libro1.getTitulo()
            + "tiene mas paginas que el libro" + libro2.getTitulo()
            );
        }
        else{
            System.out.println("El libro " + libro2.getTitulo()
            + "tiene mas paginas que el libro" + libro1.getTitulo()
            );
        }


    }
}