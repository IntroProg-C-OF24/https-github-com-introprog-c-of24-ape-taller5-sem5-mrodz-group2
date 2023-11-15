package Week5_exercises;
import java.util.Scanner;

public class E04_DescuentoEnCompras {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa el precio del producto");
        double precio = sc.nextDouble();
        
        if(precio > 100){
            precio = precio * (1-0.10);
        }
        
        System.out.println("El precio final del producto es: " + precio); 
    }
}
// Por MRodzDirect 😉