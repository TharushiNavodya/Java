import java.io.BufferedReader;
import java.io.InputStreamReader;

class Course
{
	private int courseID;
	private String courseName;
	private int creditPoint;
	
	public Course()
	{
		this.creditPoint = 0;
		this.courseName = "";
		this.courseID =0;
	}
	public void setCourseDetails(int courseID,String courseName,int creditPoint)
	{
		this.creditPoint = creditPoint;
		this.courseName = courseName;
		this.courseID =courseID;
	}
	
	public void DisplayCourseDetails()
	{
		System.out.println("Course ID ="+this.courseID);
		System.out.println("Course Name ="+this.courseName);
		System.out.println("Credit Points ="+this.creditPoint);
	}
	
	public void setsetCreditPoint(int creditPoint)
	{
		this.creditPoint = creditPoint;
	}
}

public class Main6
{
	public static void main(String []args)throws Exception
	{
		Course c1 = new Course();
		Course c2 = new Course();
		Course c3 = new Course();
		Course c4 = new Course();
		
		InputStreamReader I = new InputStreamReader(System.in);
		BufferedReader Br = new BufferedReader(I);
		
		c1.setCourseDetails(1050, "OOC", 2);
		c2.setCourseDetails(1060, "SPM", 3);
		c3.setCourseDetails(1100, "IWT", 4);
		c4.setCourseDetails(1090, "ISDM", 4);
		
		System.out.print("Input new OOC credit point :");
		c1.setsetCreditPoint(Integer.parseInt(Br.readLine()));
		
		System.out.print("Input new SPM credit point :");
		c2.setsetCreditPoint(Integer.parseInt(Br.readLine()));
		
		System.out.print("Input new IWT credit point :");
		c3.setsetCreditPoint(Integer.parseInt(Br.readLine()));
		
		System.out.print("Input new ISDM credit point :");
		c4.setsetCreditPoint(Integer.parseInt(Br.readLine()));
		
		c1.DisplayCourseDetails();
		c2.DisplayCourseDetails();
		c3.DisplayCourseDetails();
		c4.DisplayCourseDetails();
	}
}