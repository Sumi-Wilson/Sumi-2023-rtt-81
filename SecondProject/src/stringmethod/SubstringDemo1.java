package stringmethod;

public class SubstringDemo1 {

	public static void main(String[] args) {
	  String string ="This is astring";
	  String sub =string.substring(5,7);
	  System.out.println(sub);
	  
	  String fileName="someimage.jpg";
	  String ext = fileName.substring(fileName.lastIndexOf("."));
	  System .out.println(ext);
	  //with out .
	  String ext1 = fileName.substring(fileName.lastIndexOf(".")+1);
	  System .out.println("with out dot "+ext1);
	  String name = "Sumi Wilson";
	  String firstname =name.substring(0,name.indexOf(" "));
	  System .out.println(firstname);
	  String lastname = name.substring(name.indexOf(" ")+1);
	  System .out.println(lastname);
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  

	}

}
