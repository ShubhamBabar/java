package javaProject4;

import java.util.Scanner;

public class Volume_Of_Cylinder {
	public static void main (String[] args) {
		
		Scanner SC = new Scanner(System.in);
		
		System.out.println("**Volume Of Cylinder**");
		
		System.out.print("Enter the Radius Of Cylinder (in cm):");  
		float radius = SC.nextFloat();
		
		System.out.print("Enter the Height Of Cylinder (in cm):");  
		float height = SC.nextFloat();
		 
		double volume = 3.1416 * radius * radius * height;//formula for volume of cylinder is (pi *r^2 *h ).
		
		System.out.println("Volume of Cylinder is "+volume+" cm.");
		
		
	}

}
