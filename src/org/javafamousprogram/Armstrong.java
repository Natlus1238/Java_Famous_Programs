package org.javafamousprogram;

import java.util.Scanner;

public class Armstrong {

    	public static void main(String[] args) {

            int num, number, rem, total = 0;
            Scanner in = new Scanner(System.in);
            System.out.println("Enter the number:");
            num = in.nextInt();
            number = num;
            while (number != 0)
            {
                rem = number % 10;
                total = total + rem*rem*rem;
                number = number/10;
            }

            if(total == num)
                System.out.println(num + " is an Armstrong number");
            else
                System.out.println(num + " is not an Armstrong number");
            in.close();
        }
    }
    


