package javaProject4;

import java.util.Scanner;

public class Perimeter_of_Square {

	public static void main(String[] args) {
		    Scanner SC =new Scanner(System.in);
		   
		    System.out.println("**Perimeter Of Square**");
			
			System.out.print("Enter length of Square (in cm): ");
			float length =SC.nextFloat();
			
			double Perimeter =  4*(length);//Formula for Perimeter of Square is 4*(length) .
			
			System.out.print("Perimeter of Square is " +Perimeter+" cm.");

	}

}
