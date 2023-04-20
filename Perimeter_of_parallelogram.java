package javaProject4;

import java.util.Scanner;

public class Perimeter_of_parallelogram {

	public static void main(String[] args) {
		   Scanner SC =new Scanner(System.in);
		   
		   System.out.println("**Perimeter Of Parallelogram**");
		   
			System.out.print("Enter Height of Parallelogram (in cm): ");
			float height =SC.nextFloat();
			
			System.out.print("Enter Base of Parallelogram (in cm): ");
			float base =SC.nextFloat();
			
			double Perimeter =  2*(height + base);//Formula for Perimeter of Parallelogram is 2*(height + base) .
			
			System.out.print("Perimeter of Parallelogram is " +Perimeter+" cm.");	

	}

}
