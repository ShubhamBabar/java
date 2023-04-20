package javaProject4;
import java.util.*;
public class Area_of_Rectangle {

	public static void main(String[] args) {
		Scanner SC = new Scanner(System.in);
		System.out.print("Enter Height of Rectangle (in cm):");
		float height = SC.nextFloat();
		System.out.print("Enter Width of Rectangle (in cm):");
		float width = SC.nextFloat();
		double Area = height * width;
		System.out.println("Area of Rectangle is "+Area+" cm.");
	}
}
