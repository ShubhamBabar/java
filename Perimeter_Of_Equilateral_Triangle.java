package javaProject4;

import java.util.Scanner;

public class Perimeter_Of_Equilateral_Triangle {

	public static void main(String[] args) {
Scanner SC =new Scanner(System.in);
        
		System.out.println("**Perimeter Of Equilateral Triangle**");
		
		System.out.print("Enter length of one side of Equilateral Triangle (in cm): ");
		float S1 =SC.nextFloat();
		
		
		double Perimeter = 3 * S1;//In Equilateral Triangle all three sides of are equal.Formula for Perimeter Of Equilateral Triangle is (3 * a). where a is length of side.
		
		System.out.print("Perimeter Of Equilateral Triangle is " +Perimeter+" cm.");

	}

}
