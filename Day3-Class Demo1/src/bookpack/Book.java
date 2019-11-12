package bookpack;

public class Book {
	
	private int bookID;
	private String bookName;
	private int bookPrice;
	private String bookType;
	
	
	public Book(int bookID, String bookName, int bookPrice, String bookType) {
		super();
		this.bookID = bookID;
		this.bookName = bookName;
		this.bookPrice = bookPrice;
		this.bookType = bookType;
	}


	@Override
	public String toString() {
		return "Book [bookID=" + bookID + ", bookName=" + bookName + ", bookPrice=" + bookPrice + ", bookType="
				+ bookType + "]";
	}
	
//	public String getDetails() {
//		
//		return(bookID+" "+bookName+" "+bookPrice+" "+bookType);
//		
//	}
	
	
	
	
	

}
