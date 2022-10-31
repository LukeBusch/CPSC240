package commands;

import components.TourStatus;
/**
 * This class implements the UserInputCommand interface and issues movement commands to traverse
 * the campus during the tour
 * @author lukeb
 * “I hereby declare upon my word of honor that I have neither given 
 * nor received unauthorized help on this work.”
 */
public class BackpackCommand implements UserInputCommand
{
	/**
	 * This constructor doesn't do anything except instantiate an object
	 */
	public BackpackCommand(){
	}
	
	/**
	 * This method returns a list of backpack items as a string
	 * @param TourStatus ts
	 * @return String list of items
	 */
	@Override
	public String carryOut(TourStatus ts)
	{
		
		return ts.listBackpackItems();
	}

}
