package javaProject4;

import java.util.Scanner;

public class Perimeter_of_parallelogram {

	public static void main(String[] args) {
		   Scanner SC =new Scanner(System.in);
		   
		   System.out.println("**Perimeter Of Parallelogram**");
		   
			System.out.print("Enter width of Parallelogram (in cm): ");
			float width =SC.nextFloat();
			
			System.out.print("Enter length of Parallelogram (in cm): ");
			float length =SC.nextFloat();
			
			double Perimeter =  2*(width + length);//Formula for Perimeter of Parallelogram is 2*(width + length) .
			
			System.out.print("Perimeter of Parallelogram is " +Perimeter+" cm.");	

	}

}
