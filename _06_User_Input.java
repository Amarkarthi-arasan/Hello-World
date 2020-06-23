import java.util.Scanner;

public class _06_User_Input
{

	@SuppressWarnings("unused")
	public static void main(String[] args)
	{
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a double value :");
		double inputvalue = input.nextDouble();
		System.out.println("You entered a value of " + inputvalue);
		
		@SuppressWarnings("resource")
		Scanner input2 = new Scanner(System.in);
		System.out.println("Enter your name to store in the records :");
		String inputname = input2.next();
		System.out.println("Hi "+inputname+", your entry of "+inputvalue+" is stored in the record");
		

	}

}
