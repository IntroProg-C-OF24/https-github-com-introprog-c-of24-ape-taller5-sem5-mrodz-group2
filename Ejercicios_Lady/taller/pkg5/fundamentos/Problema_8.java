/*
Problema-8
Calculadora de IMC: Calcular el índice de masa corporal (IMC) de una persona y clasificarla
en función de su valor (bajo peso, peso normal, sobrepeso, etc.).
 */
package taller.pkg5.fundamentos;
import java.util.Scanner;
public class Problema_8 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double peso, altura, IMC;
        System.out.print("Ingresa tu peso en kilos:");
        peso = teclado.nextDouble();
        System.out.print("Ingresa tu altura en metros:");
        altura = teclado.nextDouble();
        IMC = peso / (altura * altura);
        if(IMC < 18.5) {
            System.out.print("Desnutrido");
            System.out.print("Tu IMC es: " + IMC);
        }    
        else {
            if(IMC < 24.9){
                System.out.print("Peso ideal");
                System.out.print("Tu IMC es: " + IMC);
            }
            else {
                if(IMC < 30){
                    System.out.print("Sobrepeso");
                    System.out.print("Tu IMC es: " + IMC);
                }        
                else {
                    System.out.print("Obesidad");
                    System.out.print("Tu IMC es: " + IMC);
                }
            }    
        }
    }
}