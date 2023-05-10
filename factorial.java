package javaProject4;
import java.util.*;
public class factorial {

	public static void main(String[] args) {
		System.out.println("**Factorial program**");
		Scanner sc = new Scanner(System.in);
		 int i,fact=1; 
		 System.out.print("Enter the number : ");
		  int number=sc.nextInt();
		  //It is the number to calculate factorial    
		  for(i=1;i<=number;i++){    
		      fact=fact*i;    
		  }    
		  System.out.println("Factorial of "+number+" is: "+fact);    
		 }  

	}

