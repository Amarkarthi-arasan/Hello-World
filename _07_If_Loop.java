import java.util.Scanner;

public class _07_If_Loop
{

	public static void main(String[] args)
	{
		System.out.println("Enter a number from 1 to 10");

		@SuppressWarnings("resource")
		Scanner number = new Scanner(System.in);
		int num = number.nextInt();

		if (num < 10)
		{
			if (num <= 5)
			{
				System.out.println("You have a good luck waiting to happen today");
			}

			else
			{
				System.out.println("You can expect a good luck on your way in this week");
			}

		}

		else
		{
			System.out.println("Your number is more than 10, cannot process");
		}
	}

}
