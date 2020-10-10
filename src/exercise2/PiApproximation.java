package exercise2;



public class PiApproximation {

  public static void main (String[] args){
    

double a = (1.0 - 1.0/3.0 + 1.0/5.0 - 1.0/7.0 + 1.0/11.0 - 1.0/13.0 + 1.0/17.0 - 1.0/19.0 + 1.0/23.0);
double b = (4.0*a);

    System.out.println ("Pi:" + b);
  }
}