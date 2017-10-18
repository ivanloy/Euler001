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
 * 	Pseudocode level 0:
 * 
 * 	BEGIN
 * 		WHILE number is not valid
 * 			Check if next (20 more each time) is valid
 * 		END_WHILE
 * 		Print number
 * 	ENDMP
 * 
 */
 
public class Euler005 {
	
	public static void main (String[] args) {
		
		boolean valid=false;
		final int MAX_NUMBER=20;
		int number=MAX_NUMBER;
		int answer=0;
		
		while(!valid){
			int validCount=0;
			for(int i=2; i<=MAX_NUMBER; i++){
				if(number%i!=0) break;
				else validCount++;
				if(validCount==MAX_NUMBER-1){
					valid=true;
					answer=number;
				}
			}
		
			number+=MAX_NUMBER;
			
		}
		
		System.out.println(answer);
	}
}

