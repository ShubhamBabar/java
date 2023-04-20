package javaProject4;

import java.util.Scanner;

public class Area_of_Parallelogram {

	public static void main(String[] args) {
        Scanner SC =new Scanner(System.in);
		
		System.out.print("Enter Height of Parallelogram (in cm): ");
		float height =SC.nextFloat();
		
		System.out.print("Enter length of Parallelogram (in cm): ");
		float length =SC.nextFloat();
		
		double Area =  height * length;//Formula for area of Parallelogram is ( height * length) .
		
		System.out.print("Area of Parallelogram is " +Area+" cm.");	

	}

}
