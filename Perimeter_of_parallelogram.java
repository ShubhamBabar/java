package javaProject4;

import java.util.Scanner;

public class Perimeter_of_parallelogram {

	public static void main(String[] args) {
		   Scanner SC =new Scanner(System.in);
		   
		   System.out.println("**Perimeter Of Parallelogram**");
		   
			System.out.print("Enter value of side of Parallelogram (in cm): ");
			float side =SC.nextFloat();
			
			System.out.print("Enter base of Parallelogram (in cm): ");
			float base =SC.nextFloat();
			
			double Perimeter =  2*(side + base);//Formula for Perimeter of Parallelogram is 2*(side + base) .
			
			System.out.print("Perimeter of Parallelogram is " +Perimeter+" cm.");	

	}

}
