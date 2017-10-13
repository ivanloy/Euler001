/* 	PROBLEM
 *	-------------
 * 	If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
 * 	Find the sum of all the multiples of 3 or 5 below 1000.
 * 
 * 	ANALYSIS
 * 	------------
 * 	Our program will give us as a screen output the sum of all the multiples of 3 and 5 below 1000 (without repeating).
 * 
 * 	START
 *		Get the sum of the multiples of 3 until 1000
 * 		Get the sum of the multiples of 5 that are not multiples of 3 
 * 		Sum both results
 * 		Print the answer		 
 * 	ENDMP
 */


public class Euler001 {
	
	public static void main (String[] args) {
		
		GetMultiples multiples=new GetMultiples(); //Create new GetMultiples object
		long sum=0;								   //long because it can overflow quickly
		final int[] NUMBERS={3,5};                 //Initialize variables and constants
		final int LIMIT=1000;
		
		
		//call the methods and add the results to sum, then print them
		sum=multiples.getMultiplesSum(NUMBERS[0],LIMIT);     
		sum+=multiples.getMultiplesSum(NUMBERS[1],LIMIT,NUMBERS[0]);  
		System.out.println(sum);
		sum=multiples.getMultiplesSumOf(NUMBERS,LIMIT);
		System.out.println(sum);
		
	}
}

