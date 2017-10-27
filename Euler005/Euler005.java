/*	Program name: Euler005
 * 
 *	PROBLEM
 * 	--------
 * 	2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
 *	What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
 * 
 * 	ANALYSIS
 * 	---------
 * 	Our program will give us the smallest comon multiple of numbers from 1 to 20
 * 
 *  Inputs: None
 * 	Outputs: Answer integer on screen
 * 
 * 
 * 	Pseudocode level 0: 
 * 
 * 	BEGIN
 * 		WHILE number is not valid
 * 			Check if next (add 20 to counter) is valid
 * 		END_WHILE
 * 		Print number
 * 	ENDMP
 * 
 * 
 * 	//WHILE number is not valid loop
 *  Loop control variable type:    switch
 * 	Initialize it to          :    false
 *  Exit loop when            :    true
 *  Switches when             :    it checks our number is divisible by numbers from 1 to 20
 * 	Postconditions            :    switch is true
 *  
 */
 
public class Euler005 {
	
	public static void main (String[] args) {
		
		//Constants
		final int MAX_NUMBER = 20;    
		//----------
		
		//Variables
		boolean valid = false;        //Switch first assignment
		int number = MAX_NUMBER;      //First number to check (We won't check 0)
		int answer = 0;               //The solution of our problem
		//---------- 
		
		//WHILE number is not valid
		while(!valid){
			int validCount = 0;
			
			/* Loop control variable type:    counter
			 * Initialize it to          :    2 (All numbers are divisible by 1)
			 * Exit loop when  (A or B)  :    A - It's bigger than 20   
			 *                                B - It's not divisible by loop counter
			 * Postcondition             :    It's divisible by numbers from 1 to 20*/
			 
			//Check if next (add 20 to counter) is valid
			for(int i = 2; i <= MAX_NUMBER && number%i == 0; i++){
				//if(number%i != 0) break;
				validCount++;              //If it's divisible by loop counter, add one to valid counter
				if(validCount == MAX_NUMBER-1){   //If it's 19 (20-1, as we don't check 1) 
					valid = true;                 //Update loop switch
					answer = number;              //This number will be our answer
				}
			}
			//-------------------------------------------
		
			number += MAX_NUMBER;
			
		}
		//----------------------------
		
		//Print number
		System.out.println(answer); 
		//------------      
	}
}

