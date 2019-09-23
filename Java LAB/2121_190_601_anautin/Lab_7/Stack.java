import java.util.ArrayList;


public class Stack < T >
{
	

	// creating an array list 
	private ArrayList <T> elements;


		// you can dynamically change the size of the stack by using an array list
		public Stack()
		{
			this.elements = new ArrayList < T >();
		}





		public void push (T item)
		{

			this.elements.add(item);

		}




		public T pop()
		{

			// create a temporary variable to store the data inside that element 
			T poppedElement;

			poppedElement = this.elements.get(elements.size() - 1);

			// remove that item from the underlying array list
			this.elements.remove(elements.size()-1);


			return poppedElement;
		}



		// gives you the size of your stack
		public int getSize()
		{
			return this.elements.size();
		}


		// tells you whether the stack is empty
		public boolean isEmpty()
		{
			return this.elements.isEmpty();
		}






		// need to build a toString() method that prints the contents of the stack
		@Override
		public String toString()
		{
			
			// is known as an empty String
			// not the same thing as a null String
			String toString = "";



			for (int i=0; i < this.elements.size(); i++)
			{
				toString = toString + this.elements.get(i) + "\n";
			}

			return toString;

		}





}// END CLASS













