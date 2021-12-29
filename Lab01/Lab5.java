package Lab01;
public class Lab5
{
	public static void main(String []args)
	{
		int col = 1;
		int row = 1;
		
		
		while(row <= 5 )
		{
			while(col <= 5)
			{
				System.out.print(" * ");
				col++;
			}
			System.out.println("");
			row++;
			col = 1;
		}
		
	}
}