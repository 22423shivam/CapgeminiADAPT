
package CapgeminiAssignment;
import java.util.Scanner;

public class Assignment1Q6 {
		public static void main(String[] args) {
			
			String username = null, pwd = null;
			String validUser = "akshat";
			String validPwd = "password";
			
			int counter = 0;
			Scanner scan = new Scanner(System.in);
	        
			while(1 > 0) {
				System.out.print("Enter your username : ");
		        username = scan.next();
		        System.out.print("Enter your password : ");
		        pwd = scan.next();
		        

		        if(username.equals(validUser) && pwd.equals(validPwd)) {
		        	System.out.println("Welcome, " + username);
		        	counter = 0;
		        	scan.close();
		        	System.exit(0);
		        } else {
		        	System.out.println("Invalid Username or Password");
		        	counter ++;
		        }
		        
		        if(counter == 3) {
		        	System.out.println("Contact Admin");
		        	scan.close();
		        	System.exit(0);
		        }
		        
			}
			
		}
 	}

