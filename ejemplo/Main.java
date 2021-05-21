package ejemplo;

public class Main{

    public static void main(String[] args) {

        Alumno al = new Alumno("Carlos", 22, 1);
        System.out.println(al.getNombre());
        al.setNombre("Javier");
        System.out.println(al.getNombre().toUpperCase());
        System.out.println(al.getCurso());

        al.introducirNota(10);
        al.introducirNota(7);
        al.introducirNota(7);
        al.introducirNota(1);
        
        for(float nota : al.mostrarNotas()){
            System.out.println(nota + "");
        }
        System.out.println("Media:" + al.mediaNotas(al.mostrarNotas()));
    }

}