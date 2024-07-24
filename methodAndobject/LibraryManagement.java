package methodAndobject;

public class LibraryManagement {
	
	public static void main(String []args)
	{
		Library object2 = new Library();
		String SecondBookName = object2.addBook("The Cricket Nation");
		System.out.println(SecondBookName);
		object2.issueBook();
		
	}

}
