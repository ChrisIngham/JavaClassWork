/**
   Converts Roman numerals to decimal value
   
*/
import java.util.Scanner;

public class RomanNumerals
{
	public static void main(String[] args)
	{
	   Scanner in = new Scanner("I C X D M L");

	   char romanNumeral = in.next().charAt(0);
	   System.out.println("Value: " + valueOf(romanNumeral) + "   Expected: 1") ;
	   
	   romanNumeral = in.next().charAt(0);
	   System.out.println("Value: " + valueOf(romanNumeral) + "   Expected: 100") ;
	   
	   romanNumeral = in.next().charAt(0);
	   System.out.println("Value: " + valueOf(romanNumeral) + "   Expected: 10") ;
	   
	   romanNumeral = in.next().charAt(0);
	   System.out.println("Value: " + valueOf(romanNumeral) + "   Expected: 500") ;
	   
	   romanNumeral = in.next().charAt(0);
	   System.out.println("Value: " + valueOf(romanNumeral) + "   Expected: 1000") ;
	   
	   romanNumeral = in.next().charAt(0);
	   System.out.println("Value: " + valueOf(romanNumeral) + "   Expected: 50") ;
	}
	
   /**
      Gives the value of the Roman numerals I X L C D M
      @param numeral a single Roman numeral
      @return the integer value of numeral
   */
   //-----------Start below here. To do: approximate lines of code = 14
   // write a static method valueOf with the appropriate parameters and return type. 	
    public static int valueOf (char romanNumeral){
	int value;
	if (romanNumeral == 'I'){
	    value = 1;
	}else if (romanNumeral == 'C'){
	    value = 100;
	}else if (romanNumeral == 'X'){
	    value = 10;
	}else if (romanNumeral == 'D'){
	    value = 500;
	}else if (romanNumeral == 'M'){
	    value = 1000;
	}else if (romanNumeral == 'L'){
	    value = 50;
	}else{
	    value = 0;
	}
	return value;
    }
   
   
   
   
      
   
      // must be an M
   
   
   //-----------------End here. Please do not remove this comment. Reminder: no changes outside the todo regions.
}
