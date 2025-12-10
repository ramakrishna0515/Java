package practice.Test;

public class Strings {
	public static void main(String[] args) {
		
		String s1 = "Hello World";
		String s2 = new String("How are you");
		String s3 = "Hello World";
		String s4 = "hello";
		String s5 = new String("Hello");
		String s6 = "HELLO";
		
		
//		System.out.println(s1);
//		System.out.println(s2);
//		
//		System.out.println(s1.startsWith("H"));
//		System.out.println(s2.startsWith("are"));
//		
//		System.out.println(s1.endsWith("d"));
//		System.out.println(s2.endsWith("How"));
//		
//		System.out.println(s1.contains("w"));
//		System.out.println(s1.contains("W"));
//		System.out.println(s1.contains("Hello"));
		
		/*
		 * '==' operator verify the location of the value
		 *  'equals' method verify the value and case sensitive
		 */
//		System.out.println(s1==s3);  
//		System.out.println(s2==s5);
//		System.out.println(s4==s5);
//		System.out.println(s4.equals(s5));
//		System.out.println(s4==s6);
//		System.out.println(s4.equals(s6));  
		
//		System.out.println(s4.equalsIgnoreCase(s6));  //true - It avoids case sensitive
//		System.out.println(s4.equalsIgnoreCase(s5));  //true - It is even comparing Variable&Object format
		
//		System.out.println(s1.length());
//		System.out.println(s5.length());
		
		System.out.println(s3.trim());
		
		System.out.println(s1.toCharArray());
		
		System.out.println(s6.toLowerCase());
		System.out.println(s4.toUpperCase());
		
		
		
		
		
		

		
		
		
		
	}

}
