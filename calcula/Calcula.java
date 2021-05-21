package calcula;

public class Calcula{

    /* ... Significa que le puedo pasar 
    un arr = {1, 1,2,4} o numeros tal cual 3,4,7. El numero de args es indefinido 
    Hay sobreescritura de metodos porque se llaman igual los metodos <>*/

    public static int mayor(int ... nums){

        int max = Integer.MIN_VALUE;
        for(int n : nums){
            if(n > max){
                max = n;
            }
        }
        return max;
    }

    public static double mayor(double ... nums){

        double max = Double.MIN_VALUE;
        for(double n : nums){
            if(n > max){
                max = n;
            }
        }
        return max;
    }

    public static String mayor(String ... cadenas){

        String cadMax = cadenas[0];
        for(String cad : cadenas){
            if(cad.length() > cadMax.length()){
                cadMax = cad;
            }
        }
        return cadMax;
    }

    public static int menor(int ... nums){

        int min = Integer.MAX_VALUE;
        for(int n : nums){
            if(n < min){
                min = n;
            }
        }
        return min;
    }

    public static double menor(double ... nums){

        double min = Double.MAX_VALUE;
        for(double n : nums){
            if(n < min){
                min = n;
            }
        }
        return min;
    }

    public static String menor(String ... cadenas){

        String cadMin = cadenas[0];
        for(String cad : cadenas){
            if(cad.length() < cadMin.length()){
                cadMin = cad;
            }
        }
        return cadMin;
    }



}