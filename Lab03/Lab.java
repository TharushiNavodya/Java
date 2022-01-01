package Lab03;
import java.util.Scanner;

class Student
{
	private String name;
	private String ditno;
	private String Address;
	
	public Student(String name,String ditno,String Address)
	{
		this.name = name;
		this.ditno =ditno;
		this.Address = Address;
	}
	
	public void getDetails()
	{
		System.out.println("I am a student");
		System.out.println("My name is "+this.getname());
		System.out.println("I am from "+this.getAddress());
		System.out.println("My dit no is "+this.getditno());
	}
	
	public void setname(String name)
	{
		this.name = name;
	}
	
	public void setditno(String ditno)
	{
		this.ditno =ditno;
	}
	
	public void setAddress(String Address)
	{
		this.Address = Address;
	}
	
	public String getname()
	{
		return this.name;
	}
	
	public String getditno()
	{
		return this.ditno;
	}
	
	public String getAddress()
	{
		return this.Address;
	}

}

public class Lab
{
	public static void main(String []args)
	{
		String name;
		String ditno;
		String Address;
		
		Scanner input = new Scanner(System.in);
		
		Student S1 = new Student("Tharushi","IT21057106","Amabalantota");
		
		S1.getDetails();
		
		System.out.println("Enter student name :");
		name = input.next();
		
		System.out.println("Enter student DIT no :");
		ditno = input.next();
		
		System.out.println("Enter student Address :");
		Address  = input.next();
		
		Student S2 = new Student(name,ditno,Address);
		
		S2.getDetails();
		
	}
}