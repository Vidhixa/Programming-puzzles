package commonQuestions;

import java.util.BitSet;

public class duplicatesInArray {
	
	public static void main(String[] args){
		
		//Simple O(n) approach
		/*int[] a = {1, 2, 1, 4, 5, 2, 7, 8, 4};
		BitSet b = new BitSet();
		for(int i=0; i<a.length; i++){
			if(b.get(a[i]) == true){
				System.out.println(a[i]);
				a[i] = -1;
			}else{ 
				b.set(a[i]);
			}
			
		}
		
		for(int j=0; j<a.length; j++){
			if(a[j] != -1){
				System.out.println(a[j]);
			}			
		}*/
		
		/*//numbers are repeated in range
		int[] x = {1,1,3,5,4};
		for(int i=0; i<x.length; i++){
			x[i] = x[i]*(-1);
		}
		
		int j=0;
		int temp;
		
		for(int i=0; i<x.length; i++){
			if(x[j] < 0){
				if(x[-x[j]-1] > 0){
					System.out.println();
				}
				
				
			}else{
				System.out.println(j+1);
			}
		}*/
		
		//Reverse number
	/*	int i = 89773;
		while(i/10 != 0){
			System.out.println(i%10);
			i = i/10;
		}
		System.out.println(i);
	}*/
		
		//Set intersection and union
		int[] a = {1, 2, 4, 3};
		int[] b = {2, 4, 5, 6};
		BitSet bit = new BitSet();
		
		
		for(int i=0; i<a.length; i++){
			bit.set(a[i]);
		}
		//System.out.println(bit.length());
		
		//intersection
		/*for(int i=0; i<b.length; i++){
			if(bit.get(b[i])){
				System.out.println(b[i]);
			}
		}
		*/
		
		//intersection
		/*for(int i=0; i<b.length; i++){
			bit.set(b[i]);
		}
		
		
		for (int i = 0; i < bit.size(); i++)
		{
		    if (bit.get(i))
		    {
		    	System.out.print(i+" ");
		    }   
		}*/
		
		
		
	
	}
}
