import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

class Student
{
	private int StudentID;
	private String name;
	private String degree;
	private String mobile;
	private static int max = 0;
	
	public Student(String name, String degree, String mobile) 
	{
		this.name = name;
		this.degree = degree;
		this.mobile = mobile;
		this.StudentID = getNextStudentID();
		
	}
	static public int getNextStudentID()
	{
		if(max<=100)
		{
			max = max + 1;
		}
		return max;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public void setDegree(String degree)
	{
		this.degree = degree;
	}
	
	public void setMobile(String mobile)
	{
		this.mobile = mobile;
	}
	
	public String getName()
	{
		return this.name;
	}
	
	public String getDegree()
	{
		return this.degree;
	}
	
	public String getMobile()
	{
		return this.mobile;
	}
	
	public void print()
	{
		System.out.println("Student ID : "+this.StudentID);
		System.out.println("Name   :"+this.getName());
		System.out.println("Degree :"+this.getDegree());
		System.out.println("Mobile :"+this.getMobile());
		
	}
	
}

public class Main
{
	public static void main(String []args)throws Exception
	{

		String name;
		String degree;
		String mobile;
		
		InputStreamReader I = new InputStreamReader(System.in);
		BufferedReader Br = new BufferedReader(I);
		
		List <Student>  student = new ArrayList<>();
		
		for(int i = 0; i < 2; i++ )
		{
			System.out.println("Enter student name :");
			name = Br.readLine();
			
			System.out.println("Enter degree :");
			degree = Br.readLine();
			
			System.out.println("Enter mobile :");
			mobile = Br.readLine();
			
			student.add(new Student(name,degree,mobile));
		}
		
		for(Student value:student)
		{
			value.print();
		}
		
		
	}
}