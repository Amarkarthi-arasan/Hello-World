//Class that is used in the main class
class car
{
	//a method which explicitly outputs a defined output when it is called in the main class
	public void model()
	{
		System.out.println("Duster is a car from Renault India");
	}
	
	//a method which gets a string (text) as input(parameter) from the class where it is being called and uses it in the output that it will print
	public void variant(String text)
	{
		System.out.println(text);
	}
	
	//a method which gets different format/data types as input(parameter) from the class which calls it and provides the output
	public void options(String engine, int power, double torque)
	{
		System.out.println("Duster has "+engine+" engine with a power of "+power+" PS and has a torque of "+torque+" Nm");
	}
	
}

public class _20_Method_Parameters
{

	public static void main(String[] args)
	{
		//new object creation extending the class
		car duster = new car();
		
		//calling the method model()
		duster.model();
		
		//calling the method variant() with input string which would get assigned to the variable text in the method
		duster.variant("Duster has a AWD Variant");
		
		//calling the method options() with different data type inputs 
		duster.options("K9K Diesel", 110, 250);
			//another example
			String engine = "1.6 Petrol";
			int power = 85;
			double torque = 90;
			duster.options(engine, power, torque);		
	}

}
