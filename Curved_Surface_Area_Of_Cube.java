package javaProject4;

import java.util.Scanner;

public class Curved_Surface_Area_Of_Cube {
	public static void main(String[] args) {
		
        Scanner SC = new Scanner(System.in);
		
		System.out.println("**Curved Surface area of Cube**");
		
		System.out.print("Enter the Length of Cube (in cm):");  
		double l = SC.nextDouble();
		
		 
		double sfarea = 6*l*l;
		
		System.out.println("Surface Area of Cube is "+sfarea+" cm^2.");
	}

}
