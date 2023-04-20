package javaProject4;

import java.util.Scanner;

public class Area_of_Rhombus {

	public static void main(String[] args) {
        Scanner SC =new Scanner(System.in);
        
		System.out.println("**Area Of Rhombus**");
		
		System.out.print("Enter length of First Diagonal of Rhombus(in cm): ");
		float d1 =SC.nextFloat();
		
		System.out.print("Enter length of Second Diagonal of Rhombus(in cm): ");
		float d2=SC.nextFloat();
		
		double Area = 0.5 * d1 * d2;//Formula for area of Rhombus is (1/2 * d1 * d2) .
		
		System.out.print("Area of Triangle is " +Area+" cm.");	

	}

}
