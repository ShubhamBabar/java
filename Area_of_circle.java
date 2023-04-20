package javaProject4;
import java.util.Scanner;
public class Area_of_circle {
	
	public static void main(String[] args) {
		
		Scanner SC = new Scanner(System.in);
		System.out.println("Enter the Radius Of Circle :");  
		float radius = SC.nextFloat();
		 
		double Area = 3.1416 * radius * radius; //Formula for area of circle is (3.1416 * r ** 2)
		
		System.out.println("Area of Circle is "+Area+".");		
	
	}
}
