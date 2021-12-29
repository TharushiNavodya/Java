package Lab01;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Lab7
{
	public static void main(String []args)throws Exception
	{
		
		int number1;
		int number2;
		int sum;
		
		InputStreamReader I = new InputStreamReader(System.in);
		BufferedReader Br = new BufferedReader(I);
		
		System.out.print("Enter number 1 :");
		number1 = Integer.parseInt(Br.readLine());
		System.out.print("Enter number 2 :");
		number2 = Integer.parseInt(Br.readLine());
		
		sum = number1 + number2;
		
		System.out.println("Sum :"+sum);
		System.out.println("Avarage :"+sum/2.0);
		
	}
}