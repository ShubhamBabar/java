package javaProject4;

import java.util.Scanner;

public class Total_Surface_Area_Of_Cylinder {
	public static void main(String[] args) {
		
		    Scanner SC = new Scanner(System.in);
			
			System.out.println("**Total Surface area of Cylinder**");
			
			System.out.print("Enter the height of Cylinder (in cm):");  
			double h = SC.nextDouble();
			
			System.out.print("Enter the Radius of Cylinder (in cm):");  
			double r = SC.nextDouble();
			 
			double Tsfarea = (2 *3.1416 *r*h)+(2*3.1416*r*r	);//formula is (2π r h) + (2π r²).
			
			System.out.println("Surface Area of Cube is "+Tsfarea+" cm^2.");
		
	}
}
