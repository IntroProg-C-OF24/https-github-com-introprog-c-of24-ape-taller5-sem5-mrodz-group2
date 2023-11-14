package Week5_exercises;

import java.util.Scanner;
public class E11_CostoPedido {
    public static void main(String[] args) {
        Scanner cos = new Scanner(System.in);
        String cos1;
        double cos2, cos3, cos4, cos5;
        System.out.println("Pon el nombre del producto");
        cos1 = cos.nextLine();
        System.out.println("Pon la cantidad de unidades");
        cos3 = cos.nextDouble();
        System.out.println("Pon el costo del producto");
        cos2 = cos.nextDouble();
        cos4 = cos2 * cos3;
        if (cos3 > 50){
            cos5 = cos4 * 0.15;
            cos4 = cos4 - cos5;
        }
        System.out.println("Costo por unidad de " + cos1 + ": " + cos2 );
        System.out.println("Unidades: " + cos3);
        System.out.println("TOTAL: " + cos4);
    }
} // Por MRodzDirect 😉