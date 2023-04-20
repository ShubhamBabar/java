package javaProject4;
import java.util.Scanner;
public class Area_of_Triangle {

	public static void main(String[] args) {
		
		Scanner SC =new Scanner(System.in);
		
		System.out.print("Enter Height of Triangle(in cm): ");
		float height =SC.nextFloat();
		
		System.out.print("Enter Base of Triangle(in cm): ");
		float base =SC.nextFloat();
		
		double Area = 0.5 * height * base;//Formula for area of triangle is (1/2 * height * base) .
		
		System.out.print("Area of Triangle is " +Area+" cm.");	
	}
}
