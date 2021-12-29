import java.io.BufferedReader;
import java.io.InputStreamReader;

class Lab3
{
	public static void main(String []args)throws Exception
	{
		int age;
		
		InputStreamReader I = new InputStreamReader(System.in);
		BufferedReader Br = new BufferedReader(I);
		
		System.out.println("Enter your age :");
		age = Integer.parseInt(Br.readLine());
		
		if(age >18)
		{
			System.out.println("Adult");
		}
		
		else
		{
			System.out.println("Child");
		}
	}
}