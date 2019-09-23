/**
* Homework #4
* 	Recursion
* 
*
* @author	Abby Autin
* @version  October 5, 2018
*/




import java.util.ArrayList;

public class RecursionProgram
{
	


	/**
        @param s1 A String value that we will use to compare to s2
        @param s2 The other String that will be compared to s1
        @since Monday, Oct 1, 2018

        @custom.require s1 != ""
        @custom.require s2 != ""
        @custom.ensure  compareTo() == -1 || compareTo() == 0 || compareTo() == 1

    */
	public static int compareTo(String s1, String s2)
	{




		// ARE THEY EMPTY?
		// Do they have any characters left inside them to compare?
		// This must be determined first before we start doing the actual comparison functions to see who comes first alphabetically
		if (s1.length() == 0 || s2.length() == 0)
		{
			
			
			// UNEVEN STRINGS
			// okay, so that was a yes. Now, which one of you is empty?
			if (s1.length() == 0 && s2.length() == 0)
			{
				return 0;
			}



			else if (s1.length() != 0)
			{
				return 1;
			}




			else
			{
				return -1;
			}
		}//END







		if (Character.toLowerCase(s1.charAt(0)) < Character.toLowerCase(s2.charAt(0)))
		{
			return -1;
		}

		else if (Character.toLowerCase(s1.charAt(0)) > Character.toLowerCase(s2.charAt(0)))
		{
			return 1;
		}

		else
		{
			return compareTo(s1.substring(1), s2.substring(1));
		}// END



	}// END METHOD






	/**
        @param stringArray An array list of Strings that need to be assessed for smallest String
        @since Monday, Oct 1, 2018

        @custom.require stringArray != ""
        @custom.ensure  findMinimum() != ""

    */
	public static String findMinimum(ArrayList<String> stringArray)
	{
		String smallestString = findMinString(stringArray, stringArray.size());
		return smallestString;
	}// END METHOD








	/**
        @param stringArrayCopy Array list passed in from the findMinimum() method; will be reduced down to one element == the smallest element
        @param arrayListLength How many Strings are stored in the array list
        @since Monday, Oct 1, 2018

        @custom.require stringArrayCopy != ""
        @custom.require arrayListLength > 0
        @custom.ensure  findMinString() != ""

    */
	public static String findMinString(ArrayList<String> stringArrayCopy, int arrayListLength)
	{

		if (arrayListLength != 1)
		{
		
			int compareResults = compareTo(stringArrayCopy.get(0), stringArrayCopy.get(1));

			if (compareResults == 1)
			{
				
			
				stringArrayCopy.remove(0);
				findMinString(stringArrayCopy, stringArrayCopy.size());
				return stringArrayCopy.get(0);
			}
			
			else 
			{
				
				stringArrayCopy.remove(1);
				findMinString(stringArrayCopy, stringArrayCopy.size());
				return stringArrayCopy.get(0);
				
			}
		}

		else
		{ 	
			return stringArrayCopy.get(0);
		}
		

	}// END METHOD









}//END CLASS







