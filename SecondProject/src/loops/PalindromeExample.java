package loops;
import java.util.Scanner;

public class PalindromeExample {
	public static void main(String[]args) {
		String org,rev ="";
		System.out.println("Enter a string:");
		
		Scanner sc =new Scanner(System.in);
		org=sc.nextLine();
		int len =org.length();
		for(int i =len-1;i>=0;i--) {
			rev=rev+org.charAt(i);
		}
		if(org.equals(sc)) {
			System.out.println("Enterd string is palindrome:");
		}
		else
			System.out.println("Enterd string is not palindrome:");
;		
	}

}
