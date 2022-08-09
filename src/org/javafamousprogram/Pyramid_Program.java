package org.javafamousprogram;

public class Pyramid_Program {
	
	
	public static void Number_Pyramid() {
		int rows = 6;
		
		for (int i = 1; i <= rows ; i++) {
			
			for (int j = rows; j> i; j--) {
				System.out.print(" ");
				
			}
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			for (int j = i-1; j >= 1; j--) {
				System.out.print(j);
			}
		
			System.out.println();
		
		}
		System.out.println();

	}
	
	
	public static void Star_Pyramid() {
		int rows = 6;
		
		for (int i = 1; i <= rows ; i++) {
			
			for (int j = rows; j> i; j--) {
				System.out.print(" ");
				
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			for (int j = i-1; j >= 1; j--) {
				System.out.print("*");
			}
		
			System.out.println();
		
		}
			System.out.println();
	}
	
	public static void Down_Number_Pyramid() {
		
		int rows = 6;
		
		for (int i = rows; i >= 1 ; i--) {
			
			for (int j = rows; j> i; j--) {
				System.out.print(" ");
				
			}
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			for (int j = i-1; j >= 1; j--) {
				System.out.print(j);
			}
		
			System.out.println();
		
		}		
		System.out.println();

	}
	
	
	public static void Down_Star_Pyramid() {
	int rows = 6;
		
		for (int i = rows; i >= 1 ; i--) {
			
			for (int j = rows; j> i; j--) {
				System.out.print(" ");
				
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			for (int j = i-1; j >= 1; j--) {
				System.out.print("*");
			}
		
			System.out.println();
		
		}		
		System.out.println();

	}
	
	public static void Right_Traingle_Number() {
		
		int rows =6;
		 for (int i = 1; i <= rows; i++) {
			 for (int j = 1; j <= i; j++) {
				System.out.print("*");
			
			 }
			 System.out.println();
		 }
		System.out.println();
		
		
		
	}
	
	public static void Down_Right_Traingle_Number() {
		
		int rows =6;
		 for (int i = rows; i >= 1; i--) {
			 for (int j = 1; j <= i; j++) {
				System.out.print("*");
			
			 }
			 System.out.println();
		 }
		System.out.println();
			
	}
	
	
	public static void Left_Traingle_Number() {
		
		int rows =6;
		 for (int i = 1; i <= rows; i++) {
			 
			 for (int j = rows; j > i ; j--) {
				System.out.print(" ");
			}
			 
			 for (int j = 1; j <= i; j++) {
				System.out.print("*");
			
			 }
			 System.out.println();
		 }
		System.out.println();
		
		
		
	}
	
	public static void Down_Left_Traingle_Number() {
		
		int rows =6;
		 for (int i = rows; i >= 1; i--) {
			 
			 for (int j = rows; j > i ; j--) {
				System.out.print(" ");
			}
			 
			 for (int j = 1; j <= i; j++) {
				System.out.print("*");
			
			 }
			 System.out.println();
		 }
		System.out.println();
		
		
		
	}
	

	public static void main(String[] args) {
		
		Number_Pyramid();
		System.out.println();
		Star_Pyramid();
		System.out.println();
		Down_Number_Pyramid();
		System.out.println();
		Down_Star_Pyramid();
		System.out.println();
		Right_Traingle_Number();
		System.out.println();
		Down_Right_Traingle_Number();
		System.out.println();
		Left_Traingle_Number();
		System.out.println();
		Down_Left_Traingle_Number();
		
	}

}
