package LargestAndSmallestElement;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Differencebetweenlargestandsmallestelements {
	
	public static ArrayList<Integer> display() {
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Integer> arr = new ArrayList<Integer>();
	       while(sc.hasNextInt()) {
	       arr.add(sc.nextInt());
	       }
	       
	       Collections.sort(arr);
	       
	       
	       return arr;
		
		
	}

	public static void main(String[] args) {
		
		int min=0;
		int max=0;
		int res=0;

		ArrayList<Integer> arrc = new ArrayList<Integer>();
       arrc=display();
       
       
//       System.out.println("size: "+arr.size());
       
       
       
       
       int size=arrc.size();
//       for(int i=0; i<arr.size(); i++) {
//    	   System.out.println("i="+arr.get(i));
//       }
       
       min=arrc.get(0);
       max=arrc.get(size-1);
       
      
       if(size==1) {
    	   System.out.println(arrc.get(0));
       }
       else       
        System.out.println( (max-min));
       
       
       
       
       
       
     
	}

}
