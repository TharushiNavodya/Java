class Student
{
	//create class similar to C++ class create 
	//but end of the class not use a ; 
	private int studentID;
	private String studentName;
	private int marksOOC;
	private int marksSPM;
	private int marksISDM;
	
	public Student(int studentID,String studentName,int marksOOC,int marksSPM,int marksISDM)
	{
		this.studentID = studentID;
		this.studentName = studentName;
		this.marksOOC = marksOOC;
		this.marksSPM =marksSPM;
		this.marksISDM = marksISDM;
		
	}
	
	public void setStudentDetails(int studentID,String studentName)
	{
		this.studentID = studentID;
		this.studentName = studentName;
	}
	
	public void setMarksOOC(int marksOOC)
	{
		this.marksOOC = marksOOC;
	}
	
	public int getMarksOOC()
	{
		return this.marksOOC;
	}
	
	public void setMarksSPM(int marksSPM)
	{
		this.marksSPM = marksSPM;
	}
	
	public int getMarksSPM()
	{
		return this.marksSPM;
	}
	
	public void setMarkISDM(int marksISDM)
	{
		this.marksISDM = marksISDM;
	}
	
	public int getMarksISDM()
	{
		return this.marksISDM;
	}
}
public class Main3
{
	public static void main(String []args)
	{
		//create object 
		//in java all object are create dynamic way 
		//in java have not pointer concept 
		
		Student s1 = new Student(1234,"Kamal",85,80,75);
		Student s2 = new Student(4567,"Saman",65,50,45);
		Student s3 = new Student(7891,"Nimal",98,75,80);
		Student s4 = new Student(1212,"Sunil",35,60,40);
		
		//main program calculate the average marks of each subject 
		
		System.out.println("Avarage OOC Marks :"+(s1.getMarksOOC()+s2.getMarksOOC()+s3.getMarksOOC()+s4.getMarksOOC()));
		System.out.println("Avarage SPM Marks :"+(s1.getMarksSPM()+s2.getMarksSPM()+s3.getMarksSPM()+s4.getMarksSPM()));
		System.out.println("Avarage ISDM Marks :"+(s1.getMarksISDM()+s2.getMarksISDM()+s3.getMarksISDM()+s4.getMarksISDM()));
	}
	
}