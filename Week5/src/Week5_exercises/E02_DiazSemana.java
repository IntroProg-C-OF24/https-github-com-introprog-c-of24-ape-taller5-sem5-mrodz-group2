package Week5_exercises;

import java.util.Scanner;
public class E02_DiazSemana {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero;
        System.out.println("Ingresa un numero");
        numero = teclado.nextInt();
        switch (numero){
            case 1 -> System.out.println("Es Lunes");
            case 2 -> System.out.println("Es Martes");
            case 3 -> System.out.println("Es Miercoles");
            case 4 -> System.out.println("Es Jueves");
            case 5 -> System.out.println("Es Viernes");
            case 6 -> System.out.println("Es Sabado");
            case 7 -> System.out.println("Es Domingo");   
        }
    }   
} // Por MRodzDirect 😉