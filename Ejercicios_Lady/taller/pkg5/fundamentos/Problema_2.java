/*
 Problema-2
Día de la Semana: Mostrar el nombre del día de la semana en función del número ingresado
(1 para lunes, 2 para martes, etc.).
 */
package taller.pkg5.fundamentos;
import java.util.Scanner;
public class Problema_2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numDia;
        System.out.print("Ingrese el numero: ");       
        numDia= teclado.nextInt();
        if (numDia == 1) 
            System.out.print("Es Lunes ");
        else {
            if (numDia == 2)
            System.out.print("Es Martes");
            else {
                if (numDia == 3)
                    System.out.print("Es Miercoles");
                else {
                    if (numDia == 4)
                        System.out.print("Es Jueves");
                    else {
                        if (numDia == 5)
                            System.out.print("Es Viernes");
                        else {
                            if (numDia == 6)
                                System.out.print("Es Sabado");
                            else {
                                if (numDia == 7)
                                    System.out.print("Es Domingo");
                            }
                        }
                    }
                }
            }
        }
   }
}