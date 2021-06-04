/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciodelogica;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EjercicioArray {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int array[] = new int [5];
        int mayor = array[0];
        System.out.println("Ingrese los 5 numeros: ");
        for (int i = 0; i <array.length; i++) {
            array[i] = teclado.nextInt();
            if (array[i]>mayor) {
                
                mayor = array[i];
            }
            System.out.println("El numero mayor es: "+ mayor );
        }
        
    }
}
