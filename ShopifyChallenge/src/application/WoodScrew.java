package application;
import java.io.Serializable;

/*
 * This class is for wood screws in the fastener ordering system. It extends Screw since it is a type of screw that can be ordered.
 * 
 * This class is used to get the attributes of the wood screws
 * 
 * Created by: Aditi Srinivasan
 * Net ID: 18ars11
 * Student Number: 20156850
 */

public class WoodScrew extends Screw implements Serializable
{
	private static final long serialVersionUID = 2376945290745685129L;
	
	private double length;							// Stores the length of the screw
	private Threads thread;							// Stores type/spacing of threads of the screw
	private Materials.ThreadedMaterials material;	// Stores material of the screw
	private Finishes.ScrewFinish finish;			// Stores the finish of the screw
	private ScrewDesigns.ScrewHeads head;			// Stores the type of head of the screw
	private ScrewDesigns.ScrewDrive drive;			// Stores the type of drive of the screw
	private ScrewDesigns.WoodScrewPoints point;		// stores the type of point of the screw
		
	public WoodScrew(double length, Threads thread, Materials.ThreadedMaterials material, Finishes.ScrewFinish finish, ScrewDesigns.ScrewHeads head, ScrewDesigns.ScrewDrive drive, ScrewDesigns.WoodScrewPoints point, double price, int orderSize) throws IllegalFastener
	{
		// Use Screw's constructor for price and orderSize
		super(price, orderSize);
		
		// Make sure that all attributes are valid
		if((material == Materials.ThreadedMaterials.Brass || material == Materials.ThreadedMaterials.Stainless_Steel) && finish != Finishes.ScrewFinish.Plain)
			throw new IllegalFastener ("Wrong material & finish combination");
		
		if((finish != Finishes.ScrewFinish.Chrome && finish != Finishes.ScrewFinish.Hot_Dipped_Galvanized && finish != Finishes.ScrewFinish.Plain && finish != Finishes.ScrewFinish.Yellow_Zinc && finish != Finishes.ScrewFinish.Zinc && finish != Finishes.ScrewFinish.Black_Phosphate && finish != Finishes.ScrewFinish.ACQ_1000_Hour && finish != Finishes.ScrewFinish.Lubricated) && material == Materials.ThreadedMaterials.Steel)
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
		this.head = head;
		this.drive = drive;
		this.point = point;
	} // End constructor

	public String getName()
	{
		return "Wood screw, "+point+" point, "+head+" head, "+drive+" drive, "+length+"\" long, "+thread+" thread, "+material+", with a "+finish+" finish. ";
	}
	
	public String toString()
	{
		// Add all attributes to string
		return getName()+super.toString();
	} // End toString
} // End WoodScrew
