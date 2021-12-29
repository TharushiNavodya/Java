package Lab02;
import java.io.*;

class EvenOddNumber
{
	public boolean findEvenOrOdd(int i)
	{
		if(i%2 == 0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}

public class Lab5 {
	public static void main(String []args)throws Exception 
	{
		int num;
		
		EvenOddNumber number =new EvenOddNumber();
		InputStreamReader I = new InputStreamReader(System.in);
		BufferedReader Br = new BufferedReader(I);
		
		System.out.print("Enter the number :");
		num = Integer.parseInt(Br.readLine());
		if(number.findEvenOrOdd(num) == true)
		{
			System.out.println("Even number");
		}
		else
		{
			System.out.println("Odd number ");
		}
	}
}


