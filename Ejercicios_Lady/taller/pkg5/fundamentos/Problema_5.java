/*
 Problema-5
Año Bisiesto: Comprobar si un año ingresado es bisiesto o no.
Si es bisiesto, mostrar un mensaje especial.
 */
package taller.pkg5.fundamentos;

import java.util.Scanner;

public class Problema_5 {

    public static void main(String[] args) {
        int anio;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el anio: ");
        anio = teclado.nextInt();
        if (anio % 4 == 0 && anio % 100 == 0 && anio % 400 == 0) {
            System.out.println("El año es bisiesto");
        } else {
            System.out.println("El año no es bisiesto");
        }
    }
}
