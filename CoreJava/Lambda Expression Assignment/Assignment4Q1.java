
package CapgeminiAssignment;

import java.io.InputStream;
import java.util.Scanner;

interface maths{
	int disp(int a, int b);
}
public class Assignment4Q1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number");
		int num1 = sc.nextInt(); 
		System.out.println("Enter Second number");
		int num2 = sc.nextInt();
		
		maths add=(a,b)-> a+b;
		System.out.println("Addition:"+add.disp(num1,num2));
	
		maths sub=(a,b)-> a-b;
		System.out.println("Subtraction:"+sub.disp(num1,num2));
		
		maths mul=(a,b)-> a*b;
		System.out.println("Multiplication:"+mul.disp(num1,num2));
		
		maths div=(a,b)-> {
		if(b==0) return 0;
		return a/b;
		};
		System.out.println("Division:"+div.disp(num1,num2));
	
	}