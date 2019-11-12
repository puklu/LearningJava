package arrayListPack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		
//		ArrayList arrl = new ArrayList();
//		
//		arrl.add(12);
//		arrl.add("good afternoon");
//		arrl.add(13.5987);
//	
//		
//	    System.out.println(arrl);
		
		ArrayList<String> alist = new ArrayList<String>();
		
		alist.add("yes");
		alist.add("bo");
		alist.add("koko");
		alist.add("dolo");
		alist.add(2, "dochi");
//		alist.remove(3);
		System.out.println(alist);
		
		ArrayList<String> sublist = new ArrayList<String>();
		sublist.add("timon");
		sublist.add("pumba");
		
		alist.addAll(2, sublist);
		System.out.println(alist);
		
		Collections.sort(alist);
		
		
		System.out.println(alist);
		
		Iterator<String> it = alist.iterator();
		
		while(it.hasNext()) {
			System.out.print(it.next()+"  ");
		}
		
		String str = "koko";
		Iterator<String> it1 = alist.iterator();
		
		while(it1.hasNext()) {
			if(it1.next().equalsIgnoreCase(str)) {
				System.out.println(str+" found in the arraylist");;
			    break;
			}
			else {
				System.out.println(str+" not found ");
			    break;
			}
		}
		
		

	}

}
