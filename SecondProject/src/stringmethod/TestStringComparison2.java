package stringmethod;

//17:)comparison using ==
public class TestStringComparison2 {
	public static void main(String args[]) {
		String s1 = "Perscholas";
		String s2 = "Perscholas";
		String s3 = new String("Perschols");
		System.out.println(s1 == s2);
		System.out.println(s1 == s3);
	}

}
