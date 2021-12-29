package Lab02;
import java.util.Scanner;

public class Lab3 {
	public static void main(String args[])
	{
		float length;
		float width;
		float height;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter lenght     :");
		length = input.nextFloat();
		System.out.print("Enter Width      :");
		width = input.nextFloat();
		
		System.out.print("Enter Height     :");
		height = input.nextFloat();
		
		System.out.println("Value of cube  :"+ (length*width*height));
		
		
	}

}
