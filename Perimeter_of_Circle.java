package javaProject4;

import java.util.Scanner;

public class Perimeter_of_Circle {

	public static void main(String[] args) {
        Scanner SC =new Scanner(System.in);
        
		System.out.println("**Perimeter Of Circle**");
		
		System.out.print("Enter Radius of Circle (in cm): ");
		float r1 =SC.nextFloat();
		
		
		double Perimeter = 2* 3.1416 * r1;//Formula for Perimeter Of Circle is (2 * 3.1416(pi) * radius) .
		
		System.out.print("Perimeter Of Circle is " +Perimeter+" cm.");	

	}

}
