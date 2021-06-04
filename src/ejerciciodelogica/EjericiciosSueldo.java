
package ejerciciodelogica;

import javax.swing.JOptionPane;


public class EjericiciosSueldo {
    public static void main(String[] args) {
        
        int cantidadSueldos=0,sueldo=0,sueldoMaximo=0;
        boolean primerSueldo=false;
        cantidadSueldos=Integer.parseInt(JOptionPane.showInputDialog("Cuantos sueldo va a calcular"));
        for (int i = 1; i <cantidadSueldos; i++) {
            
            sueldo=Integer.parseInt(JOptionPane.showInputDialog("Por favor introduce el sueldo"+(i)));
            
            if (primerSueldo==false) {
                
                sueldoMaximo=sueldo;//El sueldo sera repetido cuando el usuario ingrese otras cantidades
                primerSueldo=true;
            }
            if (sueldo>sueldoMaximo)sueldoMaximo=sueldo; {
                
            }
            JOptionPane.showMessageDialog(null,"EL sueldo mayor es: "+sueldoMaximo);
            
        }
    }
}
