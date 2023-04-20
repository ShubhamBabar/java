package javaProject4;

import java.util.Scanner;

public class Area_of_Equilateral_Triangle {

	public static void main(String[] args) {
        Scanner SC =new Scanner(System.in);
        
		System.out.println("**Area of Equilateral Triangle**");
		
		System.out.print("Enter length of one side(in cm): ");
		float s1 =SC.nextFloat();
			
		double Area = 1.732/4 * s1* s1;//In Equilateral Triangle all three sides have the same length.Formula for area of Equilateral Triangle is (1.732/4 * a* a).a is length of side .
		
		System.out.print("Area of Equilateral Triangle is " +Area+" cm.");	


	}

}
