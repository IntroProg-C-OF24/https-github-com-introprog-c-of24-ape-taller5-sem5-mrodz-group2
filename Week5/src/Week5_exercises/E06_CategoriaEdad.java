package Week5_exercises;

import java.util.Scanner;

public class E06_CategoriaEdad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa tu edad");
        int edad = sc.nextInt();
        
        if(edad >= 18){
            System.out.println("Eres un adulto");
        }else if(edad >= 12){
            System.out.println("Eres un adolescente");
        }else{
            System.out.println("Eres un nino");
        }
    }
}
// Por MRodzDirect 😉
