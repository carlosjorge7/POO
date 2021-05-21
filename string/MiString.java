package string;

public class MiString{

    public MiString(){}

    public static String alReves(String cadena){
        
        StringBuilder inversa = new StringBuilder();

        for(int k = cadena.length() - 1; k >= 0; k--){
            inversa.append(cadena.charAt(k));
        }
        return inversa.toString();
    }

    public static String limpiaCaracteres(String cadena1, String cadena2){
   
        StringBuilder limpia = new StringBuilder();

        for(int k = 0; k < cadena1.length(); k++){

            if(!existeChar(cadena1.charAt(k), cadena2)){
                limpia.append(cadena1.charAt(k));
            }
        }
        return limpia.toString();
    }
    
    private static boolean existeChar(char x, String cadena){

        for(int i = 0; i < cadena.length(); i++){

            if(x == cadena.charAt(i)){
                return true;
            }
        }
        return false;
    }

    public static String sustituye(String cadena, char x, char y){

        StringBuilder nuevo = new StringBuilder();

        for(int i = 0; i < cadena.length(); i++){

            if(x == cadena.charAt(i)){
                nuevo.append(y);
            }
            else{
                nuevo.append(cadena.charAt(i));
            }
        }
        return nuevo.toString();
        
    }

    public static boolean todosIguales(String cadena){

        boolean iguales = true;

        for(int k = 1; k < cadena.length(); k++){

            if(cadena.charAt(0) != cadena.charAt(k)){
                iguales = false;
            }
        }
        return iguales;
    }

    public static String quitaEspacios(String cadena){

        StringBuilder quita = new StringBuilder();
        char esp = ' ';

        for(int i = 0; i < cadena.length(); i++){

            if(esp != cadena.charAt(i)){
                quita.append(cadena.charAt(i));
            }
        }
        return quita.toString();
        /* Alternativa
        return cadena.replace(" ", "");
        */

    }

    public static boolean esNumeroEntero(String cadena){

        boolean esNum = true;

        for(int k = 0; k < cadena.length(); k++){

            if(cadena.charAt(k) < '0' || cadena.charAt(k) > '9'){
                esNum = false;
            }

        }
        return esNum;

    }


}