package training1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the number of elements of the array ");
		int n=sc.nextInt();
		
		String[] names = new String[n];
		
		for(int i=0; i<n; i++) {
			names[i]=sc.next();
		}
		
		for(String ele:names) {
			System.out.println(ele);
		}
		
		//searching for a strig in the array
		System.out.println("please enter what you want to search for:");
		String str = sc.next();
		for (String ele:names) {
			if(ele.equalsIgnoreCase(str)) {
				System.out.println(ele+" found");
			}
			
		}
		
		
		sc.close();

	}

}
