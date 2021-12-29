class Guest 
{
	private int GuestID;
	private String guestName;
	private double ratePerDay;
	private int noofDays;
	
	public Guest()
	{
		this.GuestID = 0;
		this.guestName = "";
		this.noofDays = 0;
		this.ratePerDay = 0;
	}
	
	public void setGuestDetails(int GuestID,String guestName, double ratePerDay,int noofDays)
	{
		this.GuestID =GuestID;
		this.guestName =guestName;
		this.noofDays = noofDays;
		this.ratePerDay =ratePerDay;
	}
	
	public double calculateGuestBill()
	{
		return this.ratePerDay * this.noofDays;
	}
	
	public void displayGuestDetails()
	{
		System.out.println("Guest ID :"+this.GuestID);
		System.out.println("Guest Name :"+this.guestName);
		System.out.println("Bill Amount :"+this.calculateGuestBill());
	}
}

public class Main7
{
	public static void main(String []args)
	{
		Guest g1 = new Guest();
		Guest g2 = new Guest();
		Guest g3 = new Guest();
		
		g1.setGuestDetails(1212, "Jared", 500, 10);
		g2.setGuestDetails(1122, "Ben", 900, 20);
		g3.setGuestDetails(1234, "Ruby", 1500, 5);
		
		g1.displayGuestDetails();
		g2.displayGuestDetails();
		g3.displayGuestDetails();
	}
}