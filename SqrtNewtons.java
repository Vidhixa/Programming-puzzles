package commonQuestions;

import java.util.ArrayList;

public class SqrtNewtons {
	

	public static void main(String[] args) {		
		int n = 5;
		//int result = sqrtNewtons(n, 0, 1+(n/2));
		//System.out.println(result);
	/*	int low = 0;
		int high = n;
		while(low+1 < high) {
			int mid = low + (high-low)/2;			
			if(mid*mid == n) {
				System.out.println(mid);
				break;
				//return mid;
			} else if(mid*mid > n) {
				high = mid;			
			} else  {
				low = mid;
			}
		}	
		
		System.out.println(low);*/
	}

	public static int sqrtNewtons(int n, int low, int high) {	
		if(low == high || (low+1) == high) {
			System.out.println(low);
			return low;
		}
		int mid = low + (high-low)/2;
		
		if(mid*mid == n) {
			System.out.println(mid);
			return mid;
		} else if(mid*mid > n) {
			return sqrtNewtons(n, low, mid);			
		} else {
			return sqrtNewtons(n, mid, high);
		}
		
	}

}
