/*
 Problema-6
Categoría de Edad: Clasificar a una persona en una categoría de edad
(niño, adolescente, adulto) en función de su edad.
 */
package taller.pkg5.fundamentos;
import java.util.Scanner;
public class Problema_6 {
    public static void main(String[] args) {
        int edad;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese edad: ");
        edad = teclado.nextInt();
        if (edad < 12)
            System.out.print("Es nino");
        else 
            if (edad < 18)
                System.out.print("Es adolescente");
            
            else             
                System.out.print("Es adulto");          
         
    }
}