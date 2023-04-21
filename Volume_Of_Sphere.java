package javaProject4;

import java.util.Scanner;

public class Volume_Of_Sphere {

	public static void main(String[] args) {
		Scanner SC = new Scanner(System.in);
		
		System.out.println("**Volume Of Sphere**");
		
		System.out.print("Enter the Radius Of Sphere (in cm):");  
		double r = SC.nextDouble();
		 
		double volume = (4 * 3.1416 * r *r *r)/3;
		
		System.out.println("Volume of Sphere is "+volume+" cm.");

	}

}
