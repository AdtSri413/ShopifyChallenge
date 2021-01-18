package application;
import java.io.Serializable;

/*
 * This class is for wing nuts in the fastener ordering system. It extends InnerThreaded since it is a type of nut that can be ordered.
 * 
 * This class is used to get the attributes of the wing nuts
 * 
 * Created by: Aditi Srinivasan
 * Net ID: 18ars11
 * Student Number: 20156850
 */

public class WingNut extends InnerThreaded implements Serializable
{
	private static final long serialVersionUID = 2893174588418596466L;
	
	private Threads thread;							// Stores the type/spacing of the threads of the nut
	private Materials.ThreadedMaterials material;	// Stores the material of the Nut
	private Finishes.WingNutFinish finish;			// Stores the finish of the nut
	
	public WingNut(Threads thread, Materials.ThreadedMaterials material, Finishes.WingNutFinish finish, double price, int orderSize) throws IllegalFastener
	{
		// Use InnerThreaded's constructor for price and orderSize
		super(price, orderSize);
		
		// Make sure that all attributes are valid
		if((material == Materials.ThreadedMaterials.Brass || material == Materials.ThreadedMaterials.Stainless_Steel) && finish != Finishes.WingNutFinish.Plain)
			throw new IllegalFastener ("Wrong material & finish combination");
		
		if((finish != Finishes.WingNutFinish.Chrome && finish != Finishes.WingNutFinish.Hot_Dipped_Galvanized && finish != Finishes.WingNutFinish.Plain && finish != Finishes.WingNutFinish.Yellow_Zinc && finish != Finishes.WingNutFinish.Zinc) && material == Materials.ThreadedMaterials.Steel)
			throw new IllegalFastener ("Wrong material & finish combination");
		
		// Set all attributes
		this.thread = thread;
		this.material = material;
		this.finish = finish;
	} // End constructor
	
	public String getName()
	{
		return "Wing nut, "+thread+" thread, "+material+", with a "+finish+" finish. ";
	}

	public String toString()
	{
		// Add all attributes to string
		return getName()+super.toString();
	} // End toString
} // End WingNut
