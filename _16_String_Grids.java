public class _16_String_Grids
{

	public static void main(String[] args)
	{
		String grid[][] = { { "A", "B", "C" }, { "E", "F", "G" }, { "X", "Y", "Z" } };
		// 		0	 1	 2
		// 0 	A	 B	 C
		// 1 	E	 F	 G
		// 2 	X 	 Y	 Z

		System.out.println("The alphabets at postion 2,2 in the matrix is " + grid[1][1]);
		
		//The below sysout is to add a line space after the above print
		System.out.println();
		
		// to print the output as above matrix itself without indexes
		//------------------------------------------------------------------
		for (int row = 0; row < grid.length; row++)
		{
			for (int column = 0; column < grid[row].length; column++)
			{
				// Difference between the methods print() and println()
				// The println("...") method prints the string "..." and moves the cursor to a new line.
				// The print("...") method instead prints just the string "...", but does not move the cursor to a new line.
				// Hence, subsequent printing instructions will print on the same line.
				// The println() method can also be used without parameters, to position the cursor on the next line.

				System.out.print(grid[row][column] + "\t");
			}
			//To print in the next line as the first row completes printing
			System.out.println();
		}

	}

}
