JAVA II
Homework #4
(Recursion)


@author			Abby Autin
@version		October 5, 2018




\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
- This assignment focused on recursion.



PART A
- we were asked to create a recursive method that would compare 2 Strings alphabetically
- it would return different integer values based on where String2 was in reference to String 1 (alphabetically)


- this method would take in two Strings
- it would then compare each individual character in the 1st string to the same character location in the 2nd string
- this method used recursion (calling itself) until all characters were assessed and compared in each String
- after this process was complete, the method would return the following:
	::: return -1 if String1 came before String 2
	::: return 0 if String 1 was the same as String 2
	::: return 1 if String 1 came after String 2




PART B
- we were asked to write another recursive method that would compare an entire array list of String alphabetically
- it would return the value of the String that was the smallest (see ASCII numerical equivalents)


- I created an additional method to assist this method in finding the solution
	findMinString()





\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\


COMPILE & EXECUTE INSTRUCTIONS :::


To compile:

1. Compile all .java files in your directory (where this application is stored)

javac *java




To execute:

2. Run RecursionTester

java org.junit.runner.JUnitCore RecursionTester



\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\

