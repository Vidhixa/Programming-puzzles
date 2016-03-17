package commonQuestions;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class LeftRightSum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i,j;
        for(i=0; i<n; i++){
            int k = sc.nextInt();
            int[] arr = new int[k];
            for(j=0; j<k; j++) {
                arr[j] = sc.nextInt();                
            }
            if(arr.length < 3) {
                System.out.println("NO");
            } else {
                boolean isSum = findLeftRight(arr);
                if(isSum) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }   
              }
           }
        return;
    }
    

	public static boolean findLeftRight(int[] arr) {
        int sumAll = 0, i;
        for(i=0; i<arr.length; i++) {
            sumAll += arr[i];
        }
        
        int sumLeft=0, sumRight=0;
        for(i=1; i<arr.length-1; i++){
            sumLeft += arr[i-1];
            sumRight = sumAll - sumLeft - arr[i];
            if(sumLeft == sumRight){
                return true;
            }
        }
        
        return false;
    }
}