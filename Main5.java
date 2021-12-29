class Vehicle
{
	private int vehicleID;
	private String vehicleBrand;
	private String vehicleType;
	private double vehiclePrice;
	
	public Vehicle()
	{
		this.vehicleID =0;
		this.vehicleBrand = "";
		this.vehicleType = "";
		this.vehiclePrice = 0;
	}
	
	public void setVehicleDetails(int vehicleID,String vehicleBrand,String vehicleype,double vehiclePrice)
	{
		this.vehicleID = vehicleID;
		this.vehicleBrand = vehicleBrand;
		this.vehicleType = vehicleype;
		this.vehiclePrice = vehiclePrice;
	}
	
	public void setVehiclePrice(double vehiclePrice)
	{
		this.vehiclePrice = vehiclePrice;
	}
	
	public void DisplayVehicleDetails()
	{
		System.out.println("Vehicle ID ="+this.vehicleID);
		System.out.println("Vehicle Brand ="+this.vehicleBrand);
		System.out.println("Vehicle Type ="+this.vehicleType);
		System.out.println("Vehicle Price ="+this.vehiclePrice);
	}
	
}

public class Main5
{
	public static void main(String []args)
	{
		Vehicle v1 = new Vehicle();
		Vehicle v2 = new Vehicle();
		Vehicle v3 = new Vehicle();
		
		v1.setVehicleDetails(1, "Toyota", "SUV",8500000);
		v2.setVehicleDetails(2, "Nissan", "Saloon",6000000);
		v3.setVehicleDetails(3, "Honda", "Convertible",7200000);
		
		v1.setVehiclePrice(8000000);
		v2.setVehiclePrice(5500000);
		v3.setVehiclePrice(7000000);
		
		v1.DisplayVehicleDetails();
		v2.DisplayVehicleDetails();
		v3.DisplayVehicleDetails();
	}
}