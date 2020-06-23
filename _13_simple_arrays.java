
public class _13_simple_arrays
{

	public static void main(String[] args)
	{
		//declaring a new array with the name values, anything with a square bracket is referred as an array
		int[] values;
		
		//declare how many integers are there in the array
		values = new int[3];
		
		//adding values at the 3 places in the array
		values[0]=10;
		values[1]=20;
		values[2]=30;
		
		//print output of the value stored in array
		System.out.println("The number stored at zeroth(0th) position is: "+values[0]);
		
		//create a for loop with an integer i to determine the values at the position of the array upto its length and print them
		int i;
		    for(i=0;i<values.length;i++) {
			System.out.println(values[i]);
		}
		
		    //Another approach to arrays where you declare an array without mentioning the size of the array but add values into the array
		    //by declaring them
		    int numbers[]= {5,6,7};
		    
		    System.out.println("The length of the array numbers is :"+numbers.length);
		    
		    for(int y=0;y<numbers.length;y++) {
		    	System.out.println(numbers[y]);
		    }
	}

}
