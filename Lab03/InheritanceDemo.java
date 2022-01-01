
import java.io.BufferedReader;
import java.io.InputStreamReader;
//Lab 3 
// Exercise 01/02/03/04
class Person
{
	private String name;
	private String Address;
	
	public Person(String name,String Address)
	{
		this.name = name;
		this.Address = Address;
	}
	
	public void ShowDetails()
	{
		System.out.println("= Person Details =\r");
		System.out.println("Name    :"+this.name);
		System.out.println("Address :"+this.Address);
	}
}

public class InheritanceDemo
{
	public static void main(String []args)throws Exception
	{
		String name;
		String Address;
		
		InputStreamReader I = new InputStreamReader(System.in);
		BufferedReader Br = new BufferedReader(I);
		
		System.out.println("Enter the name :");
		name = Br.readLine();
		
		System.out.println("Enter the address :");
		Address = Br.readLine();
		
		Person P = new Person(name,Address);
		
		P.ShowDetails();
	}
}