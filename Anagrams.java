package commonQuestions;

import java.util.*;

public class Anagrams {

   static boolean isAnagram(String A, String B) {
       A = A.toLowerCase();
       B = B.toLowerCase();
       if(A.length() != B.length()) {
           return false;
       } else {
           int[] arr = new int[128];
           for(int i=0; i<A.length() ; i++) {
               arr[A.charAt(i)] += 1;
               arr[B.charAt(i)] -= 1;
           }
           
           for(int i=0; i<arr.length ; i++) {
               if(arr[i] > 0 || arr[i] < 0) {
                   return false;
               }
           }
           return true;
       }
      
   }
    
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        boolean ret=isAnagram(A,B);
        if(ret)System.out.println("Anagrams");
        else System.out.println("Not Anagrams");
        
    }
}
