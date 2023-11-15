
package Week5_exercises;

import java.util.Scanner;

public class E08_BMI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa tu peso en KiloGramos. Ejemplo: 65");
        int peso = sc.nextInt();
        
        System.out.println("Ingresa tu altura en metros. Ejemplo: 1.70");
        double estatura = sc.nextDouble();
        
        double imc = peso / (Math.pow(estatura, 2));
        
        
        if(imc < 18){
            System.out.println("Estas bajo de peso, alfiler >:I");
        }else if(imc < 25){
            System.out.println("Tu peso es normal");
        }else if(imc < 30){
            System.out.println("Estas con sobrepeso");
        }else{
            System.out.println("Estas con obesidad, no cabes en tu puerta :(");
        }
       
        System.out.println("Tu IMC es: " + imc);
    }
} // Por Lady Robalino
