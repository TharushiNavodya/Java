package Lab02;
import java.io.*;

public class Lab4 {
	public static void main(String []args)throws Exception
	{
		float length;
		float width;
		float height;
		
		InputStreamReader I = new InputStreamReader(System.in);
		BufferedReader Br = new BufferedReader(I);
		
		System.out.print("Enter Length  :");
		length = Float.parseFloat(Br.readLine());
		
		System.out.print("Enter Width  :");
		width = Float.parseFloat(Br.readLine());
		
		System.out.print("Enter Height  :");
		height = Float.parseFloat(Br.readLine());
		
		System.out.println("Volume of the Cube  :"+(length*width*height));
		
		
	}

}
