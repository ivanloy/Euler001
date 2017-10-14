/*
 * 	ANALYSIS
 * 	-----------
 * 	We will get the multiples of a given number in addition of other functionalities
 * 
 * 	LOCAL VARIABLES
 * 	----------------
 * 	integer multiplesSum: The result sum of all the multiples until limit.
 * 
 * 	METHODS
 * 	----------
 * 	///integer getMultiplesSum(int base, int limit, int except);
 * 
 * 	Description: We get the sum of the multiples of base that are not multiples of except and are smaller than limit
 * 	Input: 2 or 3 integers
 * 	Output: 1 integer 
 * 	
 * 	START
 * 		REPEAT until multiple reaches limit
 * 			Take the Nth multiple beginning with the base*1
 * 			IF it's not a multiple of the except number
 * 				Sum it to multiplesSum
 * 			END_IF
 * 			Return multiplesSum
 * 		END_REPEAT
 * 	END
 * 
 * 
 * 	///integer getMultiplesSumOf(int[] numbers, int limit)
 * 
 * 	Description: We get the sum of the multiples of the numbers in the input arrar
 * 	Input: 1 Integers array and 1 int
 * 	Output 1 Integer
 * 
 * 	START
 * 		CYCLE through all integers until limit
 * 			CYCLE though all numbers in the array input
 * 				IF integer is divisible by the number
 * 					sum to multiplesSum
 * 					exit loop
 * 				END_IF
 * 			END_CYCLE
 * 		END_CYCLE
 * 	END
 */


public class GetMultiples {
	
	long multiplesSum;   //long because it can overflow quickly
	
	public GetMultiples(){
		multiplesSum=0;
	}
	
	/*base: number we want to take the multiples of
	  except: number which multiples we want to skip
	  limit: number in which we will stop counting multiples*/
	  
	public long getMultiplesSum(int base, int limit){
		
		multiplesSum=0;
		
		for(int i=1; i<(limit/base)+1; i++){  //we get only through the multiples of base, limit/base is the number of times it happens until limit 
			
			if(i*base>=limit){                //if the multiple is higher than the limit, exit the loop
				break;
			}
			
			multiplesSum+=i*base;			  //if everything is correct, sum it to multiples sum
		}
		
		return multiplesSum;
	}
	
	public long getMultiplesSum(int base, int limit, int except){
		
		multiplesSum=0;
		
		for(int i=1; i<(limit/base)+1; i++){
			
			if(i*base>=limit){
				break;
			}
			
			if(i*base%except==0){            //if it is a multiple of except, skip this cycle
				continue;
			}
			
			multiplesSum+=i*base;
			
		}
		
		return multiplesSum;
	}
	
	/*numbers: array of numbers to get multiples of
	  limit: number in which we will stop counting multiples*/
	public long getMultiplesSumOf(int[] numbers, int limit){
		
		multiplesSum=0;
		
		for(int i=1; i<limit; i++){       //Cycle through every integet until limit
			
			for(int j : numbers){         //Cycle through the numbers array
				if(j==0){                 //to avoid to divide by 0
					break;
				}
				if(i%j==0){			      //If its divisible by one of the numbers in the array, add it tu multiplesSum and exit loop to avoid repeating
					multiplesSum+=i;
					break;
				}
				
			}
			
		}
		
		return multiplesSum;
	}
	
}

