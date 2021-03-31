package CapgeminiAssignment;

import java.util.ArrayList;

class Manager extends Assignment2Q2 {
    @Override
    public int getSalary(int salary) {
        int incentive = 5000;
        salary+=incentive; 
		return salary;
    }
}

class Labour extends Assignment2Q2 {
    @Override
    public int getSalary(int salary) {
        int overtime = 500;
        salary+=overtime; 
		return salary;
    }
}

public class Assignment2Q2 {
    int salary;
    public int getSalary(int salary){
		return salary;}
   
    
    public static void main(String[] args) {
    	Labour a = new Labour();
    	System.out.println("Salary of Labour is : "+a.getSalary(5000));
    	Manager b = new Manager();
    	System.out.println("Salary of Manager is : "+b.getSalary(30000));
    	
    }
}