
package ejerciciodelogica;

import java.util.Scanner;

/**
//CREAR PROGRAMA QUE MUESTRE EL PRODUCTO DE LOS PRIMEROS 10 NUMEROS IMPARES
//PRIMEROS 10 NUMEROS IMPARES 1,3,5,7,9,11,13,15,17,19. 
 */
public class EjercicioImpares {
    public static void main(String[] args) {
        
        long productosImpares=1;
        for (int i = 1; i < 20; i+=2) {//esto se aumentara en dos e dos ya que son numeros impares
            
           productosImpares=productosImpares*i;//los productosImpares=105
        }
        System.out.println("El resultados de multiplicar los numerosa impares = " + productosImpares);
    }
}
