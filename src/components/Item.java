package components;

import java.util.Scanner;

/**
 * This is the Item class, which holds two Strings for the name and description of the items
 * @author lukeb
 *“I hereby declare upon my word of honor that I have neither given nor
 * received unauthorized help on this work.”
 */
public class Item
{
	private String name;
	private String message;
	/**
	 * This constructor is a default constructor.
	 */
	public Item(){	
	}
	/**
	 * This constructor is a default constructor.
	 * @param s
	 */
	public Item(Scanner s)
	{
	}
	/**
	 * This method sets the class variable name to the String arg.
	 * @param name
	 */
	public void setName(String name)
	{
		this.name = name;
	}
	/**
	 * This method returns the class variable name as a String
	 * @return name
	 */
	public String getName()
	{
		return this.name;
	}
	/**
	 * This method sets the class variable message to the String arg
	 * @param mess
	 */
	public void setMessage(String mess)
	{
		this.message = mess;
	}
	/**
	 * This method returns the class variable message as a String.
	 * @return message
	 */
	public String getMessage()
	{
		return this.message;
	}
}
