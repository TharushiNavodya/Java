package Lab02;
import java.util.Scanner;
public class Lab2
{
	public static void main(String args[])
	{
		String Firstname;
		String ID;
		String District;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter Student First Name :");
		
		Firstname = input.nextLine();
		
		System.out.print("Enter Student ID Number  :");
		
		ID = input.nextLine();
		
		System.out.println("Enter District         :");
		
		District = input.nextLine();
		
		System.out.println("--------Student Details--------");
		System.out.println("Dit No            :"+ID);
		System.out.println("Name              :"+Firstname);
		System.out.println("District          :"+District);
		
		
		
	}
}
