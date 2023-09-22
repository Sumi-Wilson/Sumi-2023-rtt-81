package variable;

public class StringExample {
	public static void main(String[] args) {
		String s1 = "welcome";
		String s = new String("welcome");
		String S2 = "welcome";
		if (s1.equals(S2)) {
			System.out.println("String are same");
		} else {
			System.out.println("String are  not the same");
		}
		String upper = s1.toLowerCase();
		String lower = s1.toUpperCase();
		System.out.println(upper);
		System.out.println(lower);
		String ss = s1.trim();
		//System.out.println("trim" + ss);
		s1 =s1.replaceAll("e","E");
		System.out.println(s1);
	}
}