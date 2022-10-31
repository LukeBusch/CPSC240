package commands;

import components.TourStatus;
/**
 * This interface is UserInputCommand. It is use to ensure all user commands have a carryOut
 * method.
 * @author lukeb
 *“I hereby declare upon my word of honor that I have neither given nor
 * received unauthorized help on this work.”
 */
public interface UserInputCommand
{		
		/**
		 * This method is where the commands are carried out in all classes that implement.
		 * @param ts
		 * @return String receipt
		 */
		public String carryOut(TourStatus ts);
}
