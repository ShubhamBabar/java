package javaProject4;

import java.util.Scanner;

public class Volume_Of_Cone_Java_Program {
	public static void main(String[] args) {
		Scanner SC = new Scanner(System.in);
		System.out.println("**Volume of cone**");
		System.out.print("Enter the Radius Of Cone (in cm):");  
		float radius = SC.nextFloat();
		
		System.out.print("Enter the Height Of Cone (in cm):");  
		float height = SC.nextFloat();
		 
		double volume = (3.1416/3) *  height * radius *radius;//formula for volume of cone is (3.1416/3 * h * r^2).
		
		System.out.println("Volume of Cone is "+volume+" cm.");
		
		
	}
}
