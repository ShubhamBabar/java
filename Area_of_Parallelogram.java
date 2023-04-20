package javaProject4;

import java.util.Scanner;

public class Area_of_Parallelogram {

	public static void main(String[] args) {
        Scanner SC =new Scanner(System.in);
		
		System.out.print("Enter value of side of Parallelogram (in cm): ");
		float side =SC.nextFloat();
		
		System.out.print("Enter base of Parallelogram (in cm): ");
		float length =SC.nextFloat();
		
		double Area =  side * base;//Formula for area of Parallelogram is ( side * base) .
		
		System.out.print("Area of Parallelogram is " +Area+" cm.");	

	}

}
