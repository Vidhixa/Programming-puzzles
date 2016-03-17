package commonQuestions;

public class quickSort {
	
	static int a[] = {1, 3, 7 ,2, 8, 9, 10, 23, 10};
	public static void main(String args[]){
		//int a[] = {1, 3, 7 ,2, 8, 9, 10, 23, 10};
		
		//Sanity check
		if(a.length==0 || a.length==1){
			System.out.println("sorted");
			return;
		}
		quickSort(0, a.length-1);
		
		for(int i=0; i< a.length; i++){
			System.out.print(a[i]+" ");
		}
		//System.out.println();
	}
	
	public static void quickSort(int low, int high){
		int i = low;
		int j = high;
		int pivot = a[low+(high-low)/2];
		
		while(i < j){
			while(a[i] < pivot){
				i++;				
			}
			while(a[j] > pivot){
				j--;				
			}
			
			if(i <= j){
				swap(a, i, j);
				i++;
				j--;
			}
		}
		
		if (low < j){
			quickSort(low, j);
		}
		if (i < high){
			quickSort(i, high);
		}
		
	}
	
	//helper function
	 public static void swap(int[]a, int i, int j) {
		    int temp = a[i];
		    a[i] = a[j];
		    a[j] = temp;
	}

}
