package javaProject4;

import java.util.Scanner;

public class Perimeter_of_Rectangle {

	public static void main(String[] args) {
		   Scanner SC =new Scanner(System.in);
		   
		   System.out.println("**Perimeter Of Rectangle**");
		   
			System.out.print("Enter Height of Rectangle (in cm): ");
			float height =SC.nextFloat();
			
			System.out.print("Enter length of Rectangle (in cm): ");
			float length =SC.nextFloat();
			
			double Perimeter =  2*(height + length);//Formula for Perimeter of Rectangle is 2*(height + length) .
			
			System.out.print("Perimeter of Rectangle is " +Perimeter+" cm.");	

	}

}
