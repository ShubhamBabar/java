package javaProject4;

import java.util.Scanner;

public class Sum_Of_N_no {
	
	
   public static void main(String args[]) {
	   
	   
	   System.out.println("**Sum Of N numbers Program**");
		Scanner sc = new Scanner(System.in);
		 int i,sum=0;
		 System.out.print("Enter the number : ");
		  int number=sc.nextInt();
		  //It is the sum of N numbers to calculate     
		  for(i=1;i<=number;i++){    
		       sum = sum +i ;
		  }    
		  System.out.println("Sum of "+number+" Numbers is: "+sum);    
		 } 

 }
	


