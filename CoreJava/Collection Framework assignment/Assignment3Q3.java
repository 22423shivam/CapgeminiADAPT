package CapgeminiAssignment;
import java.util.ArrayList;
import java.util.ListIterator;

public class Assignment3Q3 {
    public static void main(String[] args) {
    	ArrayList<String> a = new ArrayList<String>();
    	a.add("One");
    	a.add("Two");
    	a.add("Three");
    	a.add("Four");
    	ListIterator<String> itr = a.listIterator();
    	System.out.println("Traversing elements in Forward direction");    
        while(itr.hasNext()){    
          
        System.out.println("index:"+itr.nextIndex()+" value:"+itr.next());    
        }    
    	
    	System.out.println("Traversing elements in backward direction");    
        while(itr.hasPrevious()){    
          
        System.out.println("index:"+itr.previousIndex()+" value:"+itr.previous());    
        }    
    }
}