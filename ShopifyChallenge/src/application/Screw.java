package application;
import java.io.Serializable;

/*
 * class for all screws in the fastener ordering system. In this assignment, there are only wood screws, 
 * but if more screws were added, they would extend this class.
 * 
 * This class is used to get the number of screw orders.
 * 
 * Created by: Aditi Srinivasan
 * Net ID: 18ars11
 * Student Number: 20156850
 */

public class Screw extends Fastener implements Serializable
{
	private static final long serialVersionUID = 7921278016620019437L;
	
	// Stores the number of units ordered
	private static int orderSize;
	
	public Screw(double price, int orderSize) throws IllegalFastener
	{
		// use Fastener's constructor for price
		super(price);
		
		// Make sure that the order size is at least 1 and at most 10000
		if(orderSize<1 || orderSize>10000)
			throw new IllegalFastener ("Wrong number of screws!");

		// set orderSize
		this.orderSize = orderSize;
	} // End constructor

	// get the total price for the order
	public double getOrderCost(int orderSize) 
	{
		// the total price is the price for 1 unit multiplied by the number of units ordered
		double price = getPrice()*orderSize;
		return price;
	} // End getOrderCost
	
	public String toString()
	{
		// add orderSize to the string. Use Fastener's toString to add price to the string
		return orderSize+" in a unit, "+super.toString();
	} // End toString
} // End Screw
