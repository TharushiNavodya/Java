package Lab01;
import java.util.Scanner;

class Lab4
{
	public static void main(String []args)throws Exception
	{
		int date;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter date of the today:");
		date = input.nextInt();

		switch(date)
		{
			case 1:
			{
				System.out.println("Value of the day:"+ date);
				System.out.println("Day of the week :Monday\nGood Bye!");
				break;

			}
			case 2:
			{
				System.out.println("Value of the day:"+date);
				System.out.println("Day of the week :Tuesday\nGood Bye!");
				break;
			
			}
				case 3:
			{
				System.out.println("Value of the day:"+date);
				System.out.println("Day of the week :Wednesday\nGood Bye!");
			break;
			}
					case 4:
			{
				System.out.println("Value of the day:"+date);
				System.out.println("Day of the week :Thursday\nGood Bye!");
			break;
			}
					case 5:
			{
				System.out.println("Value of the day:"+date);
				System.out.println("Day of the week :Friday\nGood Bye!");
			break;
			}
					case 6:
			{
				System.out.println("Value of the day:"+date);
				System.out.println("Day of the week :Saterday\nGood Bye!");
			break;
			}
					case 7:
			{
				System.out.println("Value of the day:"+date);
				System.out.println("Day of the week :Sunday\nGood Bye!");
			break;
			}
			default:
			{
		System.out.println("Value of the day:"+date);
		System.out.println("Invalid day");
			}
		}

	}
}