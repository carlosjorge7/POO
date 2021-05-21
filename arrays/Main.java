/*
 * Llenar un array de n elementos con el siguiente patrón:
 * 1 3 5 7 9 10 8 6 4 2
 * Pudiendo ser n par o impar.
 */
package arrays;

import java.util.*;

public class Main{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Tamaño");
        final int N = sc.nextInt();
        sc.close();
        int[] arr = new int[N];

        //Impares por la izquierda, 2i+1, pares por pa derecha 2i

        int k = 1;
        for(int i = 0, d = arr.length -1; i < arr.length/2 && d >= arr.length / 2; i++, d--){
            arr[i] = 2*i + 1;
            arr[d] = 2*k;
            k++;
        }

        if(N % 2 != 0){
            arr[arr.length/2] = arr.length;
        }

        for(int a : arr){
            System.out.print(a + " ");
        }
        
    }
}