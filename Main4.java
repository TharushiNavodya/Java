import java.util.Scanner;

class Book
{
	private String bookID;
	private String bookName;
	private String author;
	
	public void setBookDetails(String bookID,String bookName,String author)
	{
		this.bookID = bookID;
		this.bookName = bookName;
		this.author = author;
	}
	
	public Book()
	{
		this.bookID = "";
		this.bookName = "";
		this.author = "";
	}
	
	public void DispalyBookDetails()
	{
		System.out.println("Book ID ="+this.bookID);
		System.out.println("Book Name ="+this.bookName);
		System.out.println("Author ="+this.author);
		
	}
	
	public void setBookID(String bookID)
	{
		this.bookID = bookID;
	}
}

public class Main4
{
	public static void main(String []args)
	{
		Book b1 = new Book();
		Book b2 = new Book();
		Book b3 = new Book();
		
		Scanner input = new Scanner(System.in);
		
		b1.setBookDetails("1212", "Jane Eyre", "Charlotte Bronte");
		b2.setBookDetails("1234", "Divergent", "Veronica Roth");
		b3.setBookDetails("3456", "Matilda", "Roald Dahl");
		
		System.out.println("Input New Book ID :");
		b1.setBookID(input.next());
		
		System.out.println("Input New Book ID :");
		b2.setBookID(input.next());
		
		System.out.println("Input New Book ID :");
		b3.setBookID(input.next());
		
		b1.DispalyBookDetails();
		b2.DispalyBookDetails();
		b3.DispalyBookDetails();
	}
}