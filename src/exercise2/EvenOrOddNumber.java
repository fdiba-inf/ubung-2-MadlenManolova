package exercise2;

import java.util.Scanner;

public class EvenOrOddNumber {

    public static void main(String[] args) {
         System.out.println("Enter a number: ");
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();

        if (a % 2 == 0)

        {
          System.out.println("Number is even");
        }

        else 

        {
          System.out.println ("Number is odd");
        }
      

        
  
    }
}