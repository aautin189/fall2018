
/*
 * eg Selection Sort
 * 4 3 9 12 19 1
 * 1 3 9 12 19 4
 * 1 3 4 12 19 9
 * 1 3 4 9 19 12
 * 1 3 4 9 12 19
 */

import java.util.*;

public class SelectionSort {
	ArrayList<Integer> list;
	
	
	// CONSTRUCTOR
	public SelectionSort(ArrayList<Integer> list) {
		this.list = list;
	}
	


	public void sort(int startIndex) {
		int lowestIndex;
		
		//Base Case -- A list of size 1 or a sorted list
		if (startIndex == this.list.size()-1)
			System.out.println("Sorted");
		else {
			lowestIndex = this.search(startIndex);
			this.swap(startIndex, lowestIndex);
			this.sort(startIndex + 1);
		}
	}
	


	public void sort() {
		
		int startIndex, compareIndex, lowestIndex;
		int temp;
		
		for (startIndex = 0; startIndex < this.list.size(); startIndex++) {
			lowestIndex = startIndex;
			for (compareIndex = startIndex; compareIndex < this.list.size(); compareIndex++) {
				if (this.list.get(compareIndex) < this.list.get(lowestIndex)) {
					lowestIndex = compareIndex;
				}
			}
			temp = this.list.get(startIndex);
			this.list.set(startIndex, this.list.get(lowestIndex));
			this.list.set(lowestIndex, temp);
		}
		
	}
	
	


	public int search(int startIndex) {
		//the value of the start index
		int lowestValue = this.list.get(startIndex);
		int lowestIndex = startIndex;
		
		for (int i = startIndex; i < this.list.size(); i++) {
			if (this.list.get(i)<lowestValue) {
				lowestValue = this.list.get(i);
				lowestIndex = i;
			}
		}
		
		return lowestIndex;
	}
	



	public void swap(int firstIndex, int secondIndex) {
		int temp = this.list.get(firstIndex);
		this.list.set(firstIndex, this.list.get(secondIndex));
		this.list.set(secondIndex, temp);
	}
	


	public static class SortTester {
		public static void main(String[] args) {
			Integer[] numbers = {1,2,7,2,9,18,29,30,6,3};
			ArrayList<Integer> data = new ArrayList<Integer>(Arrays.asList(numbers));
			SelectionSort sort = new SelectionSort(data);
			sort.sort();
			System.out.println(sort.list);
			//sort.sort(0);
			//System.out.println(sort.list);
		}
	}



}//END CLASS









