package commonQuestions;

import java.util.HashMap;
import java.util.Scanner;

public class UniqueMinVal {

	 public static void main(String[] args){
	    Scanner in = new Scanner(System.in);
	    int n=in.nextInt();
	    in.nextLine();
	    
	    int i;
	   // int[] arr = new int[n];
	   HashMap<Integer, Boolean> flags = new HashMap<Integer, Boolean>();
	    
	    for(i=0; i<n; i++) {
	    	//arr[i] = in.nextInt();
	    	int key = in.nextInt();
	    	if(flags.containsKey(key)) {
	    		flags.put(key,true);
	    	} else {
	    		flags.put(key,false);
	    	}
	    }
	    
	    int min = Integer.MAX_VALUE;	    
	    for(int key : flags.keySet()) {
	    	if(key < min && !flags.get(key)) {	
	    		min = key;
	    	}
	    }
	    
	   if(min == Integer.MAX_VALUE) {
		   System.out.println("All duplicates");
	   } else {
		   System.out.println(min);
	   }
	    	
	 }
}
