package loops;

import java.util.Scanner;

public class SbaQuestions {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			sum = sum + i;
		}
		System.out.println("The sum of first 100 numbers is :" + sum);
		double remain =0.0;
		double remainSum =0.0;
		for(int i = 1;i<=100;i++)
		{
           remain= i%2;
           remainSum=remainSum+remain;
           
		}
		/*System.out.println("The sum of  remainders of first 100 numbers is :" + remainSum);
        System.out.println("Enter a number");
        int num = input.nextInt();
        while(num>0) {
        	if(num>=10) {
        		num= num-1;
        		System.out.println(num);
        	}
        	
        }*/
        //System.out.println(num);
        int sum1=0;
        for(int i=1;i<=100;i++) {
        	if(i%2==0) {
        		sum1 = sum1+i;
        	}
        	
        int count = 10;
        //int sum2;
        while(count>10) {
        	count=count-1;
        }
       // System.out.println("sum of digits is : " + sum2 );
		
	}
	}
}


	


