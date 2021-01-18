package application;
import java.io.Serializable;

/*
 * This class is for carriage bolts in the fastener ordering system. It extends Bolt since it is a type of bolt that can be ordered.
 * 
 * This class is used to get the attributes of the carriage bolts
 * 
 * Created by: Aditi Srinivasan
 * Net ID: 18ars11
 * Student Number: 20156850
 */

public class CarriageBolt extends Bolt implements Serializable
{
	private static final long serialVersionUID = 6288624395931297710L;
	
	private double length;							// Stores the length of the bolt
	private Threads thread;							// stores the type/spacing of threads on the bolt
	private Materials.ThreadedMaterials material;	// stores the material of the bolt
	private Finishes.BoltFinish finish;				// stores the finish of the bolt
	
	public CarriageBolt(double length, Threads thread, Materials.ThreadedMaterials material, Finishes.BoltFinish finish, double price, int orderSize) throws IllegalFastener
	{
		// Use Bolt's constructor for price and orderSize
		super(price, orderSize);
		
		// Make sure that all attributes are valid
		if((material == Materials.ThreadedMaterials.Brass || material == Materials.ThreadedMaterials.Stainless_Steel) && finish != Finishes.BoltFinish.Plain)
			throw new IllegalFastener ("Wrong material & finish combination");
		
		if(length*100 % 100 == 25 || length*100 % 100 == 75)
		{
			if(length<0.5 || length>6)
				throw new IllegalFastener ("Wrong length!");
		}
		else if(length*100 % 100 == 50)
		{
			if(length<0.5 || length>11)
				throw new IllegalFastener ("Wrong length!");
		}
		else if(length*100 % 100 == 0)
		{
			if(length<0.5 || length>20)
				throw new IllegalFastener ("Wrong length!");
		}
		else
		{
			throw new IllegalFastener ("Wrong length!");
		}
		
		// Set all attributes
		this.length = length;
		this.thread = thread;
		this.material = material;
		this.finish = finish;
	} // End constructor
	
	public String getName()
	{
		return "Carriage Bolt, "+length+"\" long, "+thread+" thread, "+material+", with a "+finish+" finish. ";
	}

	public String toString()
	{
		// Add all attributes to string
		return getName()+super.toString();
	} // End toString
} // end CarriageBolt
