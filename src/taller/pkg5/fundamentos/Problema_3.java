/*
Problema-3
Mayor de tres números: Dados tres números, determinar cuál es el mayor. Si son iguales,
mostrar un mensaje.
 */
package taller.pkg5.fundamentos;
import java.util.Scanner;
public class Problema_3 {
    public static void main(String[] args) {
        int numA, numB, numC, numAux ;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese el primer numero: ");
        numA = teclado.nextInt();
        System.out.print("Ingrese el segundo numero: ");
        numB = teclado.nextInt();
        System.out.print("Ingrese el tercer numero: ");
        numC = teclado.nextInt();
        if (numA > numB)
            numAux = numA;
        else
            numAux = numB;
        if (numAux > numC)
            System.out.println("El mayor es: " + numAux);
        else
            System.out.println("El mayor es: " + numC);
    }
    
}
