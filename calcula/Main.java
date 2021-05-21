package calcula;

public class Main{

    public static void main(String[] args) {
        
        System.out.println("(int) mayor : " + Calcula.mayor(6,6666666,1,5,7,44,333,0));
        int[] arr = {6,6666666,1,5,7,44,333,0};
        System.out.println("(int) mayor : " + Calcula.mayor(arr));
        System.out.println("(int) menor : " + Calcula.menor(arr));

        System.out.println("(double) mayor : " + Calcula.mayor(1, 2.2, 4.4));
        System.out.println("(double) menor : " + Calcula.menor(1, 2.2, 4.4));

        String[] cads = {"Hola que pasa", "Soy la cadena mas larga de todas seguro",
         "pepe", "a"};
        System.out.println("(String) mayor : " + Calcula.mayor(cads));
        System.out.println("(String) menor : " + Calcula.menor(cads));

        

    }
}