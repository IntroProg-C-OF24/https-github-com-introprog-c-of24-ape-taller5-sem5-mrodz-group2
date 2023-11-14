/*
Problema-9
Ordenamiento de Tres Números: Dados tres números, ordenarlos en orden ascendente.
 */
package taller.pkg5.fundamentos;

import java.util.Scanner;

public class Problema_9 {

    public static void main(String[] args) {
        int numA, numB, numC, numAux;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese el primer numero: ");
        numA = teclado.nextInt();
        System.out.print("Ingrese el segundo numero: ");
        numB = teclado.nextInt();
        System.out.print("Ingrese el tercer numero: ");
        numC = teclado.nextInt();
        if (numA > numB) {
            numAux = numA;
        } else {
            numAux = numB;
        }
        if (numAux > numC) {
            System.out.print("El mayor es: " + numAux);
        } else {
            System.out.print("El mayor es: " + numC);
        }
    }

}
