package commonQuestions;

import java.util.Arrays;

public class kthLargest {
	
	public static void main(String[] args){
		
		int[] a = {2,1,8,7,4};
		int k = 2;
		
		if(k < 1 || a == null){
			System.out.println("No solution");
			return;	
			
		}
		else{
		int ans = findKth(a,k,0,a.length-1);
		System.out.println(ans);
		
		}
		
	}
	
	private static int findKth(int[] a, int k, int i, int j) {
		
		int left = i;
		int right = j;
		//Little different
		int pivot = a[right];
		
		while(true){
			
			while(a[left] < pivot && left < right){
				left++;				
			}
			//System.out.println(left);
			
			while(a[right] > pivot && left < right){
				right--;
			}
			//System.out.println(right);
			
			//Pivot at right place
			//We stop then
			if(left == right){
				break;
			}
			
			swap(a, left, right);
			System.out.println(Arrays.toString(a));
			
		}
		System.out.println(Arrays.toString(a));
		swap(a, left, j);
		
		System.out.println(left+" "+a[left]);
		if (k == left+1) {
			return pivot;
		} else if (k < left + 1) {
			return findKth(a, k, i, left - 1);
		} else {
			return findKth(a, k, left + 1, j);
		}		
		
	}
	
	public static void swap(int[] arr, int a, int b){
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
		
	}

}
