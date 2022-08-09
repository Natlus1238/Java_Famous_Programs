package org.javafamousprogram;

import java.util.Scanner;

public class StringReverseExample {

	public static void main(String[] args) {
		 String str;
		 String st = " ";
	        char ch;
	        Scanner in = new Scanner(System.in);
	        System.out.println("Enter the string");
	        str = in.nextLine();
	      System.out.println("Original word: " + str);
	      for (int i = str.length()-1; i>=0; --i )
	      {
	        ch = str.charAt(i); 
	        st = st + ch;       
	      }
	      System.out.println("Reversed word: "+ st);
	      in.close();

	}

}
