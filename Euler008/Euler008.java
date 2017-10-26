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
 *  Inputs: A String with the number
 * 	Outputs: The biggest product with the problem rules
 * 
 * 	Requirements: None
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
		String NUM = "7316717653133062491922511967442657474235534919493496983520312774506326239578318016984801869478851843858615607891129494954595017379583319528532088055111254069874715852386305071569329096329522744304355766896648950445244523161731856403098711121722383113622298934233803081353362766142828064444866452387493035890729629049156044077239071381051585930796086670172427121883998797908792274921901699720888093776657273330010533678812202354218097512545405947522435258490771167055601360483958644670632441572215539753697817977846174064955149290862569321978468622482839722413756570560574902614079729686524145351004748216637048440319989000889524345065854122758866688116427171479924442928230863465674813919123162824586178664583591245665294765456828489128831426076900422421902267105562632111110937054421750694165896040807198403850962455444362981230987879927244284909188845801561660979191338754992005240636899125607176060588611646710940507754100225698315520005593572972571636269561882670428252483600823257530420752963450";
		final long DIGITS_ADJ = 13;
		//----------
		
		//Variables
		long[] digits = new long[NUM.length()];
		long maxProd = 0;
		long prod;
		//----------
		
 		//Split the digits into an array
 		for(int i = 0; i < digits.length; i++){
			//Simple counter for, we check i and sum 1 each iteration until we are >= than the length of the digits array, then we exit the loop
			digits[i] = Character.getNumericValue(NUM.charAt(i));
			
		}
  		//Find all 13 adjacent digits sums O(n)
  		for(int i = 0; i <= digits.length-DIGITS_ADJ; i++){  //All digits except the DIGITS_ADJ last to avoid outOfBounds
			
			/*Simple counter for, we check i and sum 1 each iteration until we are > than the length of the digits array
			 *minus the number of digits we are checking (to avoid out of bounds) + 1  , then we exit the loop*/
			
			prod = 1;                                        //Reset counter every cycle
			for(int j = i; j < i+DIGITS_ADJ; j++){          //Himself and the DIGITS_ADJ-1 next
				
				/*Simple counter for, we check j, starting at i (current array position) 
				 * and sum 1 each iteration until we are >= than i(starting value)+the number of digits we are checking*/
				
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

