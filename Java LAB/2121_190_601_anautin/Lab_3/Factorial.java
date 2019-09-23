


public class Factorial
{
	

	public static void main (String [] args)
	{

		// calculate the factorial of 0-6
		for (int counter = 0; counter <= 7; counter ++)
		{

			System.out.println("For " + counter + " , Factorial == " + factorial(counter));
		}

	}//END





		// EXERCISE #1
	public static int factorial (int n)
	{

		if (n == 1 || n == 0)
		{

			return 1;
		}
		else
		{
			return n * factorial(n-1);
		}

	}//END




}//END CLASS


