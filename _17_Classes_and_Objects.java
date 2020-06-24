
public class _17_Classes_and_Objects
{

	public static void main(String[] args)
	{
		//Create a fruit object using the class that is written below
		fruit apple = new fruit();
		
		//add in values to the attributes of the newly createe fruit object
		apple.name = "apple";
		apple.taste = "sweet";
		apple.price = 50;

		System.out.println(
				apple.name + " is a fruit, that is " + apple.taste + " in taste and costs " + apple.price + " Rs");
	}

}

//Class to declare the attributes of the class.
//Classes can contain methods or sub-routines.
//In computer programming, a subroutine is a sequence of program instructions that performs a specific task, packaged as a unit. 
//This unit can then be used in programs wherever that particular task should be performed.
//Subroutines may be defined within programs, or separately in libraries that can be used by many programs. 
//In different programming languages, a subroutine may be called a procedure, a function, a routine, a method or a subprogram.
class fruit
{
	String name;
	String taste;
	int price;
}
