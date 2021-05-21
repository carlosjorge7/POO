package numero;

public class Main{

    public static void main(String[] args){

        System.out.println(Numero.esPrimo(1));

        System.out.println(Numero.esPerfecto(6));

        System.out.println(Numero.esCapicua(123321));

        System.out.println(Numero.sonAmigos(220, 284));

        int[] divisores = Numero.extraeDivisores(6);
        mostrarArray(divisores);

        int[] nums = {1,2,3,4};
        Numero.duplica(nums);
        mostrarArray(nums);

        int[] nums2 = {5,88,7,0};
        Numero.ordenar(nums2, Numero.ASC);
        mostrarArray(nums2);
        Numero.ordenar(nums2, Numero.DES);
        mostrarArray(nums2);

        int[] nums3 = {1,4,6,7,11,17,20,22};
        int[] sinPrimos = Numero.eliminaPrimos(nums3);
        mostrarArray(sinPrimos);
    }

    public static void mostrarArray(int[] nums){

        for(int i = 0; i < nums.length; i++){
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }
}