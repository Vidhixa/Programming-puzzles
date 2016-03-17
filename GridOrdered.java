package commonQuestions;

import java.util.*;


public class GridOrdered {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int i, j, k;
        for(i=0; i<n; i++) {
        	int x = sc.nextInt();
        	char[][] arr = new char[x][x];
        	for(j=0; j<x; j++) {
        		String s = sc.next();
        		char[] sort = s.toCharArray();
        		Arrays.sort(sort);
        		for(k=0; k<x; k++) {
                   // System.out.println(sort[k]);
        			arr[j][k] = sort[k];        			
        		}
        	}   
        	boolean isIncreasing = findIncreasing(arr);
            if(isIncreasing) {
                System.out.println("YES");
            } else {
                System.out.println("NO");            }
        }
        sc.close();
    }

	private static boolean findIncreasing(char[][] a) {
		for(int j=0; j<a.length-1; j++) {
            for(int k=0; k<a[0].length; k++) {    		
    			if(a[j][k] > a[j+1][k]) {
    				return false;
    			}
    		}
    	} 
		return true;
	}
}