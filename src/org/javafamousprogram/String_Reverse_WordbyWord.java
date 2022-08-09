package org.javafamousprogram;

public class String_Reverse_WordbyWord {

	public static void main(String[] args) {
		String s = "Indian T20 World Cup Squad";
		String[] str = s.split(" ");
		String reverse ="";
		
		for (String string : str) {
			reverse = "";
			for (int i =string.length()-1; i >=0; --i) {
				char c = string.charAt(i);
				reverse = reverse + c;
				
			}
			System.out.print(reverse + " ");
		}
		
	

	}

}
