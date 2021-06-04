package ejerciciodelogica;

import java.util.Scanner;

public class EjericicioNotas {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int aprobados = 0, excelentes = 0, i = 1;
        int reprobados = 0;
        float calificaciones = 0;
        
         System.out.println(" ****BIENVENIDO AL SISTEMA DE CALIFICACION 2021**** ");

        while (i <= 6) {
           
            System.out.println("Por favor introduce una calificacion del 0 al 10");
            calificaciones = teclado.nextFloat();

            if (calificaciones >= 9 && calificaciones <= 10) {

                excelentes++;

            } else if (calificaciones >= 6) {

                aprobados++;

            } else {
                reprobados++;
            }
            i++;

        }
        System.out.println("Los detalles de las calificaciones: ");
        System.out.println("La cantidad de los alumnos aprobados :" + aprobados);
        System.out.println("la cantidad de los reprobados :" + reprobados);
        System.out.println("La cantidad de los alumnos excelentes son:" + excelentes);
    }
}
