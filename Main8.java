import java.io.BufferedReader;
import java.io.InputStreamReader;

class Plane 
{
	private int planeID;
	private String piloet;
	private String destination;
	
	
	public void setPlaneDetails(int planeID,String piloet,String destination)
	{
		this.planeID =planeID;
		this.piloet = piloet;
		this.destination =destination;
	}
	
	public void displayPlaneDetails()
	{
		System.out.println("Plane ID :"+this.planeID);
		System.out.println("Pilolet :"+this.piloet);
		System.out.print("Destination :"+this.destination);
	}
	
	public void setDestination(String destination)
	{
		this.destination =destination;
	}
}

class Main8
{
	public static void main(String []args)throws Exception
	{
		InputStreamReader I = new InputStreamReader(System.in);
		BufferedReader Br = new BufferedReader(I);
		
		Plane p1 = new Plane();
		Plane p2 = new Plane();
		Plane p3 = new Plane();
		
		System.out.println("Input new destination plane 1 :");
		p1.setDestination(Br.readLine());
		System.out.println("Input new destination plane 2 :");
		p2.setDestination(Br.readLine());
		System.out.println("Input new destination plane 3 :");
		p3.setDestination(Br.readLine());
		
		p1.displayPlaneDetails();
		p2.displayPlaneDetails();
		p3.displayPlaneDetails();
		
	}
}