package Week5_exercises;
import java.util.Scanner;
public class E01_EdadVotar {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int edad;
        System.out.println("Ingrese su edad");
        edad = teclado.nextInt();
        if (edad >= 18)
            System.out.println("Eres apto para votar");
        else
            System.out.println("No eres apto para votar");
    }  
} // Por MRodzDirect 😉