
// Exercise #2
public class Fibonacci 
{
	
	public static void main (String [] args)
	{

		System.out.println(fibonacci(4));


	}



	public static int fibonacci (int n)
	{

		if (n == 1 || n == 0)
		{
			return n;
		}
		else
		{
			return fibonacci(n - 1) + fibonacci(n - 2);
		}
	

	}//END




}