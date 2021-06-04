
package ejerciciodelogica;

import java.util.Scanner;

/**
 //CREAR PROGRAMA QUE NOS PIDA CAPTURAR NUMEROS POSITIVOS
 //Y CALCULAR LA MEDIA O PROMEDIO DE ESOS NUMEROS
 */
public class EjercicioCalcular {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numeros=0, cantidadNumeros=0,suma=0;
        double media=0;
        System.out.println("Ingrese un numero(Positivo): ");
        numeros = teclado.nextInt();
        while (numeros>0) {
            
            suma=suma+numeros;
            cantidadNumeros++;
            System.out.println("Ingrese otro numero: ");
            numeros = teclado.nextInt();
       }
        if (cantidadNumeros==0) {
            
            System.out.println("No se puede calcular la media");
        }else{
            media=suma/cantidadNumeros;
            System.out.println("La media es: = " + media);
        }
        
    }
}
