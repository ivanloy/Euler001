/*	Program name: Euler008
 * 
 *	PROBLEM
 * 	--------
 * 	Find the thirteen adjacent digits in the 1000-digit number that have the greatest product. What is the value of this product?
 * 
 * 	ANALYSIS
 * 	---------
 * 	Our program will give us the biggest 13 adjacent digits product of input number (as a String)
 * 
 * 	Pseudocode level 0:
 * 
 * 	BEGIN
 * 		Split the digits into an array
 * 		Find all 13 adjacent digits product O(n)
 * 		Print the biggest sum
 * 	ENDMP
 * 
 */

public class Euler008 {
	
	public static void main (String[] args) {
	//BEGIN
	
		//Constants
		final String NUM = "4124112313";
		final int DIGITS_ADJ = 3;
		//----------
		
		//Variables
		int[] digits = new int[NUM.length()];
		int maxProd = 0;
		int prod;
		//----------
		
 		//Split the digits into an array
 		for(int i = 0; i < digits.length; i++){
			
			digits[i] = NUM.charAt(i);
			
		}
  		//Find all 13 adjacent digits sums O(n)
  		for(int i = 0; i < digits.length-DIGITS_ADJ+1; i++){  //All digits except the DIGITS_ADJ last to avoid outOfBounds
			
			prod = 1;                                        //Reset counter every cycle
			for(int j = i; j < i+DIGITS_ADJ; j++){          //Himself and the DIGITS_ADJ-1 next
				System.out.print(j+" "+digits[j]+" ");
				prod *= digits[j];
				
			}	
			System.out.println("\n"+prod);
			if(prod > maxProd) maxProd=prod;
			
		}
  		System.out.println(maxProd);                         //Print the biggest sum
  	//ENDMP
	}
}

