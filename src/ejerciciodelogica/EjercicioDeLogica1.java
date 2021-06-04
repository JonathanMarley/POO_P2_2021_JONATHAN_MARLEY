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
public class EjercicioDeLogica1 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println(" ********Bienvenido al sistema de registro de la universidad******** ");

        System.out.println(" ***Por favor ingrese su nombre");
        String nombre = teclado.nextLine();

        System.out.println(" ***Por favor ingrese su apellido");
        String apellido = teclado.nextLine();

        System.out.println(" ***Por favor ingrese su numero de cuenta");
        long numeroCuenta = teclado.nextLong();

        System.out.println("");
        System.out.println(" ---EL nombre del estudiante es: " + nombre + "=" + apellido);
        System.out.println(" ---El numero de cuenta es: " + numeroCuenta);
        System.out.println("");
        boolean salir = false;
        int opcion = 0;

        while (opcion != 5) {
            System.out.println(" ******BIENVENIDO AL SISTEMA DE MATRICULA****** ");
            System.out.println(" ---Por favor escoja una de las siguientes opciones ");
            System.out.println(" **1.TIPOS DE CARRERAS** ");
            System.out.println(" **2.MATRICULAS DE CLASES** ");
            System.out.println(" **3.INFORMACION DEL ESTUDIANTE** ");
            System.out.println(" ***4.Salir*** ");

            System.out.println(" ---Por favor ingrese una de la opciones--- ");
            opcion = teclado.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println(" ----POR FAVOR ESCOJA UNA DE LAS SIGUIENTES CARRERAS----");
                    System.out.println(" ***1.Ingenieria Sistema*** ");
                    System.out.println(" ***2.Ingenieria Electronica*** ");
                    System.out.println(" ***3.Ingenieria Civil*** ");
                    System.out.println(" ***4.Ingenieria Industrial*** ");
                    System.out.println(" ***5.Licienciatura En Medicina *** ");
                    System.out.println(" ***6.Doctorado General*** ");
                    System.out.println("INGRESE SU NOMBRE");
                    break;
                case 2:

                    break;

                case 3:

                    break;

                case 4:
                    salir = false;
                    break;

                default:
                    System.out.println("<ERROR> Opcion no válida :(");
                    break;
            }
                 System.out.println(" Finalizacion del registro de la universidad");
        }
        
     
    }
     public static int informacionPersonal(String informacion) {

    }
}
