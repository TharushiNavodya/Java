import java.io.BufferedReader;
import java.io.InputStreamReader;

public interface IInput {
	
	void input() throws Exception;

}

public interface IDisplay {
	
	void print();
	void printDetails();
}

public class Book implements IDisplay,IInput{
	
	private String bookID;
	private String title;
	private String publisher;
	
	public void print()
	{
		System.out.println("Book ID :"+this.bookID+"\nTitle   :"+this.title+"\nPublisher :"+this.publisher);
	}
	public void printDetails()
	{
		System.out.println("Book ID :"+this.bookID);
		System.out.println("Title   :"+this.title);
		System.out.println("Publisher :"+this.publisher);
	}
	public void input()throws Exception
	{
		InputStreamReader I = new InputStreamReader(System.in);
		BufferedReader Br = new BufferedReader(I);
		
		System.out.print("Enter Book ID :");
		this.bookID = Br.readLine();
		
		System.out.print("Ener Title :");
		this.title = Br.readLine();
		
		System.out.print("Enter Publisher :");
		this.publisher = Br.readLine();
	}

}
