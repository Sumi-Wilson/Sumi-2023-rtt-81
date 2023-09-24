package variable;

import java.util.Scanner;
import java.text.DecimalFormat;


public class TaxFiling {
	public static void main(String[]args) {
		DecimalFormat df= new DecimalFormat("$0.00");
		System.out.println("enter martial status");
		System.out.println("Enter 1 for single ");
		System.out.println("Enter 2 for married and filing joint ");
		System.out.println("Enter 3 for married and filing seperste");
		System.out.println("Enter 4 for  head of household");
		Scanner sc= new Scanner(System.in);
		int s1 = sc.nextInt();
		System.out.println("enter salary");
		double sal = sc.nextDouble();
		//double tax=0.0;
		switch (s1) {
		case  (1):
		//System.out.println("hai");
		//double tax =0.0;
		if(sal>=0 && sal<=8350) {
			double tax = sal/10;
			System.out.println("Tax amount is: " +df.format(tax));
		}
		else if(sal>=851 && sal<=67900) {
			double tax = sal/15;
			System.out.println("Tax amount is: " +df.format(tax));
		}
		else if(sal>=33951 && sal<=82250) {
			double tax = sal/25;
			System.out.println("Tax amount is: " +df.format(tax));
		}
		else if(sal>=82251 && sal<=171550) {
			double tax = sal/28;
			System.out.println("Tax amount is: " +df.format(tax));
		}
		else if(sal>=171550 && sal<=372950) {
			double tax = sal/33;
			System.out.println("Tax amount is: " +df.format(tax));
		}
		else if(sal>372951) {
			double tax = sal/235;
			System.out.println("Tax amount is: " +df.format(tax));
		}
		break;
		
		case (2):
			if(sal>=0 && sal<=8350) {
				double tax = sal/10;
				System.out.println("Tax amount is: " +df.format(tax));
			}
			else if(sal>=851 && sal<=67900) {
				double tax = sal/15;
				System.out.println("Tax amount is: " +df.format(tax));
			}
			else if(sal>=33951 && sal<=82250) {
				double tax = sal/25;
				System.out.println("Tax amount is: " +df.format(tax));
			}
			else if(sal>=82251 && sal<=171550) {
				double tax = sal/28;
				System.out.println("Tax amount is: " +df.format(tax));
				
			
			}
			else if(sal>=171550 && sal<=372950) {
				double tax = sal/33;
				System.out.println("Tax amount is: " +df.format(tax));
			}
			else if(sal>372951) {
				double tax = sal/35;
				System.out.println("Tax amount is: " +df.format(tax));
			}
			
		    break;
		case(3):
			if(sal>=0 && sal<=8350) {
				double tax = sal/10;
				System.out.println("Tax amount is: " +df.format(tax));
			}
			else if(sal>=851 && sal<=67900) {
				double tax = sal/15;
				System.out.println("Tax amount is: " +df.format(tax));
			}
			else if(sal>=33951 && sal<=82250) {
				double tax = sal/25;
				System.out.println("Tax amount is: " +df.format(tax));
			}
			else if(sal>=82251 && sal<=171550) {
				double tax = sal/28;
				System.out.println("Tax amount is: " +df.format(tax));
			}
			else if(sal>=171550 && sal<=372950) {
				double tax = sal/33;
				System.out.println("Tax amount is: " +df.format(tax));
			}
			else if(sal>372951) {
				double tax = sal/35;
				System.out.println("Tax amount is: " +df.format(tax));
			}
		    break;
		case(4):
			if(sal>=0 && sal<=8350) {
				double tax = sal/10;
				System.out.println("Tax amount is: " +df.format(tax));
			}
			else if(sal>=851 && sal<=67900) {
				double tax = sal/15;
				System.out.println("Tax amount is: " +df.format(tax));
			}
			else if(sal>=33951 && sal<=82250) {
				double tax = sal/25;
				System.out.println("Tax amount is: " +df.format(tax));
			}
			else if(sal>=82251 && sal<=171550) {
				double tax = sal/28;
				System.out.println("Tax amount is: " +df.format(tax));
			}
			else if(sal>=171550 && sal<=372950) {
				double tax = sal/33;
				System.out.println("Tax amount is: " +df.format(tax));
			}
			else if(sal>372951) {
				double tax = sal/35;
				System.out.println("Tax amount is: " +df.format(tax));
			}
		    break;
		
			
		}
			
		
		    
			
			
			
		
		
		}

}
