import java.util.ArrayList;

/**
* Class to replace Observable from java.util
*
* @author	Abby Autin
* @version  September 17, 2018
*/


public class MyObservable 
{


	
	private boolean hasChanged;
	private ArrayList<MyObserver> listOfObservers;



    /**
    * CONSTRUCTOR: creates a new array list to store any observers added by the observable
    *
    */
	public MyObservable()
	{
		listOfObservers = new ArrayList<MyObserver> ();

	}

	
	
	
    /**
    * Adds an observer (PokemonTrainer) to the array list 
    *
    * @param o 		The PokemonTrainer that wishes to observe this instance of Pokemon
    */
	public void addObserver(MyObserver o)
	{
		boolean alreadyExists = false;

		
		if(listOfObservers.contains(o))
		{

			alreadyExists = true;

		}
		else
		{
			listOfObservers.add(o);
		}
		
		
		
	}//END
	
   




    /**
    * Overrides the hasChanged variable with a value of false; reset
    *
    */		
	protected void clearChanged()
	{
		
		hasChanged = false;
		
	}//END
	
	
	



    /**
    * 	@return Returns the number of observers in the array list 
    *
    */	
	public int countObservers()
	{
		return listOfObservers.size();
	
	}//END
	
	



	
    /**
    * 	@return Returns a boolean value that indicates whether or not an observable's state has changed
    *
    */		
	public boolean hasChanged()
	{
		if (hasChanged == true)
		{
			return true;
		}

		else
		{
			return false;
		}
		
		
	}//END
	
	


    /**
    * takes in an Object reference (which should be a WhatHappened reference, specifically)
    * The observable's array list of observers receives a message indicating the change in state to the observable
    *
    * @param    Object       arg
    */	
	public void notifyObservers(Object arg)
	{
				
		if (this.hasChanged() == true)
		{
						
			for(MyObserver currentElement : listOfObservers)
			{
		
				currentElement.update(this, arg);

			}


			clearChanged();

		}//END
		
	}//END
	


	
    /**
    * sets the hasChanged instance variable to true for that particular instance
    * The next time someone calls the hasChanged() method, it will return true
    */	
	protected void setChanged()
	{
		
		hasChanged = true;
	
	}//END
	
	
	
	
	

}//END CLASS


