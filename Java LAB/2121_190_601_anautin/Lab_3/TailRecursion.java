

public class TailRecursion
{
	

	

	public static void main (String [] args)
	{

		System.out.println(tailFactorial(4));

	}//END






	public static int tailFactorial(int n)
	{

		return factorialHelper(n, 1);

	}//END





	public static int factorialHelper(int n, int accumulator)
	{

		if (n == 0 || n == 1)
		{

			return accumulator;
		}
		else
		{

			return factorialHelper(n - 1, n * accumulator);
		}

	}//END



	

}//END CLASS


