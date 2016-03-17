package commonQuestions;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Queue;
import java.util.Stack;

import javax.swing.text.AbstractDocument.LeafElement;

public class PhoneCombo {

	public static HashMap<Integer, String> phonemap;
	
	public static void main(String[] args) {
		phonemap = new HashMap<Integer, String>();
		
		phonemap.put(2, "abc");
		phonemap.put(3, "def");
		phonemap.put(4, "ghi");
		phonemap.put(5, "jkl");
		phonemap.put(6, "mno");
		phonemap.put(7, "pqrs");
		phonemap.put(8, "tuv");
		phonemap.put(9, "xyz");
		
		printPoss("43");
	}

	private static void printPoss(String s) {
		if(s == null || s == "1" || s == "0")  {
			System.out.println("Invalid on phone");
		} else {
				ArrayList<Character> combo = new ArrayList<Character>();
				findPossCombo(s, 0, combo);
			}			
		}

	private static void findPossCombo(String s, int  index, ArrayList<Character> combo) {
		if(index == s.length()){
			for(char c : combo) {
				System.out.print(c+" ");
			}
			System.out.println();
			return;
		}
		
		String value = phonemap.get(s.charAt(index)-'0');
		for(int i=0; i<value.length(); i++) {
			combo.add(value.charAt(i));
			findPossCombo(s, index+1, combo);
			combo.remove(combo.size()-1);
		}
			
			 
	}

}
