package arrays;
import java.util.Scanner;

public class InsertElements {
	public static void main(String[]args) {
		int i, element;
		int[] num= new int[11];
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter 10 elements: ");
		for(i =0;i<10;i++) {
			num[i]= sc.nextInt();
		}
		System.out.println("Enter element to insert: ");
		element=sc.nextInt();
		num[i]=element;
		
		System.out.println("\nNow the new array is: ");
		for(i=0; i<11; i++)
		System.out.print(num[i]+ " ");

		
		
		
		
		
		
		
		
	}
	

}
