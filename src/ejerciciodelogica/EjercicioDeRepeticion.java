
package ejerciciodelogica;

import java.util.Scanner;

 /*
 **EJERCICIO
//CREAR UN PROGRAMA QUE ESTE PIDIENDO NUMEROS ENTEROS
//CUANDO UN ENTERO SE HAYA INTRODUCIDO, FINALIZARA LA CAPTURA DE DATOS.
//SUMAR LOS NUMEROS Y MOSTRAR LA SUMA EN PANTALLA.
*/
public class EjercicioDeRepeticion {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero, suma=0;
        do {
            System.out.println("Por favor ingrese un numero: ");
            numero = teclado.nextInt();
            suma= suma+numero;
            
        } while (numero!=0);
        System.out.println("EL numero al sumar es: = " +suma);
    }
}
