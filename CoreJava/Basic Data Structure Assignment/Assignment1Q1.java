package CapgeminiAssignment;

import java.util.Scanner;

class pract {
	public boolean armstrongCheck()
	{
		int num1, number, temp, total = 0;
		System.out.println("Ënter 3 Digit Number");
        Scanner scanner = new Scanner(System.in);
        num1 = scanner.nextInt();
		number = num1;
        while (number != 0)
        {
            temp = number % 10;
            total = total + temp*temp*temp;
            number /= 10;
        }

        if(total == num1)
            System.out.println(num1 + " is an Armstrong number");
        return true;
	}

}
public class Assignment1Q1{

	public static void main(String[] args) {
	pract a = new pract();
	{
		a.armstrongCheck();
	}
	}

}