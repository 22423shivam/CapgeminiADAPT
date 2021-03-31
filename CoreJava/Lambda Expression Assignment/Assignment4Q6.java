package CapgeminiAssignment;

import java.util.ArrayList;

public class Assignment4Q6 {

	public static void main(String[] args) {
		
		ArrayList<String> li=new ArrayList<String>();
		li.add("rahul");
		li.add("krishan");
		li.add("nihal");
		li.add("Abhik");
		
		System.out.println(li+"\n");
	
	li.stream().forEach(x->System.out.println(x.replaceAll(x, x.toUpperCase())));
	
	}
}