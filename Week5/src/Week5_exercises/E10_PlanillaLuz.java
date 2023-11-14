package Week5_exercises;
import java.util.Scanner;
public class E10_PlanillaLuz {
    public static void main(String[] args) {
        Scanner vari1 = new Scanner(System.in);
        double vari, vari2, vari3, vari4, vari5;
        System.out.println("Coloca tu edad");
        vari3 = vari1.nextDouble();
        System.out.println("Coloca el costo del kilovatio por hora en tu localidad");
        vari = vari1.nextDouble();
        System.out.println("Pon el valor de los kilovatios consumidos en el mes");
        vari2 = vari1.nextDouble();
        vari4 = vari * vari2;
        if (vari3 > 65){
            vari5 = vari4 * 0.1;
            vari4 = vari4 - vari5;
        }
        System.out.println("El valor de la planilla es: " + vari4);
    }
} // Por MRodzDirect 😉