
// Import statements necessary to run junit
import org.junit.*;
import static org.junit.Assert.*;





/**
* Test class for class Fraction.
*
* @author	Abby Autin
* @version  August 27th, 2018
*/
public class FractionTest
{



    // Declaring placeholders for the (4) instances of Fraction we are going to create
    private Fraction fract1;
    private Fraction fract2;
    private Fraction fract3;
    private Fraction fract4;    







    /**
    * Initializes (4) different test cases before each test is run.
    * Created 4 instances of FRACTION, passing int literals to constructor
    */
    @Before
    public void setUp()
    {
        fract1 = new Fraction(1 , 2);		
        fract2 = new Fraction(-3 , 4);      // wanted a negative instance to test
        fract3 = new Fraction(6 , 11);
        fract4 = new Fraction(0 , 5);		// wanted an instance with a zero in numerator to test
    
    } //END










    /**
    * Tests the getNumerator method of class Fraction.
    */
    @Test
    public void testGetNumerator()
    {

		//ensure that the numerator of each instance of Fraction == the literal value stored in corresponding variables
        assertEquals(1  , fract1.getNumerator());
        assertEquals(-3 , fract2.getNumerator());
        assertEquals(6  , fract3.getNumerator());
        assertEquals(0  , fract4.getNumerator());

    } //END







    /**
    * Tests the getDenominator method of class Fraction.
    */
    @Test
    public void testGetDenominator()
    {

		//ensure that the denominator of each instance of Fraction == the literal value stored in corresponding variables
        assertEquals(2  , fract1.getDenominator());
        assertEquals(4  , fract2.getDenominator());
        assertEquals(11 , fract3.getDenominator());
        assertEquals(5  , fract4.getDenominator());

    } //END






    /**
    * Tests the toString method of class Fraction.
    */
    @Test
    public void testToString()
    {

		//ensure that each instance of Fraction is successfully and accurately converted to String format
        assertEquals("1 / 2"  , fract1.toString());
        assertEquals("-3 / 4" , fract2.toString());
        assertEquals("6 / 11" , fract3.toString());
        assertEquals("0 / 5"  , fract4.toString());

    } //END
    






    /**
    * Tests the add method of class Fraction.
    */
    @Test
    public void testAdd()
    {

		// provide String literal to represent the calculated sum of two existing instances of Fraction
        // use add() method of class Fraction to perform that same calculation
        // ensure the String representation of that operation is mathematically accurate
        assertEquals("-1 / 4", fract1.add(fract2).toString());


    } //END 

    




    /**
    * Tests the subtract method of class Fraction.
    */
    @Test
    public void testSubtract()
    {

        // provide String literal to represent the calculated difference between two existing instances of Fraction
        // use subtract() method of class Fraction to perform that same calculation
        // ensure the String representation of that operation is mathematically accurate
        assertEquals("5 / 4", fract1.subtract(fract2).toString());

    } //END

    




    /**
    * Tests the multiply method of class Fraction.
    */
    @Test
    public void testMultiply()
    {

        // provide String literal to represent the calculated product of two existing instances of Fraction
        // use multipy() method of class Fraction to perform that same calculation
        // ensure the String representation of that operation is mathematically accurate
        assertEquals("-3 / 8", fract1.multiply(fract2).toString());

    } //END








    /**
    * Tests the divide method of class Fraction.
    */
    @Test
    public void testDivide()
    {

        try
        {
            fract1.divide(fract4);
        }
        

        catch (ArithmeticException e)
        {
            assertEquals("Division by zero is undefined.", e.getMessage());
        }
    
    } //END 







    /**
    * Tests the equals method of class Fraction.
    */
    @Test
    public void testEquals()
    {
        assertFalse         (fract1.equals("giraffe"));                         //Argument is of the wrong type.
        

        Fraction            nullFract = null;
        assertFalse         (fract4.equals(nullFract));                         //Null vs. non-null references.
        
		assertFalse         (fract1.equals(fract2));                            //Different fraction instances.
        

        assertTrue          (fract3.equals(fract3));                            //Reflexivity.
        

        assertEquals        (new Fraction( -3,4 ), fract2);                     //Symmetry.
        assertEquals        (fract2, new Fraction( -3,4 ));                    	//Symmetry.
        

        Fraction            transitiveTestFract1 = new Fraction( 1,2 );
        Fraction            transitiveTestFract2 = new Fraction( 1,2 );
        assertEquals        (fract1, transitiveTestFract1);                     //Transitivity.
        assertEquals        (transitiveTestFract1, transitiveTestFract2);       //Transitivity.
        assertEquals        (transitiveTestFract2, fract1);                     //Transitivity.
        

        assertFalse         (fract4.equals(new Fraction( 0,8 )));
        assertTrue          (fract4.equals(new Fraction( 0,5 )));
        assertTrue          (fract1.equals(new Fraction( 1,2 )));
        assertEquals        (new Fraction( 6,11 ), fract3);
        assertEquals        (fract3, new Fraction( 6,11 ));
    
    } //END 







    /**
    * Tests the hashCode method of class Fraction.
    * If a call to equals on two objects returns true,
    * then the two objects should have the same hash code.
    */
    @Test
    public void testHashCode()
    {
        assertFalse     (fract1.hashCode()                  == fract2.hashCode());
        assertTrue      (fract3.hashCode()                  == fract3.hashCode());
        
        assertEquals    ((new Fraction( -3,4 )).hashCode(), fract2.hashCode());
        
        assertFalse     (fract4.hashCode()                  == (new Fraction( 0,8 )).hashCode());
        assertTrue      ((new Fraction( 6,11 )).hashCode()     == fract3.hashCode());
        assertTrue      (fract1.hashCode()                  == (new Fraction( 1,2 )).hashCode());
        assertTrue      (fract1.hashCode()                  == (new Fraction( 1,2 )).hashCode());
        assertTrue      ((new Fraction(6,11 )).hashCode()      == fract3.hashCode());
   
    } //END 








    
} //END CLASS





