package javaProject4;

import java.util.Scanner;

public class Perimeter_of_Rhombus {

	public static void main(String[] args) {
		   Scanner SC =new Scanner(System.in);
		   
		    System.out.println("**Perimeter Of Rhombus**");
			
			System.out.print("Enter length of side of Rhombus (in cm): ");
			float length =SC.nextFloat();
			
			double Perimeter =  4*(length);//Formula for Perimeter of Rhombus is 4*(length) .
			
			System.out.print("Perimeter of Rhombus is " +Perimeter+" cm.");

	}

}
