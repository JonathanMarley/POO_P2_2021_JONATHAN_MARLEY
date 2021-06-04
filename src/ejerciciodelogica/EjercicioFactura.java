package ejerciciodelogica;

import java.util.Scanner;

/*
//crear un programa para la gestion de factura de una empresa que se
//dedica a la venta de azucar por kilos
//En cada factura se ingresa el codigo del producto vendido
//Ademas se ingresara la cantidad de kilos vendida
//y el total a pagar por kilos
//De 5 facturas introducidas, se pide:
//Facturacion total, cantidad de kilos venida, y cuantas
//facturas fueron emitidas por mas de $1000.
 */
public class EjercicioFactura {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String codigos = "";
        int kilos = 0, contador = 0, totalKilos = 0;
        float precio = 0, importeFactura = 0, facturacionTotal = 0;
        
        for (int i=1; i <=5; i++) {
            System.out.println("FACTURA NUMERO "+i);
            System.out.println("Codigo del producto: ");
            codigos = teclado.next();
            System.out.println("Cantidad de kilos: ");
            kilos = teclado.nextInt();
            System.out.println("Precio: ");
            precio = teclado.nextFloat();
            importeFactura=kilos*precio;
            
            if (importeFactura>=1000) {
                
                contador++;
            }
            totalKilos=kilos+totalKilos;
        }
        System.out.println("Detalles de la venta: ");
        System.out.println("Factura total: $"+facturacionTotal);
        System.out.println("Total de kilos vendidos: "+totalKilos);
    }
}
