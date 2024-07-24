package methodAndobject;

public class Library {

	public String addBook(String bookTitle) {
		return bookTitle;
	}
	public void issueBook()
	{
		System.out.println("Book issued successfully");
	}
	
	public static void main(String []args)
	{
		Library object = new Library();
		String BookName = object.addBook("Timeless Steel");
		System.out.println(BookName);
		object.issueBook();
	}
	
}