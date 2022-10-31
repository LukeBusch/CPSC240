package components;
/**
 * This method is holds doors which connect Locations in the campus. Each door has a direction, a leaving, and an entering
 *@author Luke Busch
 *“I hereby declare upon my word of honor that I have
 * neither given nor received unauthorized help on this work.”
 * CPSC240-03
 */
public class Door
{
	private String direction;
	private Location leavingLocation;
	private Location enteringLocation;

	/**
	 * This constructor instantiates all class variables to null
	 */
	public Door()
	{
		this.direction = null;
		this.leavingLocation = null;
		this.enteringLocation = null;
	}
	/**
	 * sets all class variables to their corresponding arguments
	 * @param dir
	 * @param leave
	 * @param enter
	 */
	public Door(String dir, Location leave, Location enter)
	{
		this.direction = dir;
		this.leavingLocation = leave;
		this.enteringLocation = enter;
	}

	/**
	 * Prints out the details of the door in a legible way.
	 * @return
	 */
	public String describe()
	{
		
		return "This door leaves from " + leavingLocation.getName() + ", goes " + direction + ", and enters " + enteringLocation.getName() + ".";
	}

	/**
	 * returns the leavingLocation variable
	 * @return Location
	 */
	public Location getLeaving()
	{
		return leavingLocation;
	}
	
	/**
	 * sets the variable leavingLocation to the argument
	 * @param leaving
	 */
	public void setLeaving(Location leaving)
	{
		this.leavingLocation = leaving;
	}
	
	/**
	 * returns the variable enteringLocation
	 * @return Location
	 */
	public Location getEntering()
	{
		return enteringLocation;
	}
	
	/**
	 * sets the variable enteringLocation to the argument
	 * @param enter
	 */
	public void setEntering(Location enter)
	{
		this.enteringLocation = enter;
	}
	
	/**
	 * returns the variable direction
	 * @return String (direction)
	 */
	public String getDirection()
	{
		return direction;
	}
	
	/**
	 * sets the variable direction equal to the argument
	 * @param dir
	 */
	public void setDirection(String dir)
	{
		this.direction = dir;
	}
}
