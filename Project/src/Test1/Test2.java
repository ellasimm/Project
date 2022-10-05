package Test1;

import java.util.Scanner;

public class Test2 {

	
	
	public static void main(String[] args) {
		
		
Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a 4 digit number: ");
		double num = input.nextDouble();
		double num2 = num;
		double rev = 0;
		
		for (int i = 0; i < 4; i++) {
			double x = num % 10;
			rev = rev + x;
			num = Math.floorDiv((int) num, 10);
		}
		System.out.println("The sum of " + num2 + " is " + rev);
		System.out.println("This statement is made by Omama."); 
					
		
		input.close();
		
		
	}
}
