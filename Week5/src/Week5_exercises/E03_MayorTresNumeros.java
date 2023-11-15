package Week5_exercises;

import java.util.Scanner;
public class E03_MayorTresNumeros {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        int num1, num2, num3, masivo;

        System.out.println("Ingrese los tres numeros de los que desea conocer el mayor");
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        num3 = sc.nextInt();

        if (num1 > num3) {
            masivo = num1;
        } else {
            masivo = num3;
        }

        if (masivo > num2) {
            // masivo se queda igual
        } else {
            masivo = num2;
        }

        System.out.println("El mayor de los tres numeros es: " + masivo);
    }
} // Por MRodzDirect 😉