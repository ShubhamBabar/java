package javaProject4;

import java.util.Scanner;

public class Area_of_Parallelogram {

	public static void main(String[] args) {
        Scanner SC =new Scanner(System.in);
		
		System.out.print("Enter Height of Parallelogram (in cm): ");
		float height =SC.nextFloat();
		
		System.out.print("Enter Base of Parallelogram (in cm): ");
		float base =SC.nextFloat();
		
		double Area =  height * base;//Formula for area of Parallelogram is ( height * base) .
		
		System.out.print("Area of Parallelogram is " +Area+" cm.");	

	}

}
