package application;
import java.io.Serializable;

/*
 * Exception class. Thrown if any parameters are invalid.
 *
 * Created by: Aditi Srinivasan
 * Net ID: 18ars11
 * Student number: 20156850
 */

public class IllegalFastener  extends Exception implements Serializable
{
	private static final long serialVersionUID = 5629590173984671247L;

	public IllegalFastener (String message) {
		super(message);
	}
	
	public IllegalFastener () {
		super("Invalid fastener!");
	}
}
