package commonQuestions;

public class medianOf2 {
	
	public static void main(String[] args){
		
		int[] a1 = {0,1,2};
		int[] a2 = {2,3,4};
		
		
		int mid1 = (a1.length + a2.length) / 2;
		
		if((a1.length + a2.length) % 2 == 1){			
			int mOdd = findMedian(a1, a2, mid1);	
		
		} else {
			double mEven = (double)(findMedian(a1, a2, mid1) + findMedian(a1, a2, mid1-1))/2.0;
			
		}
		
	}

	private static int findMedian(int[] a1, int[] a2, int mid) {
		
		int i = 0 ;
		int j = 0;
		int count, med = -1;
	    
	    for(count = 0; count<=mid; count++){
	    	
	    	if(a1[i] > a2[j]){
	    		med = a1[i];
	    		i++;
	    		
	    	} else {
	    		med = a2[j];
	    		j++;		
	    		
	    	}
	    }
		return med;
	    	
	    	
	}

}
