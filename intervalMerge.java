package commonQuestions;

import java.util.ArrayList;
import java.util.Stack;

public class intervalMerge {
	
	public static void main(String[] args){
		
		interval i1 = new interval(2, 6);
		interval i2 = new interval(3, 6);
		interval i3 = new interval(6, 8);
		
		/*boolean b = overlaps(i1, i2);
		System.out.println(b);
		b = overlaps(i1,  i3);
		System.out.println(b);
		b = overlaps(i3, i2);
		System.out.println(b);*/
		
		ArrayList<interval> arr = new ArrayList<interval>();
		arr.add(i1);
		arr.add(i2);
		arr.add(i3);
		merge(arr);
	}
	
	public static boolean overlaps(interval i1,interval i2){
		
		if((i1.start <= i2.start && i2.start < i1.end) || (i2.start <= i1.start && i1.start < i2.end)){
			return true;
		}
		
		return false;		
	}

	public static void merge(ArrayList<interval> arr){
		
		Stack<interval> stk = new Stack<interval>();
		
		for(interval i : arr){
			if(stk.isEmpty()){
				stk.push(i);	
				
			} else {
				if(overlaps(i,stk.peek())){
					interval top = stk.pop();
					interval n = new interval(Math.min(i.start, top.start), Math.max(i.end,  top.end));
					stk.push(n);
					
				} else {
					stk.push(i);
				}
				
			}
			
			
		}
		
		while(!stk.empty()){
			
			interval i = stk.pop();
			System.out.println(i.start+" "+i.end);
			
		}
		
	}
}

class interval{
	
	int start;
	int end;
	
	interval(int s, int e){
		this.start = s;
		this.end = e;		
	}
}
