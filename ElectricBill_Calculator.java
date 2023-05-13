package javaProject4;
import java.util.*;

public class ElectricBill_Calculator {

	public static void main(String[] args) {
	   Scanner SC = new Scanner(System.in);
	   
	   System.out.print("Enter Watts / Units :");
	   int a= SC.nextInt();
	   
	   System.out.print("Enter Cost Per Unit :");
	   int b= SC.nextInt(); 
	
		ElectricityBill(a, b);
    }

    public static void ElectricityBill (int watts,int costPerUnit){
     

       int totalCost = watts*costPerUnit;
       System.out.println("Total Cost is "+totalCost);

        
    }
}
