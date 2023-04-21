package javaProject4;

import java.util.Scanner;

public class Curved_Surface_area_of_Cylinder {
	public static void main(String[] args) {
		
		    Scanner SC = new Scanner(System.in);
			
			System.out.println("**Curved Surface area of Cylinder**");
			
			System.out.print("Enter the height of Cylinder (in cm):");  
			double h = SC.nextDouble();
			
			System.out.print("Enter the Radius of Cylinder (in cm):");  
			double r = SC.nextDouble();
			 
			double Csfarea = (2 *3.1416 *r*h);//formula is (2π r h).
			
			System.out.println("Surface Area of Cube is "+Csfarea+" cm^2.");
	}

}
