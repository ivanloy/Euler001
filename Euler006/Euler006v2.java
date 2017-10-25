/*	Program name: Euler006v2
 * 
 *	PROBLEM
 * 	--------
 * 	Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum
 * 
 * 	ANALYSIS
 * 	---------
 * 	Our program will give us the sum of the squares of natural numbers smaller or equal to 1000 minus the square of it's sum
 * 	
 * 	REQUIREMENTS
 * 	------------
 * 	1+2+3...+n series formula: n(n + 1)/2	
 *  1^2+2^2+3^2...+n^2 series formula: (2n + 1)(n + 1)n/6
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
public class Euler006v2 {
	
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
		
		sumSquares = (2*MAX+1)*(MAX+1)*MAX/6;           //Calculate the sum of the squares n(n + 1)/2 series formula
		
		squareSum = MAX*(MAX+1)/2;                      //Calculate the square of the sum (2n + 1)(n + 1)n/6 series formula
		squareSum = squareSum*squareSum;
		
		difference = squareSum-sumSquares;                                          //Find the difference
		System.out.println(squareSum + "-" + sumSquares + "=" + difference);        //Print it
		
  	//ENDMP
	}
	
}

