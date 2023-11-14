/*
Problema-4
Descuento en Compras: Calcular el precio final de un producto con un descuento
del 10% si el precio original es mayor de $100; de lo contrario, no hay descuento.
 */
package taller.pkg5.fundamentos;

import java.util.Scanner;

public class Problema_4 {
    public static void main(String[] args) {
        double producto, descuento;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el valor del producto: ");
        producto = teclado.nextDouble();
        if (producto > 100)
            System.out.println("Descuento: " + producto * 0.1);
        else
            System.out.println("No hay descuento");
    }
    
}
