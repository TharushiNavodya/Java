class Student
{
	private String ID;
	private String Name;
	private int marks1;
	private int marks2;
	private int marks3;
	
	public Student(String ID,String Name)
	{
		this.ID = ID;
		this.Name = Name;
		this.marks1 = 0;
		this.marks2 = 0;
		this.marks3 = 0;
		
	}
	
	public void setMarks(int marks1,int marks2,int marks3)
	{
		this.marks1 = marks1;
		this.marks2 = marks2;
		this.marks3 = marks3;
	}
	public double CalculateAvarage()
	{
		return (this.marks1 + this.marks2+this.marks3)/3.0;
	}
	
	public void Display()
	{
		System.out.println("Student ID :"+this.ID);
		System.out.println("Student Name :"+this.Name);
		System.out.println("Avarage Mark :"+this.CalculateAvarage());
	}
}

public class Main01{
	public static void main(String [] args)
	{
		Student s1 = new Student("IT001","Ann");
		s1.setMarks(78, 65, 89);
		s1.Display();
	}
}
