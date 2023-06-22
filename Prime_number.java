package javaProject4;
import java.util.*;


public class Prime_number {
	
	public static void main(String args[]) {
		
		System.out.println("**Prime Number Program**");
		
		int i,count=0;
		
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter Any Number :");
		int a =sc.nextInt();
				
		
		
		for(i=1;i<=a;i++) {
			
			if(a%i==0) {
				count++;
			}		
		}
		if(count==2) {
			System.out.println("Given Number Is Prime Number...");
		}
		else {
			
			System.out.println("Given Number Is Not Prime Number...");
		}		 
	} 

}
