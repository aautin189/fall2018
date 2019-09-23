import java.util.*;

public class BinarySearch {
	private ArrayList<Integer> list;
	private int number; //number we're looking for
	

	
	public BinarySearch(ArrayList<Integer> list, int value) {
		this.list = list;
		this.number = value;
	}
	
	
	//return -1 if not found
	public int bSearch(int lowIndex, int highIndex) {
		
		
		int middle; 
		boolean foundIndex = false;
		
		while (foundIndex == false) {
			
			middle = (lowIndex + highIndex)/2;
			
			if (this.number == this.list.get(middle))
				return middle;
			
			else if (this.number < this.list.get(middle)) {
				highIndex = middle - 1;
			} 

			else if (this.number > this.list.get(middle)) {
				lowIndex = middle + 1;
			}
			
			if (lowIndex > highIndex)
				foundIndex = true;
		}
		
		return -1;
		
	}
	



	// NESTED CLASS 
	public static class BSearchTester {
		
		// METHOD: main
		public static void main(String[] args) {
			
			Integer[] numbers = {1,2,7,8,9,18,29,30,66,73};
			
			// converting my array of integers into an array list of integers
			// initializing this new array list with those elements and 
			// assigning that new memory location to the reference variable, data.
			ArrayList<Integer> data = new ArrayList<Integer>(Arrays.asList(numbers));
			BinarySearch search = new BinarySearch(data, 5);
			System.out.println(search.bSearch(0, search.list.size()-1));
		}
	}
}