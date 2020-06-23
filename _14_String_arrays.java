
public class _14_String_arrays
{

	public static void main(String[] args)
	{
		String words[] = new String[5];
	
		words[0]="Cat";
		words[1]="tiger";
		words[2]="lion";
		words[3]="dog";
		words[4]="pug";
		
		String cars[] = {"Figo","ikon","Ecosport","Swift","Baleno"};
		
		for(int i=0;i<words.length;i++) {
			System.out.println("The array of words contain a "+words[i]);
		}
		
		for(int x=0;x<cars.length;x++) {
			System.out.println("The array of cars contain "+cars[x]);
		}
		
		for(String vehicles:cars) {
			System.out.println(vehicles);
		}
		
		//To understand how null value is handled in a string array
		String alpha[]=new String[2];
		System.out.println("The value of alpa arrays zeoth position is:"+alpha[0]);
	}

}
