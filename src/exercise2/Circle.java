package exercise2;

import java.util.Scanner;

public class Circle {

   public static void main (String[] args){
     System.out.println("r:");

     Scanner input = new Scanner(System.in);
     int r = input.nextInt();
     double Pi = 3.14;
     double A = Pi*r*r;
     double C = 2*Pi*r;

     System.out.println ("Circumference" + C);
     System.out.println ("Area" + A);
   }
          

}