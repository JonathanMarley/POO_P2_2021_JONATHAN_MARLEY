
package ejerciciodelogica;

//PROGRAMA DE NOTAS CON VENTAS EMERGENTES
import javax.swing.JOptionPane;

//Introducir la calificacion de matematicas del 0 al 10 de 5 alumnos
//con el numero de control
//El programa dira cual alumno ha reprobado
public class EjercicioNotasVentanas {

    public static void main(String[] args) {
        int calificacion = 0;
        String numControl = " ";
        boolean reprobado = false;
        for (int i = 0; i < 5; i++) {

            numControl = JOptionPane.showInputDialog("Alumno" + (i + 1) + "\n" + "Por favor introduce el numero de control ");
            calificacion = Integer.parseInt(JOptionPane.showInputDialog("Introduce la calificacion: "));
            if (calificacion < 6) {
                reprobado = true;
            }
            {
                if (reprobado == true) {

                    JOptionPane.showInputDialog(null, "El alumno" + numControl + "Ha reprobado:");

                } 
                else {
                  JOptionPane.showMessageDialog(null,"El alumno "+numControl+" No ha reprobado");
                }

            }

        }

    }
}
