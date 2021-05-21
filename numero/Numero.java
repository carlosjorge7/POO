package numero;

public class Numero{

    public static final int ASC = 0;
    public static final int DES = 1;

    public Numero(){
        
    }

    public static boolean esPrimo(int num){

        if(num == 0){
            return false;
        }

        int contDiv = 0;

        for(int d = 1; d <= num; d++){
            if(num % d == 0){
                contDiv++;
            }
        }
        if(contDiv == 2 || contDiv == 1){
            return true;
        }
        return false;
    }

    public static boolean esPerfecto(int num){

        if(num == sumaDivisores(num)){
            return true;
        }
        return false;   
    }

    public static boolean esCapicua(int num){

        String strNum = num + "";
        for(int i = 0, d = strNum.length() - 1 ; i <= strNum.length()/2 && i != d; i++, d--){
            if(strNum.charAt(i) != strNum.charAt(d)){
                return false;
            }
        }
        return true;
    }

    public static boolean sonAmigos(int num1, int num2){

        if(num1 == sumaDivisores(num2) && num2 == sumaDivisores(num1)){
            return true;
        }
        return false;
    }

    private static int sumaDivisores(int num){

        int sumDiv = 0;
        for(int d = 1; d < num; d++){
            if(num % d == 0){
                sumDiv += d;
            }
        }
        return sumDiv;
    }

    public static int[] extraeDivisores(int num){

        int contDiv = 0;

        for(int d = 1; d < num; d++){
            if(num % d == 0){
                contDiv++;
            }
        }

        int[] divisores = new int[contDiv];
        int k = 0;
        for(int d = 1; d < num; d++){
            if(num % d == 0){
                divisores[k] = d;
                k++;
            }
        }
        return divisores;
    }

    public static void duplica(int[] nums){

        for(int i = 0; i < nums.length; i++){
            nums[i] = 2*nums[i];
        }
    }

    public static void ordenar(int[] nums, int tipo){

        int aux;

        for(int i = 0; i < nums.length; i++){

            for(int j = 0; j < nums.length - 1; j++){

                if(tipo == DES && nums[j] < nums[j+1]){
                    aux = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = aux;
                }
                else if(tipo == ASC && nums[j] > nums[j+1]){
                    aux = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = aux;
                }
            }
        }
    }

    public static int[] eliminaPrimos(int[] nums){

        int contPrimos = 0;

        for(int i = 0; i < nums.length; i++){
            if(esPrimo(nums[i])){
                contPrimos++;
            }
        }

        int[] sinPrimos = new int[nums.length - contPrimos];
        int k = 0;

        for(int i = 0; i < nums.length; i++){

            if(!esPrimo(nums[i])){
                sinPrimos[k] = nums[i];
                k++;
            }
        }
        return sinPrimos;
    }
}