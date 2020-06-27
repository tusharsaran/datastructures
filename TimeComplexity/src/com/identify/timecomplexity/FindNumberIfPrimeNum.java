package com.identify.timecomplexity;

/* in this program the time complexity is 
T(∞) or T(n) =   O(1) + (O(√n) * O(1) * O(1)) + O(1)
			 => technique remove the constant
T(∞) or T(n) =>  (O(√n)
*/
public class FindNumberIfPrimeNum {

	public static void main(String[] args) {
		int num = 27;
		boolean isPrime = findIfPrime(num); 
		System.out.println("is number " + num + " a prime number : " + isPrime);

	}
	
	private static boolean findIfPrime(int num) {
		boolean isPrime = true;                     //-------------------------------------------- O(1) 
		for(int i = 2; i < Math.sqrt(num) ;i++) { //-------O(n) ----------------------------------------- O(√n) * O(1) * O(1)
			if(num % i == 0) //---------------------O(1)
				isPrime = false; //---------------- O(1)
		}
		return isPrime; //-------------------------------------------------------------------------O(1)
	}

}
