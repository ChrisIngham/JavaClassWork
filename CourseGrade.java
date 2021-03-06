/**
   Big Java P5.5.
   This class stores a numeric course grade. It contains a method to convert the numeric values to a letter grade string.  

   Letter grades are A B C D F, possibly followed by + or -.  
   Their numeric values are 4, 3, 2, 1, and 0.
   There is no F+ or F-.
   The + increases the numeric value by 0.3, a - decreases it by 0.3.
   However, an A+ still has the value 4.0.
   All other grades have the value -1.

   For example, the number 2.8 (which might be the average of several grades)
   would be converted to B- (since a B- is 2.7).
   Break ties in favor of the better grade; for example, 2.85 (midway between
   2.7 B- and 3.0 B) would become a B.
   Any value greater than or equal to 4.15 should be an A+.
   As another example, the number 0.4 should be what?  Well, an F is 0
   and a D- is 0.7, so anything from 0.35 and up is at least a D-.
 */
public class CourseGrade
{
    public static final double 
	APLUS = 4.15, A = 3.85, AMINUS = 3.5, 
	BPLUS = 3.15, B = 2.85, BMINUS = 2.5, 
	CPLUS = 2.15, C = 1.85, CMINUS = 1.5, 
	DPLUS = 1.15, D = 0.85, DMINUS = 0.35 ; 
    private double grade ;
    /**
       Initialize instance variable grade to the given value
       @param grade the numeric grade
     */
    public CourseGrade(double grade)
    {
	  this.grade = grade ;
    }
    /**
       Converts the numeric value stored in the instance variable grade to the corresponding letter grade
       @return the letter grade string.
     */
    public String getLetterGrade() 
    {
	//-----------Start below here. To do: approximate lines of code = 26
	// return the value corresponding to the numeric grade stored in instance variable grade
	//Use the constants defined above.
	
	// 4 = a+ , 3.66 = a , 3.33 = a- , 3 = b+ , 2.66 = b, 2.33 = b-, 2 = c+, 1.66 = c, 1.33 = c-, 
	// 1 = d+, 0.66 = d, 0.33 = d- , 0 = f
	String letterGrade;
	if (grade >= APLUS){
		letterGrade = "A+";
	} else if (grade >= A){
		letterGrade = "A";
	} else if (grade >= AMINUS){
		letterGrade = "A-";
	} else if (grade >= BPLUS){
		letterGrade = "B+";
	} else if (grade >= B){
		letterGrade = "B";
	} else if (grade >= BMINUS){
		letterGrade = "B-";
	} else if (grade >= CPLUS){
		letterGrade = "C+";
	} else if (grade >= C){
		letterGrade = "C";
	} else if (grade >= CMINUS){
		letterGrade = "C-";
	} else if (grade >= DPLUS){
		letterGrade = "D+";
	} else if (grade >= D){
		letterGrade = "D";
	} else if (grade >= DMINUS){
		letterGrade = "D-";
	} else {
		letterGrade = "F";
	}
	return letterGrade;
		
	
	//-----------------End here. Please do not remove this comment. Reminder: no changes outside the todo regions.
    }
    /**
       Returns a string representation of the numeric grade value
       @return the string representation of the numeric value stored in grade
     */
    public String toString() 
    {
	return "" + grade ;
    }
}
