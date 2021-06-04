
package ejerciciodelogica;

import java.util.Scanner;

/**
 Guardar 5 numeros en un arreglo y mostrarlos en orden inverso
 */
public class EjercicioArray1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in); 
        
        int arr[] = new int[5];
        for (int i = 0; i <arr.length; i++) {
            
            System.out.println("Introduce un numero: ");
            arr[i]=teclado.nextInt();
        }
        System.out.println("Los numeros en orden inverson son: ");
        int j=4;
        while (j>=0) {
            System.out.println("|"+arr[j]+"\n");
            j--;
        }
    }
}
