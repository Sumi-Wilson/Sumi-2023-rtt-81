package loops;

public class SbaTomorrow {
	public static void main(String[]args) {
	 int number = 12340;
     int sum2=0;
     while(number>0) {
     	int remainder = number%10;
     	System.out.println(remainder);
     	number =number/10;
     	System.out.println(number);
     	 sum2 = sum2+remainder;
     }
     System.out.println("sum of digits is : " + sum2 );
     sbaTomorrow s1= new sbaTomorrow();

}
}
