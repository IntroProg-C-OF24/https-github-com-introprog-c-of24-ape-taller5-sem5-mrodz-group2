package Week5_exercises;
//Autor: Ricardo, quien mas?
import java.util.Scanner;
public class E13_Hosteria {
    public static void main(String[] args) {
        Scanner hos = new Scanner(System.in);
        int hos1;
        double hos2, hos3, hos4, hos5;
        System.out.println("Ingresa cuantos dias te hospedaras");
        hos1 = hos.nextInt();
        System.out.println("Ingresa el costo del dia de la hosteria");
        hos2 = hos.nextDouble();
        hos4 = hos1 * hos2;
        hos5 = hos1 * hos2;
        hos3 = 0;
        if (hos1 > 15){
            hos3 = hos5 * 0.2;
            hos5 = hos5 - hos3;
        }
        else {
            if (hos1 > 10){
                hos3 = hos5 * 0.15;
                hos5 = hos5 - hos3;
            }
            else{
                if (hos1 > 5){
                    hos3 = hos5 * 0.1;
                    hos5 = hos5 - hos3;
                }
            }
        }
        System.out.println("------------------------");
        System.out.println("SUBTOTAL: " + hos4);
        System.out.println("DESCUENTO: " + hos3);
        System.out.println("TOTAL: " + hos5);
        System.out.println("Un ojo de la cara :(, el descuento es solo un truco de marketing...");
    }
} // Por MRodzDirect 😉