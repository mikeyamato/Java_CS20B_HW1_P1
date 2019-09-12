package exercise1;

import java.util.Scanner;
import java.lang.Math;

public class App {
  public static void main (String[] args){
    Scanner userInput = new Scanner(System.in);
    int base, exponent;

    System.out.println("Lets calculate exponents.");
    System.out.println("Enter a number for the base, then one more number for exponent. Hit enter after each entry.");
    base = userInput.nextInt();
    exponent = userInput.nextInt();

    Number result1 = Numbers.multiply(base, exponent);
    double result2 = Math.pow(base, exponent);
    System.out.println("This uses one method of calculating the power: " + result1);
    System.out.println("The time efficiency is O log N.");
    System.out.println("And this uses another method of calculating the power: " + Math.round(result2));
    System.out.println("The time efficiency is log N.");
  }
  // why can't I use `System.out` here?

}
