import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main2
{
	//print values 
	//use concatenate mark (+)
	//and use calculation 
	
	public static void main(String []args)throws Exception 
	//exception mean runtime errors 
	{
		//data type in java 
		//short 
		//int
		//long 
		//float 
		//double 
		//char 
		//String 
		
		int number1;
		int number2;
		
		//Get input we can use different method (2)
		InputStreamReader I = new InputStreamReader(System.in);
		BufferedReader Br = new BufferedReader(I);
		
		System.out.println("Enter number 1 :");
		number1 = Integer.parseInt(Br.readLine());
		
		System.out.println("Enter number 2 :");
		number2 = Integer.parseInt(Br.readLine());
		
		System.out.println("Sum :"+(number1+number2));
		//use () otherwise it concatenate 
		
	}
}