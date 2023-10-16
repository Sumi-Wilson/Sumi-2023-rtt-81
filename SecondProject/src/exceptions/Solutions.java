package exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Solutions {

    public static void main(String[] args) {
        try{
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 2 numbers");
        int n1=sc.nextInt();
        int n2 = sc.nextInt();
        System.out.println(n1/n2);
        }catch(InputMismatchException e){
            System.out.println(e);
            
        }catch(ArithmeticException e){
            System.out.println(e);
        }
    }
}
