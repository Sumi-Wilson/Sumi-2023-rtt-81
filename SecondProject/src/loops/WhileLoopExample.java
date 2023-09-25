package loops;

public class WhileLoopExample {
	public static void main(String[]args) {
		int count =1;
		boolean condition =true;
		while(condition) {
		System.out.println("will run it");
		condition = false;
		}
		while(count<=10) {
			System.out.println("count is " +count);
			count++;
		}
	}

}
