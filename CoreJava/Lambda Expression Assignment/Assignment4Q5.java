package CapgeminiAssignment;

import java.util.ArrayList;

public class Assignment4Q5 {

	public static void main(String[] args) {

		ArrayList<String> li = new ArrayList<String>();
		li.add("Surabhi");
		li.add("Wheat");
		li.add("Esha");
		li.add("Eliana");
		li.add("Teju");
			
		System.out.println("The list is : "+li + "\n");
        System.out.println("the first alphabet of each word in the list of words");
		li.stream().forEach(x -> System.out.print( "\n" +x.charAt(0)));

	}

}