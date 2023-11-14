package Week5_exercises;
import java.util.Scanner;
public class E07_Calificaciones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int calificacion ;
        System.out.println("Ingrese la calificación (un número): ");
     calificacion = sc.nextInt();
	
    if (calificacion >= 90 && calificacion <= 100) {
        System.out.println("La calificación A (Excelente)"); 
    }
    else 
        if (calificacion >= 80 && calificacion <= 89) {
        System.out.println("La calificación B (Muy buena)"); 
    }
        else{
            if (calificacion >= 70 && calificacion <= 79) {
        System.out.println("La calificación C (Buena)");
    }
            else
                if (calificacion >= 60 && calificacion <= 69) {
        System.out.println("La calificación D (Satisfactoria)");
    }else
                {
                    if (calificacion >= 50 && calificacion <= 59) {
                        System.out.println("La calificación E (Necesita mejoras)");
                    }
	
	if (calificacion >= 1 && calificacion <= 49) {
            System.out.println("La calificación F (Vuelva a intentarlo...)");
        }
        else
	
    if (calificacion > 100 || calificacion < 0) {
        System.out.println("La calificación esta fuera del rango indicado: A, B, C, D.");
    }
    else {
        if (calificacion == 0) {
		          System.out.println("Usted perdio el año, D:");
        }
    }
	 
    }
        }
}
}
// Por MRodzDirect 😉
