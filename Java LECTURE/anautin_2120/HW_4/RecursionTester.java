import java.util.ArrayList;
import org.junit.*;
import static org.junit.Assert.*;





/**
* Test class for Recursion Assignment
*
* @author	Abby Autin
* @version  October 1, 2018
*/
public class RecursionTester
{
	

	private String word1;
	private String word2;
	private String word3;
	private String word4;
	private String word5;
	private String word6;
	private String word7;
	private String word8;
	private String word9;
	private ArrayList <String> listOfWords;



	/**
    * Setting up my test fixtures for each method that is part of this assignment
    * 
    * 
    */
	@Before
	public void setup()
	{

		// TEST FIXTURES : problem1
		word1 = "Ned Van Buren";
		word2 = "ned van Buren";
		word3 = "sapporo";
		word4 = "sappena";
		word5 = "Sappena";
		word6 = "#subpoena";
		word7 = "#Subpoena";
		word8 = "NedVanBuren";
		word9 = "Ned Van Buren";




		// TEST FIXTURES : problem2
		listOfWords = new ArrayList<String>();

		listOfWords.add("dan");
		listOfWords.add("ban");
		listOfWords.add("can");
		listOfWords.add("Sand");
		listOfWords.add("fan");
		listOfWords.add("FAN");
		listOfWords.add("CoOk");
		listOfWords.add("ann");
		listOfWords.add("Anna");
	
	}// END SETUP




	/**
    * Test the compareTo() method
    */	
	@Test
	public void testCompareTo()
	{
		assertTrue(RecursionProgram.compareTo(word1,word2) == 0);
		assertTrue(RecursionProgram.compareTo(word3,word4) == 1);
		assertTrue(RecursionProgram.compareTo(word4,word5) == 0);
		assertTrue(RecursionProgram.compareTo(word6,word7) == 0);
		assertTrue(RecursionProgram.compareTo(word7,word6) == 0);
		assertTrue(RecursionProgram.compareTo(word8,word9) == 1);
		assertTrue(RecursionProgram.compareTo(word9,word8) == -1);


	}// END TEST






	/**
    * Test the findMinimum() method
    */	
	@Test
	public void testFindMinimum()
	{
		assertTrue(RecursionProgram.findMinimum(listOfWords) == "ann");
	
	}// END TEST








}//END CLASS