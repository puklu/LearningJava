package manipulationPack;

import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) {
		
		String str1 = "WELcome";
		String str2 = "Aughra";
		System.out.println("length "+str1.length());
		System.out.println(str1.charAt(1));
		System.out.println(str1.toLowerCase());
		
		System.out.println(str1);
		
		String str3 = str1.substring(1, 4)+str2;
		System.out.println(str3);
		
		System.out.println(str3.replace('c', 'U'));
		System.out.println(str3.replace("Aug", "AUG"));
        
		
		String str4 = "Jaba the hut";
		String[] words = str4.split(" ");
		for (String str: words) {
			System.out.print(str+ "   ");
		}
		
		StringTokenizer st = new StringTokenizer("http://10.122.23.43://56", ":" );
		while(st.hasMoreElements()) {
			System.out.println(st.nextToken());
		}
	}

}
