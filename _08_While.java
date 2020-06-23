import java.util.Scanner;

public class _08_While
{

	public static void main(String[] args)
	{
		//int x = 0;

		//while (x < 10)
		//{
			//System.out.println("The value of X is : " + x);
			//x = x + 1;
		//}
		
		boolean isonrepeat = true;
		
		while (isonrepeat)
		{
			System.out.println("The current song is in Repeat Mode!!, do you want to play the next song?");
			
			@SuppressWarnings("resource")
			Scanner input = new Scanner(System.in);
			String userinput = input.next();
			
			if (userinput.equals("yes"))
			{
				isonrepeat = false;
				System.out.println("Playing the next song!");
			}
			
		}
		
	}

}
