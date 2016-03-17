package commonQuestions;

import java.util.Arrays;
import java.util.BitSet;
import java.util.HashMap;

public class commonInLists {
	
	public static void main(String[] args) {
		int[] a = {1,2,3};
		int[] b = {2,5,1};
		
		//Three ways to do it
		//O(mn) traverse through two for loops 
		//O(m+n) two traversals and hashmap maintained space O(n)
		//O(m+n) is we sort so additional O(nlogn)
		Arrays.sort(a);
		Arrays.sort(b);
		//mergeSorting(a,b);
		mergeHashing(a,b);
	}
	
	public static void mergeSorting(int[] a,  int[] b) {
		int i=0, j=0, k=0;
		int[] common =  new int[a.length];
		
		while(i<a.length && j<b.length) {
			if(a[i] == b[j]) {
				common[k] = a[i];
				k++;
				i++;
				j++;
			}  else if(a[i] < a[j]) {
				i++;				
			} else {
				j++;
			}
		}
		
		printArr(common, k);
	}
	
	public static void mergeHashing(int[] a,  int[] b) {
		int i=0, j=0, k=0;
		int[] common =  new int[a.length];
		HashMap<Integer, Integer> counts = new HashMap<Integer, Integer>();
		
		//Populating the map
		for(i=0; i<a.length; i++) {
			if(counts.containsKey(a[i])) {
				counts.put(a[i], counts.get(a[i])+1);				
			} else {
				counts.put(a[i], 1);	
			}
		}
		
		//Finding the commons
		for(j=0; j<b.length; j++) {
			if(counts.containsKey(b[j])) {
				int getval = counts.get(b[j]);
				if(getval > 0) {
					counts.put(b[j], getval-1);
					common[k] = b[j];
					k++;
				} else {
					counts.put(b[j], getval);
				}
			}
		}
		
		printArr(common, k);
	}
	
	public static void printArr(int[] array, int size){
		for(int k=0; k<size; k++){
			System.out.println(array[k]);
		}
	}

}
