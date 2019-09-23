

// Runner Class
public class StackTester
{

	public static void main(String [] args)
	{
		Stack<String> stack = new Stack<String>();
		stack.push("This");
		stack.push("is");
		stack.push("a");
		stack.push("stack");

		System.out.println(stack.toString());


		stack.pop();
		stack.pop();
		System.out.println(stack.toString());


		stack.push("still");
		stack.push("a");
		stack.push("stack");
		System.out.println(stack.toString());




	}
}