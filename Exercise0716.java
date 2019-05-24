/*(Using the Enhanced for Statement) Write an application that uses an enhanced for 
 statement to sum the double values passed by the command-line arguments. 
[Hint: Use the static method parseDouble of class Double to convert a String to a double value.]*/
package Chapter07;

public class Exercise0716 {

	 public static void main(String[] args){
	
		 double total = 0.0;
		 for(String arguments : args){
			 total = total + Double.parseDouble(arguments);
		 }
		 System.out.println("Sum: " + total);
	 }
} 
