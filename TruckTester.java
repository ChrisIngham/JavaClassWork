import java.awt.Color ;
/**
   This is a basic driver that constructs a Truck object.
 */
public class TruckTester
{
    public static void main(String[] args)
    {
	Truck truck = new Truck(Color.CYAN, 30.5) ;
	System.out.println(truck.toString()) ;
	System.out.println("Expect:") ;
	System.out.println("Truck[color = java.awt.Color[r=0,g=255,b=255], gas = 30.5]") ;
    }
}
