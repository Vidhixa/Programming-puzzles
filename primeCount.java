package commonQuestions;

import java.util.ArrayList;

public class primeCount {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> primes = giveNPrimes(10);
		//printArray(primes);
		primes = givePrimesTillN(3);
		//printArray(primes);
	}

	private static ArrayList<Integer> givePrimesTillN(int n) {
		if(n <= 1) {
			return null;
		}
		ArrayList<Integer> primes = new ArrayList<Integer>();
		boolean[] isPrime = new boolean[n+1];
		
		//Make the array all true
		//Make 0, 1 as false  as primes start from 2
		for(int i=2; i<n+1; i++)  {
			isPrime[i] = true;
		}
		
		for(int i=2; i<Math.sqrt(n); i++) {
				if(isPrime[i]) {
					for(int j=i+i; j<n; j=(j+i)) {
						isPrime[j] = false;
				}
			}
		}
		
		for(int k=0; k<isPrime.length; k++) {
			if(isPrime[k] == true) {
				primes.add(k);
			}			
		}
		return primes;
	}

	private static void printArray(ArrayList<Integer> primes) {
		for(int i : primes){
			System.out.print(i+" ");
		}	
		System.out.println();
	}

	private static ArrayList<Integer> giveNPrimes(int n) {
		ArrayList<Integer> primes = new ArrayList<Integer>();
		if(n <= 0) {
			return null;
		}
		
		primes.add(2);
		--n;
		
		for(int i=3; i<Integer.MAX_VALUE && n>0; i++) {
			boolean isPrime = true;
			for(int j : primes) {
				if(i % j ==  0){
					isPrime = false;
				}
			}
			if(isPrime) {
				primes.add(i);
				--n;
			}			
		}
		return primes;
	}

}
