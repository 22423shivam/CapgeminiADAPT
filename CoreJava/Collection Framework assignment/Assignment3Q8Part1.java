package CapgeminiAssignment;

import java.util.ArrayList;
import java.util.Iterator;


public class Assignment3Q8Part1 
{       
    public static void main(String[] args) 
    {
        //Creating an ArrayList of integers
         
        ArrayList<Integer> list = new ArrayList<Integer>();
         
        //Adding elements to list
         
        list.add(1452);
         
        list.add(6854);
         
        list.add(8741);
         
        list.add(6542);
         
        list.add(3845);
         
        //Getting an Iterator from list
         
        Iterator<Integer> it = list.iterator();
         
        while (it.hasNext())
        {
            Integer integer = (Integer) it.next();
             
            list.add(8457);      //This will throw ConcurrentModificationException
        }
    }   
}
