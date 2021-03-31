package CapgeminiAssignment;

import java.util.Set;
import java.util.TreeSet;

class Person implements Comparable<Person>{  
     String name;
     int height;
     double weight; 
public Person(String name, int height, double weight) {  
    this.name = name;  
    this.height = height;  
    this.weight = weight;
}  
public int compareTo(Person b) {  
    if(weight>b.weight){  
        return -1;  
    }else if(weight<b.weight){  
        return 1;  
    }else{
    	return 0;
    }
   
}  
}  
public class Assignment3Q1 {  
public static void main(String[] args) {  
    Set<Person> set=new TreeSet<Person>();  
    //Creating Books  
    Person b1=new Person("Akshat",5,55.5);  
    Person b2=new Person("Akshansh",6,50.6);  
    Person b3=new Person("Rahul",6, 55.6);  
    //Adding Books to TreeSet  
    set.add(b1);  
    set.add(b2);  
    set.add(b3);  
    //Traversing TreeSet  
    for(Person b:set){  
    System.out.println(b.name+" "+b.height+" "+b.weight);  
    }  
}  
}Q1