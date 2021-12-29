import java.io.*;
class Point3D
{
	private float x;
	private float y;
	private float z;
	
	public Point3D(float x,float y,float z)
	{
		this.x = x;
		this.y = y;
		this.z = z;
		
	}
	public double distance()
	{
		return (Math.sqrt((Math.pow(this.x, 2.0))+(Math.pow(this.y, 2.0)+(Math.pow(this.z, 2.0)))));
		
	}
	

	public void DisplayDistance()
	{
		System.out.print("Distance   :"+this.distance()+"\n");
	}
}
public class PointApp {
public static void main(String []args) throws Exception
{
	float xvalue;
	float yvalue;
	float zvalue;
	InputStreamReader I = new InputStreamReader(System.in);
	BufferedReader Br = new BufferedReader(I);
	
	System.out.print("Enter Object 1 x value :");
	xvalue = Float.parseFloat(Br.readLine());
	
	System.out.print("Enter Object 1 y value :");
	yvalue = Float.parseFloat(Br.readLine());
	
	System.out.print("Enter Object 1 z value :");
	zvalue = Float.parseFloat(Br.readLine());
	
	Point3D p1 = new  Point3D(xvalue,yvalue,zvalue);
	
	System.out.print("Enter Object 1 x value :");
	xvalue = Float.parseFloat(Br.readLine());
	
	System.out.print("Enter Object 1 y value :");
	yvalue = Float.parseFloat(Br.readLine());
	
	System.out.print("Enter Object 1 z value :");
	zvalue = Float.parseFloat(Br.readLine());
	
	Point3D p2 = new  Point3D(xvalue,yvalue,zvalue); 
	System.out.print("Object 1 Distance :");
	p1.DisplayDistance();
	System.out.print("Object 2 Distance :");
	p2.DisplayDistance();
}
}
