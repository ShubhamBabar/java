package javaProject4;
import java.util.*;
public class Area_of_IsoscaleTriangle {

	public static void main(String[] args) {
		Scanner SC = new Scanner(System.in);
		
		System.out.print("Enter Height of Isosceles Triangle (in cm):");
		float height = SC.nextFloat();
		
		System.out.print("Enter Width of Isosceles Triangle (in cm):");
		float width = SC.nextFloat();
		
		double Area = 0.5 * height * width;//In Isosceles Triangle that has two sides of equal length.Formula is same as normal triangle .(1/2 * height * base).
		
		System.out.println("Area of Isosceles Triangle is "+Area+" cm.");

	}

}
