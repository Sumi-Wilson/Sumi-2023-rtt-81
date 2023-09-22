package stringmethod;
//6:) Concat Method

public class concatDemo {
	public static void main(String[] args) {
		String str1 = "Learn ";
		;
		String str2 = "java";
		System.out.println(str1.concat(str2));
		System.out.println(str2.concat(str1));

		String s1 = "Hello ";
		String s2 = "Learners";
		String s3 = s1 + s2;
		System.out.println(s3);

		String msg = "welcome" + " to" + " Java";
		System.out.println(msg);

		String s = "Chapter " + 2;
		System.out.println(s);

		String ss = "Supplement " + 'B';
		System.out.println(ss);

	}

}
