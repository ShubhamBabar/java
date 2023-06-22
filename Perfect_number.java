package javaProject4;
import java.util.*;

public class Perfect_number {
public static void main(String args[]) {
		
		System.out.println("**Prime Number Program**");
		
		int i,sum=0;
		
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter Any Number :");
		int a =sc.nextInt();
		
		for(i=1;i<a;i++) {
			
			if(a%i==0) {
				sum=sum+i;
			}		
		}
		if(a==sum) {
			System.out.println("Given Number Is Perfect Number...");
		}
		else {
			
			System.out.println("Given Number Is Not Perfect Number...");
		}		 
	} 

}
