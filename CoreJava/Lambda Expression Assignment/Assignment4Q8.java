package CapgeminiAssignment;

import java.util.ArrayList;

public class Assignment4Q8 {

	public static void main(String[] args) {
		ArrayList<Integer> a=new ArrayList<Integer>();
		a.add(100);
		a.add(40);
		a.add(60);
		a.add(85);
		a.add(78);
		a.add(32);
	
	Thread t=new Thread()
	{
		 public void run(){
			 System.out.println(a);
		 }
	};
	t.start();
	}
}