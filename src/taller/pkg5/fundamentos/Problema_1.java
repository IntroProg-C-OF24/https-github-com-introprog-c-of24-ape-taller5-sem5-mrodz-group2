/*
Problema-1
Edad para Votar: Determinar si una persona es elegible para votar en función de su edad
(mayor o igual a 18 años).
 */
package taller.pkg5.fundamentos;
import java.util.Scanner;
public class Problema_1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
    int edad ;
        System.out.print("Ingrese su edad: ");
        edad = teclado.nextInt();
        if (edad >= 18)
            System.out.print("Si puede votar ");
        else
            System.out.print("No puede votar ");       
    }   
}
