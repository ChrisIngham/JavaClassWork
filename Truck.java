import java.awt.Color ;
/**
   Truck class.  So far it has a Color instance variable.  Your job is to add 
   an instance variable called gas that keeps track of the amount of gas in the gas tank
   Adjust the constructor to initialize gas.
   Adjust the toString() method as indicated.
 */
public class Truck
{
    //instance variables
    private Color color ;
    //-----------Start below here. To do: approximate lines of code = 1
    // Put here another instance variable, one for gas (What type should it be?? look below for clues)
   private double gas; 
    //-----------------End here. Please do not remove this comment. Reminder: no changes outside the todo regions.

    /**
       Initializes instance variables given color and fuel reading.
       @param color1 the given color
       @param fuel the given fuel reading
     */
    public Truck(Color color1, double fuel)
    {
	color = color1 ;
	//-----------Start below here. To do: approximate lines of code = 1
	// Complete the constructor
	gas = fuel;	
	//-----------------End here. Please do not remove this comment. Reminder: no changes outside the todo regions.
    }
    /**
       Returns a string representation of the Truck.
       @return something like Truck[color = ..., gas = ...]
     */
    public String toString()
    {
	//-----------Start below here. To do: approximate lines of code = 1
	// return "Truck[color = " + color + "]"  ; but include gas
	return "Truck[color = " + color + ", gas = " + gas + "]" ;	
	//-----------------End here. Please do not remove this comment. Reminder: no changes outside the todo regions.
    }
}
