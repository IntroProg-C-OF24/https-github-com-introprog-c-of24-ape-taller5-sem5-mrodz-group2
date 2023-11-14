/*
 Problema-7
Rango de Notas: Asignar una letra (A, B, C, D) a una calificación en función de su rango
(A para 90-100, B para 80-89, etc.).
 */
package taller.pkg5.fundamentos;

import java.util.Scanner;

public class Problema_7 {
    public static void main(String[] args) {
        int nota;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese una nota ");
        nota = teclado.nextInt();
        if (nota >= 90)
            System.out.print("A");
        else
            if (nota >= 80)
                System.out.print("B");
            else
                if (nota >= 70)
                    System.out.print("C");
                else
                    System.out.print("D");            
    }    
}
