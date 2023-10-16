package exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		// use while and break
		int x=1;
		  
			try {
				// while(x!=0) {
				for(int i=0;i<5;i++) {
				System.out.println("Please enter a number:");
				System.out.println("Enter 0 to Exit");
				x = scanner.nextInt();
				// this executes only when no exception occurs
				System.out.println("you entered number " + x);
				//break;
				 }
			} catch (Exception e) {
				// this code executes only when exception occurs
				System.out.println("you did not enter number");
				//e.printStackTrace();
				//break;
				x = scanner.nextInt();
			} /*finally {
				System.out.println("this executes no matter what");
				x = scanner.nextInt();
				//scanner.close();
			}
		//Scanner input = new Scanner(System.in);
	    /*while(true){
	        try {
	            int choice = input.nextInt();
	            System.out.println("Input was " + choice);
	        } catch (InputMismatchException e){
	            String bad_input = input.next();
	            System.out.println("Bad input: " + bad_input);
	            continue;
	        }*/
	    }
		   }	
		
        

