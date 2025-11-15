package Week2.Day1;

public class Library {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Library ll = new Library();
		ll.addBook(null);
		ll.issueBook();
	}
	public void addBook(String bookTitle)	{
		//return bookTitle;
		
		System.out.println(bookTitle + "Book added successfully");
			}
          public void issueBook()
          {
        	  System.out.println("Book issued successfully");
          }
	
}
