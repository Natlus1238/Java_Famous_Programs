package org.javafamousprogram;
import java.util.Scanner;
public class PrimeOrNot 
{

  public static void main(String[] args) 
  {
    int num;
    boolean value = true;
    Scanner in = new Scanner(System.in);
    System.out.println("Enter the number");
    num = in.nextInt();
    for (int i = 2; i <= num/2; i++) {
      // condition for nonprime number
      if (num % i == 0) {
        value = false;
        break;
      }
    }

    if (value)
      System.out.println(num + " is a prime number.");
    else
      System.out.println(num + " is not a prime number.");
    in.close();
  }
}
