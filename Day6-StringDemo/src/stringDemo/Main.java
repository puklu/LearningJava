package stringDemo;

public class Main {

	public static void main(String[] args) {
		
		String str1 = "Mava world";
		String str2 = "Mava world";
		String str3 = new String("Mava world");
		
		System.out.println(str1==str3);
		
		System.out.println(str1.equalsIgnoreCase(str3));
		
	}

}
