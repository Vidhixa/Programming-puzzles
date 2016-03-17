package commonQuestions;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class TimeConversion {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        boolean isAm = false;
        if(s.substring(s.length()-2).equalsIgnoreCase("AM")) {
            isAm = true;
        }
        String[] strArr = s.substring(0,8).split(":");
        
        if(isAm) {
        	if(Integer.parseInt(strArr[0]) != 12) {
        		System.out.println(s.substring(0, 8));
        	} else {
        		System.out.println("00"+s.substring(2, 8));
        	}
        }  else {
        	if(Integer.parseInt(strArr[0]) == 12) {
        		System.out.println(s.substring(0, 8));
        	} else {
        		System.out.println((12+Integer.parseInt(strArr[0]))+s.substring(2, 8));
        	}
        } 
    }
}