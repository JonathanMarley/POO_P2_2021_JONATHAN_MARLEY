package ejerciciodelogica;

import java.util.Scanner;

/*
//cada pieza de pan tiene un precio de $5
//si el cliente compra mas de 50 piezas, le costara $4.50
//si el cliente compra mas de 100 pieza, le costara a $4
//el programa que pida capturar la cantidad de piezas que el cliente compro
//y el total que pagara.
 */
public class EjercicioArrayPizza {

    public static void main(String[] args) {
        int cantidadPiezas = 0;
        double totalPagar = 0;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Por favor ingrese la cantidad de pan a comprar: ");
        cantidadPiezas = teclado.nextInt();
        if (cantidadPiezas >= 50 && cantidadPiezas < 100) {

            totalPagar = cantidadPiezas * 4.50;

        } else if (cantidadPiezas >= 100) {

            totalPagar = cantidadPiezas * 4;

        } else {

            totalPagar = cantidadPiezas * 5;
        }

        System.out.println("El cliente compro: " + cantidadPiezas + " piezas de pan");
        System.out.println("El total de pagar es: " + totalPagar);
    }

}
