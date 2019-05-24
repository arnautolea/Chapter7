/*(Command-Line Arguments) Rewrite Fig. 7.2 so that the size of the array is specified by the
first command-line argument. If no command-line argument is supplied, use 10 as the default size
of the array.*/
/*Set command-line argument: right click -> Run As -> Run Configurations -> Arguments -> Program Arguments */
package Chapter07;

public class Exercise0715 {
		
		public static void main(String[] args){
			//Try to get Command-Line Arguments, if no argument - output default array[10]
			if (args.length != 1){
				 System.out.printf("Error: Please re-enter argument for array size%nThis is default array: ");
				 int[] defaultArray = new int[10];
				 System.out.printf("%n%s%8s%n", "Index", "Value");
				 for (int counter = 0; counter < defaultArray.length; counter++)
			         System.out.printf("%5d%8d%n", counter, defaultArray[counter]);
			}
			//If find Command-Line Arguments, output array with declared length
			else{
			    // get array size from first command-line argument, convert String[] args to int 
				int arrayLength = Integer.parseInt(args[0]);
				// declare variable array and initialize it with an array object  
			      int[] array = new int[arrayLength]; // new creates the array object 
			      System.out.printf("%s%8s%n", "Index", "Value"); // column headings
			      // output each array element's value 
			      for (int counter = 0; counter < array.length; counter++)
			         System.out.printf("%5d%8d%n", counter, array[counter]);
			   } 
					
		}//main
} // end class