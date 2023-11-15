package Week5_exercises;

import java.util.Scanner;
public class E12_DatosAutomovil {
    public static void main(String[] args) {
        Scanner car = new Scanner(System.in);
        String car1, car2;
        double car3, car4;
        System.out.println("Pon los datos de tu chatarra");
        System.out.println("Ingresa la marca de tu carro");
        car1 = car.nextLine();
        System.out.println("Ingresa el pais de origen de tu fierro viejo");
        car2 = car.nextLine();
        System.out.println("Ingresa el costo del carro");
        car3 = car.nextDouble();
        if (car2.equals("Alemania")){
            car4 = car3 * 0.2;
            car3 = car3 + car4;
            System.out.println("Impuesto " + car1 + ": " + car4);
            System.out.println("TOTAL: " + car3);
        }    
        else { 
            if (car2.equals("Japon")){
                car4 = car3 * 0.3;
                car3 = car3 + car4;
                System.out.println("Impuesto " + car1 + ": " + car4);
                System.out.println("TOTAL: " + car3);
            }
            else {
                if (car2.equals("Italia")){
                    car4 = car3 * 0.15;
                    car3 = car3 + car4;
                    System.out.println("Impuesto " + car1 + ": " + car4);
                    System.out.println("TOTAL: " + car3);
                }    
                else {
                    if (car2.equals("USA")){
                        car4 = car3 * 0.08;
                        car3 = car3 + car4;
                        System.out.println("Impuesto " + car1 + ": " + car4);
                        System.out.println("TOTAL: " + car3);
                    }    
                }
            }
        }
    }   
} // Por Lady Robalino