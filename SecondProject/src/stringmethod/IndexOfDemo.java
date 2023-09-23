package stringmethod;

//11:)indexOf Method
public class IndexOfDemo {
	public static void main(String[] args) {
		String str1 = "java is fun";
		int result;
		result = str1.indexOf('s');
		System.out.println(result);
		result = str1.lastIndexOf('j');
		System.out.println(result);
		result = str1.lastIndexOf("sdf");
		System.out.println(result);

	}

}
