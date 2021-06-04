package ejerciciodelogica;

import java.util.Scanner;

/**
 * //El programa pedira 10 numeros enteros. //y mostrar el promedio de los que
 * sean negativos //tamnbien el promedio de los positivo //y nos dira cuantos
 * ceros fueron ingresados
 */
public class EjercicioAumento {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num = 0, cantidadNegativo = 0, cantidadPositivo = 0, sumaNegativo = 0;
        int SumaPositivo = 0, cantidadCeros = 0;
        double promedioPositivo = 0, promedioNegativo = 0;
        int k = 0;
        while (k < 10) {

            System.out.println("Introduce un numero: ");
            num = teclado.nextInt();
            if (num == 0) {
                cantidadCeros++;
            } else if (num > 0) {
                cantidadPositivo++;
                SumaPositivo = SumaPositivo + num;
            } else {
                cantidadNegativo++;
                sumaNegativo = sumaNegativo + num;
            }
            k++;
        }
        if (cantidadPositivo == 0) {
            System.out.println("No se puede realizar el promedio de los positivos");
        } else {
            promedioPositivo = SumaPositivo / cantidadPositivo;
            System.out.println("El promedio de las positivos es: " + promedioPositivo);
        }
        if (cantidadNegativo == 0) {
            System.out.println("No se puede realizar el promedio de los negativos");
        } else {
            promedioNegativo = sumaNegativo / promedioNegativo;
            System.out.println("El promedio de las negativos es: " + promedioNegativo);
        }
        System.out.println("la cantidad de los ceros son :" +cantidadCeros);
    }
}
