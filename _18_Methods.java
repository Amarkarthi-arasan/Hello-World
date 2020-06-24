
public class _18_Methods
{

	public static void main(String[] args)
	{
		citizen john = new citizen();
		john.name = "John";
		john.age = 20;
		john.city = "Chennai";

		// calls the method speak from the class citizen for the object John created above.
		john.speak();
		john.sayhello();
	}

}

class citizen
{
	String name;
	int age;
	String city;

	// This is a method which can be called by any object
	void speak()
	{
		System.out.println("Hi!! My name is " + name + ". I live in " + city + ", and I'm " + age + " years old");
	}

	// This is another mehtod which can be used by any object
	void sayhello()
	{
		System.out.println("Hello there!!");
	}
}
