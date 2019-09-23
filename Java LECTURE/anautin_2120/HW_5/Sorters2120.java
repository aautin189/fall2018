/**
*   Homework #5
*   Sorting & Searching
* 
*
* @author   Abby Autin
* @version  November 11, 2018
*/


import java.util.List;
import java.lang.Comparable;



public class Sorters2120 {


    /**
    @param theList ..........
    @since Monday, Nov 6, 2018

    @custom.require .....
    @custom.require .....
    @custom.ensure  .....

    */
    public static <T extends Comparable<T> > void bubbleSort(List<T> theList) {
        int lastToConsider = theList.size();
        while (lastToConsider > 1) {
            for (int j=0; j<lastToConsider-1; j++) {
                if (theList.get(j).compareTo(theList.get(j+1))  >  0 ) {
                    swap(theList,j,j+1);
                }
            }
            lastToConsider--;
        }
    }



    /**
    * 
    *
    @param theList the list containing the data we are working on
    @param i1 the index of the 1st value we want to swap
    @param i2 the index of the 2nd value we want to swap with the 1st value
    @since Monday, Nov 6, 2018

    @custom.require .....
    @custom.require .....
    @custom.ensure  .....

    */
    private static <T extends Comparable<T> > void swap(List<T> theList, int i1, int i2) {

        T temp = theList.get(i1);   // store value @ index i1 in a temporary variable
        theList.set(i1,theList.get(i2));    // get value @ index i2 of theList and store it in the index of i1
        theList.set(i2,temp);   // retrieve original value stored @ index i1 and set it at index i2
    }

    


    /**
    @param theList the List object we want to sort
    @since Monday, Nov 6, 2018

    @custom.require .....
    @custom.require .....
    @custom.ensure  .....

    */
    public static <T extends Comparable<T> > void selectionSort(List<T> theList) {

        for (int i = 0; i < theList.size()-1; i++){

            // by default, set to index 0
            int indexOfSmallestValue = i;      

            for (int nextIndex = i+1; nextIndex < theList.size(); nextIndex++){
                if (theList.get(nextIndex).compareTo(theList.get(indexOfSmallestValue)) < 0){
                    indexOfSmallestValue = nextIndex;
                }
            }
            swap(theList, i, indexOfSmallestValue);

        }
        

    }// END METHOD

    

    /**
    @param theList ..........
    @since Monday, Nov 6, 2018

    @custom.require .....
    @custom.require .....
    @custom.ensure  .....

    */
    public static <T extends Comparable<T> > void mergeSort(List<T> theList) {
        recursiveMergeSortHelper(theList,0,theList.size());
    
    }// END METHOD

    



    /**
    @param theList  the list that needs to be sorted
    @param first    the first index
    @param last     the last index
    @since Monday, Nov 6, 2018

    @custom.require .....
    @custom.require .....
    @custom.ensure  .....

    */
    private static <T extends Comparable<T>> void recursiveMergeSortHelper(List<T> theList, int first, int last) {

        // test for the base case; size of array is 1
        // make sure that the low and high are in the correct order
        if ((last - first) >= 1){    // if not base case

            int indexMiddle1 = (first + last) / 2;        // calculate the middle of the array
            int indexMiddle2 = indexMiddle1 + 1;            // calculate next element


            // split the array in half; sort each half recursively
            recursiveMergeSortHelper(theList, first, indexMiddle1);        // first half of array
            recursiveMergeSortHelper(theList, indexMiddle2, last);     // second half of array


            // merge two sorted arrays after the split calls return
            merge(theList, first, indexMiddle1, indexMiddle2, last);

        }// END
    }// END






    /**
    @param theList
    @param leftIndex    
    @param indexMiddle1   
    @param indexMiddle2
    @param rightIndex   
    @since Monday, Nov 6, 2018

    @custom.require .....
    @custom.require .....
    @custom.ensure  .....

    */
    
    private static <T extends Comparable <T> > void merge(List<T> theList, int leftIndex, int indexMiddle1, int indexMiddle2, int rightIndex){
        
        int index2Left = leftIndex;                 // index into left subarray
        int index2Right = indexMiddle2;             // index into right subarray
        
        int combinedIndex = leftIndex;
        List<T> combined = theList;              // index into temp working array
        //T [] combined = new T[theList.size()];   // the working array



        // merge arrays until reaching end of either
        while(index2Left <= indexMiddle1 && index2Right <= rightIndex){

            // place smaller of two elements into result & move to next space in array
            if(theList.get(index2Left).compareTo(theList.get(index2Right)) == 0 || theList.get(index2Left).compareTo(theList.get(index2Right)) < 0 ){
                
                combined.add(combinedIndex++, theList.get(index2Left++));

            }
            
            else{

                combined.add(combinedIndex++, theList.get(index2Right++));
            }
        }// end while loop


        // if left array is empty
        if(index2Left == indexMiddle2){

            //copy in rest of right array
            while(index2Right <= rightIndex){

                combined.add(combinedIndex++, theList.get(index2Right++));
            }

        }

        // else right array is empty
        else{

            // copy in rest of left array
            while(index2Left <= indexMiddle1){

                combined.add(combinedIndex++, theList.get(index2Left++));
            }

        }


        // copy values back into original array
        for (int i = leftIndex; i <= rightIndex; i++){

            theList.add(i, combined.get(i));
        }

        


    }// END METHOD



    


    /**
    @param searchItem
    @param theList ..........
    @since Monday, Nov 6, 2018

    @custom.require .....
    @custom.require .....
    @custom.ensure  .....

    */
    public static <T extends Comparable<T> > int indexOf(T searchItem, List<T> theList) {

        return recursiveBinarySearcher(searchItem, theList, 0, theList.size()-1);

    }// END METHOD

    



    /**
    @param searchItem
    @param theList ..........
    @param first
    @param last
    @since Monday, Nov 6, 2018

    @custom.require .....
    @custom.require .....
    @custom.ensure  .....

    */
    private static <T extends Comparable<T> > int recursiveBinarySearcher(T searchItem, List<T> theList, int first, int last) {

        int centerIndex = (first + last)/2;
        

        // DID NOT PRE-SORT THE LIST
        // the list is out of order
        if(last < first){
            return -1;
        }


        // BASE CASE
        // If we've located the searchItem
        if(searchItem.compareTo(theList.get(centerIndex)) == 0){
            return 0;
        }
        
        // if the searchItem comes before the center element, we focus on left-hand side of list
        else if (searchItem.compareTo(theList.get(centerIndex)) < 0){
            return recursiveBinarySearcher(searchItem, theList, first, centerIndex - 1);
        }
        
        // if the searchItem is greater than the center element, we focus on the right-hand side of the list
        else if (searchItem.compareTo(theList.get(centerIndex)) > 0){
            return recursiveBinarySearcher(searchItem, theList, centerIndex + 1, last);
        }
        
        // if the searchItem is not present in the data    
        else{
            
            return -1;
        }

    }// END METHOD





}// END CLASS











