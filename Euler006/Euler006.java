/*	Program name: Euler006
 * 
 *	PROBLEM
 * 	--------
 * 	Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum
 * 
 * 	ANALYSIS
 * 	---------
 * 	Our program will give us the sum of the squares of natural numbers smaller or equal to 1000 minus the square of it's sum
 * 
 * 	Pseudocode level 0:
 * 
 * 	BEGIN
 * 		Calculate the sum of the squares
 * 		Calculate the square of the sum
 * 		Find the difference
 * 		Print it
 * 	ENDMP
 * 
 */
public class Euler006 {
	
	public static void main (String[] args) {
	//BEGIN
	
		//Variables
		int sumSquares = 0;
		int squareSum = 0;
		int difference;
		//---------
		//Constants
		final int MAX = 100;
		//----------
		
		for(int i = 1; i <= MAX; i++) sumSquares += i*i;  //Calculate the sum of the squares
		
		//Calculate the square of the sum
		for(int i = 1; i <= MAX; i++) squareSum += i;     //I use two identical for loops just for readability purposes, not efficiency needed
		squareSum = squareSum*squareSum;
		//-------------------------------
		
		difference = squareSum-sumSquares;                                          //Find the difference
		System.out.println(squareSum + "-" + sumSquares + "=" + difference);        //Print it
		
  	//ENDMP
	}
	
}

