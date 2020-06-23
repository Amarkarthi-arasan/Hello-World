import java.util.Scanner;

public class _09_Challenge1
{

	public static void main(String[] args)
	{
		String Question = "Which is the capital of India?";
		String Choice1 = "New Delhi";
		String Choice2 = "Chennai";
		String Choice3 = "Mumbai";
		String CorrectAnswer = "A";
		
		System.out.println("Question > " + Question);
		System.out.println("Select one of the answers, give your answer as A/B/C");
		System.out.println("A. " + Choice1);
		System.out.println("B. " + Choice2);
		System.out.println("C. " + Choice3);

		@SuppressWarnings({ "unused", "resource" })
		Scanner input = new Scanner(System.in);
		String userinput = input.next();

		if (CorrectAnswer.equals(userinput.toUpperCase()))
		{
			System.out.println("Thats the right answer!" + "\n" + "You won the quiz");
		}

		else
		{
			System.out.println("Sorry that's a wrong answer, the correct answer is Option A(New Delhi)");
		}

	}

}
