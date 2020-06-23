import java.util.Scanner;

public class _11_do_while_loop
{

	public static void main(String[] args)
	{
		// the aim of this code is to learn while loop
		// lets try to get user input untill the user enters an even number, if not prompt till the user enter an even
		// number

		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);

		int number = 0;
		do
		{
			System.out.println("Enter a number of your choice:");
			number = input.nextInt();
		} 
		
		while ((number % 2) != 0);
		System.out.println("Voila, you had entered an even number!!");

	}

}
