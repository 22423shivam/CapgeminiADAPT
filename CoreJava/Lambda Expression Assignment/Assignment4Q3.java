package CapgeminiAssignment;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;


public class Assignment4Q3 {

	public static void main(String[] args) {
		
		int x=5;
		
		System.out.println("\nThis is for Predicate: ");
		Predicate<String> isALongWord = t -> t.length() > 10;    //predicate for filtering the data
		String s = "successfully";
		boolean result = isALongWord.test(s);
//other ex
		Predicate<Integer> greater = number -> number > 20;
		System.out.println("Is the number is greater then 20 ?  "+"\n" + greater.test(15));
		
		//here it expects predicate for filtering
		java.util.List<String> list=(java.util.List<String>) Arrays.asList("Zebra","Camel","Lion","Tiger","Rhino","Deer","Donkey","Cat");
		List<String> f=list.stream().filter(o->o.startsWith("D")).collect(Collectors.<String>toList());
		System.out.println(f);
		
		System.out.println("\n\nThis is for Consumer:");
		//accepts single arg no return
		Consumer<Integer> value= y ->{
			                             System.out.println("x= "+x);
			                             System.out.println("y= "+y);
		} ;
		value.accept(x);
		
		//function that accepts one argument and produces a result
		//to convert or transform from one object to another
		System.out.println("\n\nThis is for Function:");
		 Function<Integer,String> convert = number-> Integer.toString(number);        
	        System.out.println(convert.apply(12).length());
	        System.out.println(convert.apply(300).length());
	
	        //Basically, a Supplier just provides values
	        //it takes no arguments but it returns some value
	    	System.out.println("\n\n This is for Supplier:");
	    	  Supplier<String> name = () -> "Lonavala";
		        System.out.println(name.get()); 
	        
	        
	}

}