package commonQuestions;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class DiagonalArr {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int leftDiag = 0;
        int rightDiag = 0;
        int j,k;
  
        int[][] arr = new int[n][n];
        System.out.println();
        for(j=0; j<n; j++) {
            for(k=0; k<n; k++) {
                int x = sc.nextInt();
                if(j == k) {
                	System.out.println(j+" "+k+" "+x);
                    rightDiag += x;
                } 
                if ((j+k) == (n-1)) {
                	System.out.println(j+" "+k+" "+x);
                    leftDiag += x;
                }  
             }
        }
       
     System.out.println(Math.abs(rightDiag - leftDiag));
     sc.close();
     return;
    }
    
}