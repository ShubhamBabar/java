package javaProject4;
import java.util.*;
public class Fibonacci_Series_In_Java_Programs {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("** Fibonacci Series **");
		System.out.print("Enter Boundary Of Series : ");
		int boundary = sc.nextInt();
		
		int n1=0,n2=1,n3;
		System.out.print(n1+" "+n2);//printing 0 and 1
		
		for(int i=2;i<boundary;i++)
			//loop starts from 2 because 0 and 1 are already printed
			n3=n1+n2;
			
			System.out.print(" "+n3);
			
			n1=n2;
			n2=n3;
			
			
		}

	}

}
