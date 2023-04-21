package javaProject4;

import java.util.Scanner;

public class Volum_of_Prism {

	public static void main(String[] args) {
		Scanner SC = new Scanner(System.in);
		
		System.out.println("**Volume of Prism**");
		
		System.out.print("Enter the Base Of Prism (in cm):");  
		float base = SC.nextFloat();
		
		System.out.print("Enter the Length Of Prism (in cm):");  
		float length = SC.nextFloat();
		
		System.out.print("Enter the Height Of Prism (in cm):");  
		float height = SC.nextFloat();

		 
		double volume = base * length * height;//formula for volume of cone is base * length * height.
		
		System.out.println("Volume of Prism is "+volume+" cm."); 
		
		

	}

}
