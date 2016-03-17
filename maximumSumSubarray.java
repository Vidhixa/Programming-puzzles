package commonQuestions;

import java.io.IOException;

public class maximumSumSubarray {
	
	/**/
	
	public static void main(String args[]) throws IOException{
		int[] n = {0,2,-5,1,4,5};
		
		System.out.println(maxSum(n));
	}
	
	public static int maxSum(int[] n){
		
		int maxSoFar = n[0];
		int maxCurrent = n[0];
		
		for(int i=1; i<n.length ; i++){
			maxCurrent = Math.max(maxCurrent + n[i], n[i]);
			maxSoFar = Math.max(maxSoFar, maxCurrent);
		}
		return(maxSoFar);
	}
}
	/*
	public static int maxProduct(int[] A){
		int maxLocal = A[0];  
	    int minLocal = A[0];  
	    int global = A[0];  
	 
	    for(int i=1; i<A.length; i++){  
	        int temp = maxLocal;  
	        maxLocal = Math.max(Math.max(A[i]*maxLocal, A[i]), A[i]*minLocal);  
	        minLocal = Math.min(Math.min(A[i]*temp, A[i]), A[i]*minLocal);  
	        global = Math.max(global, maxLocal);  
	    }  
	    return global;
	
}*/
	
