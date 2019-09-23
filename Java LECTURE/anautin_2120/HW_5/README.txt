JAVA II
Homework #5
(Sorting & Searching)


@author			Abby Autin
@version		November 10, 2018





main source code file: Sorters2120.java

\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
OVERVIEW:

- Starter code was provided by Dr. Summa
- Specifically, he provided source code for Dog and Sorters2120
- He also provided scripts to run Dog and Sorters2120
- Lastly, he provided a tester class for us

REQUIREMENTS:

- implement selectionSort() method
- implement recursiveMergeSortHelper(), using recursion
- implement recursiveBinarySearcher(), using recursion

- fill in java doc commenting for all 3 method
- fill in java doc commenting for tester methods (inside tester class)


\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\

::: In this source code file, we have a combination of methods that either provide help in sorting data structures of searching through data structures.

As we are currently studying the materials from Chapter 20, Generics, we have implemented our methods in a generic manner, as to eliminate the need for overloaded methods. This allows us to reuse code without needing to specify specific element types in our method headers.  


\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
1. bubbleSort()
- full implementation provided by Dr. Summa


2. swap()
- full implementation provided by Dr. Summa


3. selectionSort()
- no implementation provided


4. mergeSort()
- "passing the buck" implementation 
- This method acts as an in-between to a real method that performs necessary operations associated with merge sorting. 


5. recursiveMergeSortHelper()
- no  implementation provided
- Method that actually performs merge sorting
- This method must be implemented using recursion, not iteration. 
- Additional helper methods allowed if necessary. 


6. mergeHelper()
- my implementation


7. indexOf()
- "passing the buck" implementation 
- This method acts as an in-between to a real method that performs necessary operations associated with Binary Searching. 


8. recursiveBinarySearcher()
- no implementation provided 

\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\


COMPILE & EXECUTE INSTRUCTIONS :::


To compile:

1. Compile all .java files in your directory (where this application is stored)

javac *java




To execute:

2. Run SortersTester

java org.junit.runner.JUnitCore SortersTester



\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\