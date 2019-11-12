package mainpack;

import bookpack.Book;

public class Main {

	public static void main(String[] args) {
		
		Book book1 = new Book(3452, "Physics", 3000, "Science");
		Book book2 = new Book(9846, "Maths", 2000, "Science");
		
		System.out.println(book1);
//	    System.out.println(book1.getDetails());
//	    System.out.println(book2.getDetails());
	}

}
