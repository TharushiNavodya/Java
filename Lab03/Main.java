//Exercise 05/06/07
import java.io.BufferedReader;
import java.io.InputStreamReader;

class Person
{
	protected String name;
	protected String Address;
	
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

class Student extends Person
{
	protected String studentID;
	
	public Student(String name,String Address,String studentID)
	{
		super(name,Address);
		this.studentID = studentID;
	}
	
	public void ShowDetails()
	{
		System.out.println("= Student Details =\r");
		System.out.println("Student ID :"+this.studentID);
		System.out.println("Name    :"+this.name);
		System.out.println("Address :"+this.Address);
		
	}
	
}

class PartTimeStudent extends Student 
{
	private int workingHours;
	
	public PartTimeStudent(String name,String Address,String studentID,int workingHours)
	{
		super(name,Address,studentID);
		this.workingHours = workingHours;
		
	}
	
	public void ShowDetails()
	{
		System.out.println("= Parttime Student Details =\r");
		System.out.println("Student ID :"+this.studentID);
		System.out.println("Name    :"+this.name);
		System.out.println("Address :"+this.Address);
		System.out.println("Working Hours:"+this.workingHours);
	}
	
}

public class Main
{
	public static void main(String []args)throws Exception
	{
		String name;
		String Address;
		String ID;
		int workingHours;
		
		InputStreamReader I = new InputStreamReader(System.in);
		BufferedReader Br = new BufferedReader(I);
		
		System.out.println("Enter the name :");
		name = Br.readLine();
		
		System.out.println("Enter the address :");
		Address = Br.readLine();
		
		System.out.println("Enter student ID :");
		ID = Br.readLine();
		
		System.out.println("Enter working Hours :");
		workingHours = Integer.parseInt(Br.readLine());
		
		PartTimeStudent PS = new PartTimeStudent(name,Address,ID,workingHours);
		
		PS.ShowDetails();
		
	}
}