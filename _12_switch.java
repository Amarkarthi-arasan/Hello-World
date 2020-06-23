import java.util.Scanner;

public class _12_switch
{

	public static void main(String[] args)
	{
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the command for the machine: ");
		String command = input.next();
		
		switch (command.toLowerCase())
		{
			case "start":
				System.out.println("Machine Started!! DURRRRRRRRRR");
				break;
				
			case "pause":
				System.out.println("Machine Paused!! DUPP.. DUP.. DUPP..");
				break;
				
			case "stop":
				System.out.println("Machine Stopping!! BSSSSSSSSSS....");
				break;
				
			default:
				System.out.println("Sorry command not recognised, please RETRY!");

		}

	}

}
