package com.perscholas.java_basics;

public class JavaBasicsClass {
	public static void main(String[]args) {
		//adding to integers
		int number1 =10;
		int number2 =20;
		int result =number1 + number2;
		System.out.println("The sum is:"+result);
		
		
		//adding to double numbers
		double d1 = 150.05;
		double d2 = 50.75;
		double sum = d1+d2;
		System.out.println("The sum 2 of double numbers is :"+sum);
		
		//adding an integer and double
		int a1 =10;
		double a2 =25.50;
		double result1 = a1+a2;
		System.out.println("The sum of one integer and one double is:"+result1);
		
		
		//dividing 2 integer
		int b1=10;
		int b2=25;
		int result2 = b2/b1;
		System.out.println("the quotient is :"+ result2);
		//changing the dividend to decimal
		int c1=10;
		int c2= (int)25.5;
		int result3 = (int)c2/c1;
		System.out.println("the quotient is :"+result3);
		
		
		//dividing 2 double numbers and cast result to integer
		double x1 = 12.50;
		double x2 = 135.75;
		double q1 =x2/x1;
		System.out.println("Quotient in double:" + q1);
		int q2 = (int)q1;
		System.out.println("Quotient type casted to int:" + q2);
		
		
		//Dividing y/x(6/5),print the result and cast y to double and print it out
		int x,y;
		x=5;
		y=6;
		double q=y/x;
		System.out.println("x/y=" + q);
		q= (double)y;
		System.out.println("value of y typecast to double:" + q);
		
		
		//decalring a constant and using it
		
		double radius=18.98;
		final double PI = 3.1415;
		double area = PI*radius*radius;
		System.out.println("Area is :"+area);
		
		//coffe shop program
		
		double coffee = 3.35;
		double greenTea =2.75;
		double espreso = 5.25;
		double subtotal;
		double totalSale;
		subtotal =((3*coffee)+(4*greenTea)+(2*espreso));
		final double SALES_TAX = .19;
		totalSale = subtotal + (subtotal*SALES_TAX/100);
		System.out.println("Total sale is :" + totalSale);
		System.out.println("Total sale formated is :" + String.format("%.2f",totalSale));
		
		
		
		
		
		
		
		
		
		
		
	    }
}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	


