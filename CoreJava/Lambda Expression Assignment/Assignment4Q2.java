package CapgeminiAssignment;


interface Q2{
	public String Order(int a);
	}

public class Assignment4Q2 {

	public static void main(String[] args) {
		OrderInterface order= a-> {
			if(a>10000)
				return "Accepted";
			else
			return "Not Accpeted";
			
			
		};
		System.out.print(order.Order(20000));
		
	}
}