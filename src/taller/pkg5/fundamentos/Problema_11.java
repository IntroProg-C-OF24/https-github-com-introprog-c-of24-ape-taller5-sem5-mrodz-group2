/*
 Problema 11
Solución que imprima el costo de un pedido de un artículo del cual se tiene la descripción,
la cantidad que se requiere y el precio unitario. Si la cantidad pedida excede de 50 unidades,
se hace un descuento de 15%.
 */
package taller.pkg5.fundamentos;

import java.util.Scanner;

public class Problema_11 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String producto;
        double costo, cantidad, precio, descuento;
        System.out.println("Pon el nombre del producto que requieres");
        producto = teclado.nextLine();
        System.out.println("Pon la cantidad de unidades que requieres");
        cantidad = teclado.nextDouble();
        System.out.println("Pon el costo del producto");
        costo = teclado.nextDouble();
        precio = costo * cantidad;
        if (cantidad > 50) {
            descuento = precio * 0.15;
            precio = precio - descuento;
        }
        System.out.println("Costo por unidad de " + producto + ": " + costo);
        System.out.println("Unidades: " + cantidad);
        System.out.println("TOTAL: " + precio);
    }
}
