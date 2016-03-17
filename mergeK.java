package commonQuestions;

public class mergeK {
	
	public static void main(String[] args){
		
		/*int[][] arr = {{2, 6, 12, 34},
                {1, 9, 20, 1000},
                {23, 34, 90, 2000}};
		
		mergekarr(arr, arr.length);
		
		String s = "hello     there";
		s = s.replaceAll(" ","");
		System.out.println(s);*/
		
	/*	int n = 10;
		int a = 0;
		int b = 1;
		int c = 0;
		while(n > 2 ){
			
			c = a + b;
			a = b;
			b = c;
			System.out.println(c);
			n--;
		}
		*/
		//int fib = 80;
		//A number is Fiboncci if and only if one or both of (5*n2 + 4) or (5*n2 – 4) is a perfect square
		/*if( isPerfectSquare(5*fib*fib + 4)  || isPerfectSquare(5*fib*fib - 4) ){
			System.out.println("is fib");
		} else {
			System.out.println("is not");
		}*/
		
		//Formula for the Fibonacci numbers: fn = 1/root(5)(phi^n + 1/phi^n)
		/*int n = 2;
		int a = 0;
		int b = 1;
		int c = 0;
		while(true){
			n++;
			c = a + b;
			a = b;
			b = c;
			if(c == 1){
				System.out.println("is fib no : "+ n );
				break;
			}else if(c > 89){
				System.out.println("not fib");
				break;
			} else{
				continue;
			}
			
		}
		

	}
	
	public static boolean isPerfectSquare(int x)
	{
	    int s = (int) Math.sqrt(x);
	    return (s*s == x);
	}
	

	public static void mergekarr(int[][] arr, int k){
		
		int[] finalArr = new int[arr.length*arr[0].length];
		
	}

}
*/
/*
char A = 'a';
char B = 'b';
String s = "aamnma";
for(int i=0; i<s.length(); i++){
	if(s.charAt(i) ==  A){
		s = replaceIt(s, i, A, B);
	}
}
int i = 0;
try{
while(i < s.length()){
	if(s.charAt(i) == A){
		s = delete(s, i);
		System.out.println(i);
		System.out.println(s);
	}
	else{
	i++;
	}
}}catch(Exception e){
	System.out.println(e+"error at"+i);
}
	}
	
	public static String replaceIt(String s, int index, char A, char B){
		
		s = s.substring(0, index)+B+s.substring(index+1);
		//Syso
		System.out.println(s);
		return s;
	}
	
	
	public static String delete(String s, int index){
		
		s = s.substring(0, index)+s.substring(index+1);
		//Syso
		//System.out.println(s);
		//return s;
		return s;
	}
	*/
		
		/*
	int[] a = {1, 2, 3, 1};
	int start = 0;
	int end = a.length;
	if(start < end)	{
		int mid = start + (end-start)/2;
		if(a[mid] > a[mid-1] && a[mid] > a[mid+1]){
			System.out.println(a[mid]);
		}else if(nums[mid] < nums[mid+1])
            return findPeak(nums, mid+1, end);
        else
            return findPeak(nums, start, mid-1);
    }
    return nums[start]
		}
		*/	
		
	}
	}