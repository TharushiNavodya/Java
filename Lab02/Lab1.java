package Lab02;
public class Lab1

{
	public static void main(String []args)
	{
	int miles = 26;
	int yards =385;
	double kilometer;
	kilometer = miles/1.609 + (1.609/1760.0)*yards ;
	
	System.out.println("********Converter**********");
	System.out.println("Miles value     :"+miles);
	System.out.println("Yard value      :"+yards);
	System.out.println("Kilometer value :"+kilometer);
	System.out.println("***************************");
	
	}
}
