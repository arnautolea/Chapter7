/*(Dice Rolling) Write an application to simulate the rolling of two dice. 
The application should use an object of class Random once to roll the first die and again to roll the second die. 
The sum of the two values should then be calculated. Each die can show an integer value from 1 to 6, so
the sum of the values will vary from 2 to 12, with 7 being the most frequent sum, and 2 and 12 the least frequent. 
Figure 7.28 shows the 36 possible combinations of the two dice. 
Your application should roll the dice 36,000,000 times. Use a one-dimensional array to tally the number of times
each possible sum appears. Display the results in tabular format.*/
package Chapter07;

import java.security.SecureRandom;

public class Exercise0717 {
	
	public static void main (String[] args){
		
		int[] sum = new int[11];
		System.out.println("sum\tfrequency");
		for(int i = 0; i < 36000000; i++){
			int dice1= random();
			int dice2 = random();
			++sum[(dice1 + dice2)-2];
		}
		for (int k = 0; k < sum.length; k++){
			System.out.print((k + 2) + "\t" + sum[k] + "\n");
		}
	}
	public static int random() {

		SecureRandom rollNumber = new SecureRandom();
		int random = 1 + rollNumber.nextInt(6);

		return random;
	}
}
/*
sum	frequency
2	999378
3	2001505
4	2998371
5	3999396
6	5000686
7	5996551
8	4999992
9	4002709
10	2998440
11	2002006
12	1000966
*/
