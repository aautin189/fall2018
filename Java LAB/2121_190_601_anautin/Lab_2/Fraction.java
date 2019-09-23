

// Import statement
import java.lang.ArithmeticException;


/**
* A class to model a fraction.  The methods include 
* add, substract, multiply, divide, toString, and 
* the appropriate getters.
*
* Please complete the documentation for this class
* and complete the code for methods subtract and multiply.
*
* @author    Abby Autin
* @version   August 31th, 2018
*/





public class Fraction
{
    


    private int numerator;
    private int denominator;




    /**
    * Initializes numerator and denominator as values
    * passed in as arguments.
    *
    * @param     numerator   The new fraction's numerator.
    * @param     denominator The new fraction's denominator.
    */
    public Fraction(int numerator, int denominator)
    {

		//Initialize instance variables in constructor.
        this.numerator = numerator;
        this.denominator = denominator; 

    } // END >> Constructor







    /**
    * Returns the numerator of the fraction.
    *
    * @return    this.numerator
    */
    public int getNumerator()
    {
        //Getter!
        return this.numerator;
    } // END >> method





    /**
    * Returns the denominator of the fraction.
    *
    * @return    this.denominator
    */
    public int getDenominator()
    {
        //Getter!
        return this.denominator;
    } // END >> method






    /**
    * take in a fraction and add it to an existing fraction
    *
    * @param    Fraction    otherFraction
    * @return               The sum of the two added fractions.
    */
    public Fraction add(Fraction otherFraction)
    {

		// Find common denominator 
        int commonDenom = this.denominator * otherFraction.denominator;
		
		// Calculate the sum of the numerators by cross multiplying 
        int sumNumerator = (this.numerator * otherFraction.denominator) + (otherFraction.numerator * this.denominator);

        // Create new Fraction object to store results
		Fraction sum = new Fraction(sumNumerator, commonDenom);

		// Call the simplify method before returning the simplified result of our new fraction
        return sum.simplify();
    
	}// END >> method









    /**
	* take in a fraction and subtract it from an existing fraction
    * 
    * @param    Fraction    otherFraction
    * @return               The difference of the two fractions
	*
    */
    public Fraction subtract(Fraction otherFraction)
    {
		// Find common denominator 
		int commonDenom = this.denominator * otherFraction.denominator;

		// Calculate the difference of the numerators by cross multiplying 
        int diffNumerator = (this.numerator * otherFraction.denominator) - (otherFraction.numerator * this.denominator);
		
		// Create new Fraction object to store results
        Fraction diff = new Fraction(diffNumerator, commonDenom);
		
		// Return the result of our new fraction
		return diff.simplify();

    }//END






    /**
	* take in a fraction and multiply it by the existing fraction
	*
    * @param    Fraction    otherFraction
    * @return               The product of the two fractions
    */
    public Fraction multiply(Fraction otherFraction)
    {

		int newNumerator = this.numerator * otherFraction.numerator;

        int newDenom = this.denominator * otherFraction.denominator;
		
		Fraction product = new Fraction (newNumerator, newDenom);
		
		return product.simplify();

    }//END 







    /**
    * Divides the fraction by another fraction
    * provided as an argument.  Returns the quotient
    * as a new instance of a fraction.
    *
    * @param    otherFraction   The divisor by which to divide.
    * @throws   arithmeticException
    * @return   Fraction        A new fraction that is the quotient.
    */
    public Fraction divide(Fraction otherFraction)
    {
        //Attempted division by zero.
        if (otherFraction.numerator == 0)
        {
            throw new ArithmeticException("Division by zero is undefined.");
        }
        //Valid divisor fraction passed as argument.
        else
        {
            //Create inverse of divisor.
            Fraction inverse = new Fraction(otherFraction.denominator, otherFraction.numerator);
            //Multiply dividend by inverse of divisor.
            return this.multiply(inverse).simplify();
        }
    }//END








    /**
    * Returns a String representation of the fraction.
    *
    * @return   String      A String representation of this fraction.
    */
    @Override
    public String toString()
    {
        return this.numerator + " / " + this.denominator;
    }//END








    /**
    * Tests whether another fraction (passed in as
    * an Object argument) is equal to this fraction.
    * 
    * @param    otherFraction   The fraction to test for equality.
    * @return   boolean         True if equal and false if not.
    */
    @Override
    public boolean equals(Object otherFraction)
    {
		
		// STEP ONE - part a ::: Must validate that both instances of Fraction are indeed of the same class == Fraction 
		// STEP ONE - part b ::: Must validate that the value of otherFraction == null reference
        if ((otherFraction != null) && (this.getClass().equals(otherFraction.getClass())))
        {
			
			// STEP TWO ::: Use your simplify() method to simplify both instances of Fraction before we check for equivalency
            Fraction simplified 		= this.simplify();
            Fraction simplifiedOther 	= ((Fraction) otherFraction).simplify();

			
			
			
			// STEP THREE - part a ::: Must validate that the numerators of both simplified fractions are the same
			// STEP THREE - part b ::: Must validate that the denominators of both simplified fractions are the same OR that the numerator of the 1st simplified fraction is == 0 
            if ((simplified.numerator == simplifiedOther.numerator) && ((simplified.numerator == 0) || (simplified.denominator == simplifiedOther.denominator)))
            {
                return true;
            }//END
            
			
			// if any of step 3 conditions evaluates to false
			else
            {
                return false;
            }//END
        }
        
		// if any of step 1 conditions evaluates to false
		else
        {
            return false;
        }//END

    }//END

	
	
	
	
	
	
	
    /** 
    * Returns a new Fraction that is the Fraction simplified.
    *
    * @return       A new simplified fraction.
    */
    public Fraction simplify()
    {
        int factor = Math.abs(gCF(this.numerator, this.denominator));

        return new Fraction(this.numerator / factor, this.denominator / factor);

    }//END >> method


	
	
	
	
	
	
	
	
	



    /**
    * Returns a hash code for the Fraction.
    * 
    * @return       A hash code for the fraction.
    */
    @Override
    public int hashCode()
    {
        //Get the greatest common factor for use in simplifying the fraction.
        int factor = gCF(this.numerator, this.denominator);

        //Use Bloch's formula for producing a hash code.
        int result = 17;
        result = 31 * result + (this.numerator / factor);
        result = 31 * result + (this.denominator / factor);

        return result;
    }//END





    /**
    * Returns the greatest common factor of two inter values.
    * Implements Euclid's algorithm.
    * 
    * @param    a   The numerator being factored.
    * @param    b   The denominator being factored.
    * @return       The greatest common factor of the two integers.
    */
    public int gCF(int a, int b)
    {
        if (b == 0)
        {
            return a;
        }
        else
        {
            return gCF(b, a % b);
        }
    }//END









}//End class Fraction.





