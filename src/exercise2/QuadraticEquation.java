package exercise2;

import java.util.Scanner;

public class QuadraticEquation {

    public static void main(String[] args) {
      
        Scanner input = new Scanner(System.in);
        System.out.print("Eingeben Sie a: ");
        double a = input.nextInt();
        System.out.print("Eingeben Sie b: ");
        double b = input.nextInt();
        System.out.print("Eingeben Sie c: ");
        double  c = input.nextInt();

        if (a != 0) {
            double D = b * b - 4 * a * c;
            if (D > 0) {
          
            } else if (D == 0){
              double x = (- b) / (a * 2);
              System.out.println(x + ", " + x);
            } else {
              System.out.println("Imaginary values");
            }
        } else if (b != 0) {
            double x3 = - (c / b);
            System.out.println(x3);
        } else if (c != 0) {
            System.out.println("No values");
        } else {
            System.out.println("Many values");
        }
               
    }
}