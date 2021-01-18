package application;
import java.io.Serializable;

/*
 * This class is the top of the hierarchy and is used to set the price of a unit.
 * 
 * Created By: Aditi Srinivasan
 * Net ID: 18ars11
 * Student number: 20156850
 */

public abstract class Fastener implements Serializable
{
	private static final long serialVersionUID = -7419911425932270881L;
	
	private double price;	// Stores the price of a unit
	
	public Fastener(double price) throws IllegalFastener
	{
		// Ensure that the suggested price is valid
		if(price<0)
			throw new IllegalFastener ("Not a valid price!");
		
		// Set price
		this.price = price;
	} // End constructor
	
	public double getPrice()
	{
		return price;
	} // End getPrice
	
	public abstract double getOrderCost(int orderSize);
	
	public String toString()
	{
		// Add price to string
		return "$"+price+" per unit.";
	} // End toString
	
}
