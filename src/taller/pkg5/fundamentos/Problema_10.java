/*
Problema 10
Solución que permita calcular y mostrar el valor a cancelar de una planilla de luz. 
Se debe ingresar el valor de costo por kilovatio/hora y el número de kilovatios consumidos en el mes.
Si el usuario tiene edad mayor a 65 años, se debe descontar el 10%.
 */
package taller.pkg5.fundamentos;

import java.util.Scanner;

public class Problema_10 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double var1, var2, var3, var4, var5;
        System.out.print("Ingresar edad: ");
        var3 = teclado.nextDouble();
        System.out.print("Ingrese el valor del kilovatio por hora");
        var1 = teclado.nextDouble();
        System.out.print("Ingrese el valor de los kilovatios consumidos en el mes");
        var2 = teclado.nextDouble();
        var4 = var1 * var2;
        if (var3 > 65) {
            var5 = var4 * 0.1;
            var4 = var4 - var5;
        }
        System.out.print("El valor de la planilla es: " + var4);
    }
}
