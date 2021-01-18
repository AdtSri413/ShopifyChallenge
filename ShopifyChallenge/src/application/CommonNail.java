package application;
import java.io.Serializable;

/*
 * This class is for common nails in the fastener ordering system. It extends Nail since it is a type of nail that can be ordered.
 * 
 * This class is used to get the attributes of the common nails
 * 
 * Created by: Aditi Srinivasan
 * Net ID: 18ars11
 * Student Number: 20156850
 */

public class CommonNail extends Nail implements Serializable
{
	private static final long serialVersionUID = -5678120439296697197L;
	
	private NailDesigns.CommonNailSizes size;		// Stores the size of the nail
	private NailDesigns.CommonNailLengths length;	//Stores the length of the nail
	private NailDesigns.CommonNailGauges gauge;		// Stores the gauge of the nail
	private Finishes.CommonNailFinish finish;		// stores the finish of the nail
	
	public CommonNail(NailDesigns.CommonNailSizes size, NailDesigns.CommonNailLengths length, NailDesigns.CommonNailGauges gauge, Finishes.CommonNailFinish finish, double price, int orderSize) throws IllegalFastener
	{
		// Use Nail constructor for price and orderSize
		super(price, orderSize);
		
		// Set all attributes
		this.size = size;
		this.length = length;
		this.gauge = gauge;
		this.finish = finish;
	} // End constructor
	
	public String getName()
	{
		return "Common nail, "+size+" size, "+length+"\" long, "+gauge+" gauge, Steel, with a "+finish+" finish. ";
	}

	public String toString()
	{
		// Add all attributes to string
		return getName()+super.toString();
		
	} // End toString
} // End CommonNail
