
public class _19_Getters_and_Return
{

	public static void main(String[] args)
	{
		// creating a new person object as defined in the below class
		person Tim = new person();

		// assigning the values to attributes of objects created above
		Tim.name = "Tim";
		Tim.age = 40;

		// calling the method void hello() from the class to print an output
		Tim.hello();

		// Use the method available in the class to print them in output
		System.out.println("Name : " + Tim.getname());
		System.out.println("Age :" + Tim.getage());
		System.out.println("Time in Service :" + Tim.retirementage());

	}

}

//class to declare functions related to the person
class person
{
	String name;
	int age;

	// method to print a statement when called in the main class by referring to this
	void hello()
	{
		System.out.println("Hi, I'm " + name);
	}

	// method to return the name when used in main class
	String getname()
	{
		return name;
	}

	// method to return age when used in the main class
	int getage()
	{
		return age;
	}

	// method that calculates the retirement age and returns when called in the main class
	int retirementage()
	{
		int yearsleft = 60 - age;
		return yearsleft;
	}
}
