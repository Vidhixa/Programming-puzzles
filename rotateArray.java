package commonQuestions;

public class rotateArray {
	
	public static void main(String[] args){

		int[] a = {0,4,5,7};		
		int min = rotateHelper(a);
		System.out.println(min);
	
	}

	private static int rotateHelper(int[] a) {		
		if(a.length < 1 || a == null ){
			return -1;			
		}else {
			return rotateMin(a, 0, a.length-1);			
		}
	
	}

	private static int rotateMin(int[] a, int left, int right) {
		/*  
		//One element
		if (left == right)
			return a[left];
		
		//Two elements
		if ((right - left) == 1)
			return Math.min(a[left], a[right]);
		
		int mid = (left + right)/2;

	
		if(a[left] < a[mid]){
			return rotateMin(a, mid+1, right);			
		}else {
			return rotateMin(a, left, mid);
		}*/
		if (left == right)
			return a[left];
		if ((right - left) == 1)
			return Math.min(a[left], a[right]);
	 
		int middle = left + (right - left) / 2;
	 
		// not rotated
		if (a[left] < a[right]) {
			return a[left];
	 
		// go right side
		} else if (a[middle] > a[left]) {
			return rotateMin(a, middle, right);
	 
		// go left side
		} else {
			return rotateMin(a, left, middle);
		}
	}

}
