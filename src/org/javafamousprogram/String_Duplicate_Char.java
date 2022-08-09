package org.javafamousprogram;

import java.util.Scanner;

public class String_Duplicate_Char {

	public static void main(String[] args) {
		String str = " "; 
	      Scanner in = new Scanner(System.in);
	        System.out.println("Enter the String");
	        str = in.nextLine();
	        
	        char[] carray = str.toLowerCase().toCharArray();
	      System.out.println("The string is:" + str);
	      System.out.println("Duplicate Characters in above string are: ");
	      for (int i = 0; i < carray.length; i++) 
	      {
	    	  int count = 0;
	         for (int j = i + 1; j < carray.length; j++) 
	         {
	            if (carray[i] == carray[j]) 
	            {
	             count++;
	            	
	            }
	            	            
	         }
	         if(count == 1) 
	         {
	         System.out.print(carray[i] + ",");  
	      }
	         
	         }      
	      in.close();
	}

}
