package CapgeminiAssignment;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

class Assignment3Q2{  
 public static void main(String args[]){  
  //Creating HashSet and adding elements  
    HashSet<String> set=new HashSet();  
           set.add("One");    
           set.add("Two");    
           set.add("Three");   
           set.add("Four");  
           set.add("Five");  
           System.out.println("Hash set is unordered");
           Iterator<String> i=set.iterator();  
           while(i.hasNext())  
           {  
           System.out.println(i.next());  
           }  
           
           LinkedHashSet<String> set1=new LinkedHashSet();  
           set1.add("One");    
           set1.add("Two");    
           set1.add("Three");   
           set1.add("Four");  
           set1.add("Five");  
           System.out.println("Linked Hash set is ordered");
           Iterator<String> t=set1.iterator();  
           while(t.hasNext())  
           {  
           System.out.println(t.next());  
           }  
 }  
}  