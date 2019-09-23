import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.Assert.*;
import org.junit.*;



/**
* Test class for Pokemon Application.
*
* @author	Abby Autin
* @version  September 17, 2018
*/
public class PokemonTester
{



	// Setup for output to be redirected during testing
	private ByteArrayOutputStream output = new ByteArrayOutputStream();
	private ByteArrayOutputStream errorOutput = new ByteArrayOutputStream();
    private String lineseparator = System.getProperty("line.separator");



    // TEST FIXTURES
	//Pokemon objects to be later instantiated
	private Pokemon kelley;
	private Pokemon oggie;
	private Pokemon amy;

	// TEST FIXTURES
	//PokemonTrainer objects to be later instantiated
	private PokemonTrainer abby;
	private PokemonTrainer alyssa;





    /**
    * Redirecting our standard output to this new print stream called == output
    * We can use this later on when we are testing methods that produce standard output
    * Created Pokemon and Pokemon Trainer objects, passing int literals to constructors
    */

	@Before
	public void setup()
	{
		// we are setting our standard output to this new print stream that we've created (output) 
		System.setOut(new PrintStream(output));
		System.setErr(new PrintStream(errorOutput));


		// creating Pokemon objects; passing in literal values that can be used to instantiate them
		kelley 	= new Pokemon 	("Kelley", 100, 20 );
		oggie 	= new Pokemon 	("Oggie", 70, 5);
		amy 	= new Pokemon 	("Amy", 85, 10);

		// creating PokemonTrainer objects; passing in literal values that can be used to instantiate them
		abby 	= new PokemonTrainer	("Abby");
		alyssa 	= new PokemonTrainer	("Alyssa");

	}//END






    /**
    * Tests the getName method of class PokemonTrainer
    */	
	@Test
	public void testGetName()
	{
		assertEquals("Abby", abby.getName());
		assertEquals("Alyssa", alyssa.getName());

	}//END




    /**
    * Tests pokemon objects with only one observer
    */	
	@Test
	public void testPokemonWithOneObserver()
	{

		kelley.addObserver(abby);
		amy.attack(kelley);
		assertEquals("PokemonTrainer Abby is notified that Pokemon Amy attacked Pokemon Kelley using Body Slam for 10 damage." + lineseparator, output.toString());

	}//END




    /**
    * Tests pokemon objects with multiple observers
    */	
	@Test
	public void testPokemonWithMultipleObservers()
	{

		kelley.addObserver(abby);
		kelley.addObserver(alyssa);
		oggie.attack(kelley);
		
		assertEquals("PokemonTrainer Abby is notified that Pokemon Oggie attacked Pokemon Kelley using Body Slam for 5 damage." + lineseparator + "PokemonTrainer Alyssa is notified that Pokemon Oggie attacked Pokemon Kelley using Body Slam for 5 damage." + lineseparator, output.toString());



	}//END






    /**
    * Standard Error Stream Test
    */	
	@Test 
	public void testStdErr()
	{
		System.err.println("goodbye");
		assertEquals("goodbye" + lineseparator, errorOutput.toString());

	}//END




    /**
    * Reset to default output and error streams after testing is complete
    */	
	@After 
	public void resetStreams()
	{
	
		System.setOut(System.out);
		System.setErr(System.err);

	}//END







}//END CLASS