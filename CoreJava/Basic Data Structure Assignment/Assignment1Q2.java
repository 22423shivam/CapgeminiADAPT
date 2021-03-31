package CapgeminiAssignment;


class pract {
	public boolean armstrongCheck()
	{
		int number;
		int temp;
		int i,total;
		for(i = 100; i<1000; i++)
		{
			total =0;
		number = i;
        while (number != 0)
        {
            temp = number % 10;
            total = total + temp*temp*temp;
            number /= 10;
        }

        if(i == total)
            System.out.println(i + " is an Armstrong number");
       
	}
		return true;
	}
}

public class Assignment1Q2{

	public static void main(String[] args) {
	pract a = new pract();
	{
		a.armstrongCheck();
	}
	
	}

}