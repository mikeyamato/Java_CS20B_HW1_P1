package exercise1;

import java.util.Scanner;
import java.lang.Math;

public class App {
  public static void main (String[] args){
    Scanner userInput = new Scanner(System.in);
    int base, exponent;

    System.out.println("Enter a number 0-9 for the base, then one more number for exponent. Hit enter after each entry.");
    base = userInput.nextInt();
    exponent = userInput.nextInt();

//    Numbers n = new Numbers();
//    n.setBase(base);
//    n.setExponent(exponent);
    //
    Number result1 = Numbers.multiply(base, exponent);
    double result2 = Math.pow(base, exponent);
    System.out.println("This uses one method of calculating the power: " + result1);
    System.out.println("This uses another method of calculating the power: " + Math.round(result2));
  }
  // why can't I use `System.out`?

//  Numbers.multiply(base,exponent);
//  System.out.println("The power equals:");
//  System.out.println();
}
