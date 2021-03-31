package CapgeminiAssignment;

import java.util.Scanner;

class TaxAmount{
    public double calculateTaxAmount(){
    	int tax;
    	Scanner sc=new Scanner(System.in);
		System.out.print("Enter CTC= ");
		int ctc =sc.nextInt();
		
		if(ctc<180001)
		{
			tax = 0;
			System.out.println("Tax is : " +tax);
		}
		else if(ctc>180000 && ctc < 300001)
		{
			tax = ctc*10/100;
			System.out.println("Tax is : " +tax);
		}
		else if(ctc>300000 && ctc < 500001)
		{
			tax = ctc*20/100;
			System.out.println("Tax is : " +tax);
		}
		else if(ctc>500000 && ctc < 1000001)
		{
			tax = ctc*30/100;
			System.out.println("Tax is : " +tax);
		}
		return 0;
  
    
    }
    }

    package practice;


public class Assignment1Q5 {
    public static void main(String args[]) {
    	TaxAmount a = new TaxAmount();
    	{
    		a.calculateTaxAmount();
    	}
    			
    }
}