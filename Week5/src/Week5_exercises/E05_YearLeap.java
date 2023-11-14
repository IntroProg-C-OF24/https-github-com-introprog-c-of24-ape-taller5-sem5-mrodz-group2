
package Week5_exercises;

import java.util.Scanner;

public class E05_YearLeap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingresa el anio");
        int year = sc.nextInt();
        
       // % = MOD
       if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0){
           System.out.println("El anio es bisiesto");
       }else{
           System.out.println("El anio no es bisiesto");
       }
    }
}
// Por MRodzDirect 😉