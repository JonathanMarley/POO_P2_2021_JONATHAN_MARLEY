
package ejerciciodelogica;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EjerciciosTienda {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double ventas[]=new double[3];
        System.out.println("Ingrese las 5 ventas del mes: ");
        for (int i = 0; i <ventas.length; i++) {
            
            System.out.println("ventas " +(i+1));
            ventas[i]= teclado.nextDouble();
        }
        int M =0;
        int total =0;
        System.out.println("Ventas mayotes o igual a $2000");
        while (M<3) {
            
            if (ventas[M]>2000) {
                System.out.println("$ = " + ventas[M]);
                total++;
            }
            M++;
        }
        System.out.println("El total de venyas mayores a 2000 es: " +total);
    }
}
