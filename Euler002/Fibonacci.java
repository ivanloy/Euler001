/*
 * 	ANALYSIS
 * 	-----------
 * 	We will get Fibonacci numbers and some calculus with them
 * 
 * 	LOCAL VARIABLES
 * 	----------------
 * 	integer sum1: The first number of the fibonacci sum, initializes at 0  (sum1+sum2=newFibonacci)
 *	integer sum2: The second number of the fibonacci sum, initializes at 1 that will later become sum1
 * 	integer newFibonacci: The sum of sum1 and sum2 that will later become sum2
 * 	integer totalSum: The total sum of all fibonacci numbers checked
 * 
 * 	METHODS
 * 	----------
 * 	///sum(int limit, int divisibleBy);
 * 
 * 	Description: We get the sum of all fibonacci numbers divisible by divisibleBy and smaller than limit
 * 	Input: 1 or 2 integers, if only 1 integer, divisible by will become 1.
 * 	Output: 1 integer 
 * 	
 * 	START
 * 		REPEAT until newFibonacci reaches limit
 * 			Get Fibonacci number
 * 			IF is divisible by divisibleBy
 * 				add to totalSum
 * 			END_IF
 * 		END_REPEAT
 * 	END
 */


 
public class Fibonacci{
	
	//Declare variables
	long sum1;
	long sum2;
	long newFibonacci;
	long totalSum;
	//-----------------------------
	
	public Fibonacci(){
		//Initialize variables
		sum1 = 0;
		sum2 = 1;
		newFibonacci = 0;
		totalSum = 0;
		//----------------------
	}
	
	/* limit: the number to stop counting
	 * divisibleBy: the number it whould be divisible by to be added to totalSum, if null, it will be 1*/
	public long sum(int limit, int divisibleBy){
		while(newFibonacci<limit && divisibleBy>0){  				 //stop when we reach limit or if data is not valid
			if(newFibonacci%divisibleBy==0) totalSum+=newFibonacci;  //If its divisible add to totalSum
			//Get new fibonacci number and put the new valaues in sum1 and sum2
			newFibonacci = sum1+sum2; 
			sum1 = sum2;
			sum2 = newFibonacci;
		}
		
		return totalSum;
	}
	
	public long sum(int limit){
		return sum(limit,1);   //If no second parameter, use 1
	}
	
}

