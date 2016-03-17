package commonQuestions;

public class mergeSort {
	
	public static void main(String args[]){
		int a[] = {1, 3, 7 ,2, 8, 9, 10, 23, 10};
		mergeSort(a, 0, a.length-1);
		
	}
	
	public static void mergeSort(int a[], int l, int h){
		int[] b = new int[10];
		if(l < h){
			int mid = l+(h-l)/2;
			mergeSort(a, l, mid);
			mergeSort(a, mid+1, h);
			b = merge(a, l, mid, h);
		}
		for(int i=0; i< b.length; i++){
			System.out.print(b[i]+" ");
		}
		System.out.println();
		
	}
	
	public static int[] merge(int[] a, int l, int mid, int h){
		int i, j, k;
		int n1 = mid-l+1;
		int n2 = h-mid-1;
		int[] left = new int[n1];
		int[] right = new int[n2];
		
		//Copying the array
		for(i=0; i<n1; i++){
			left[i] = a[l+i];
		}
		
		for(j=0; j<n2; j++){
			right[j] = a[j+mid+1];
		}
		
		i = 0;
		j = 0;
		k = l;
		//Renew older array on sorted manner
		while(i<n1 && j<n2){
			if(left[i] <= right[j]){
				a[k] = left[i];	
				i++;
			}else{
				a[k] = right[j];
				j++;				
			}
			k++;			
		}
		
		//Remaining copy
		while(i < n1){
			a[k] = left[i];
			i++;
			k++;			
		}
		
		while(j < n2){
			a[k] = right[j];
			j++;
			k++;			
		}
		return a;

	}

}
