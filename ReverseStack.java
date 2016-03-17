package commonQuestions;

import java.util.Stack;

public class ReverseStack {
	
	public static void main(String[] args){
		
		Stack s = new Stack();
		s.push(1);
		s.push(2);
		s.push(3);
		/*while(!s.isEmpty()){
			System.out.println(s.pop());
		}
		System.out.println("--------------------------");
		*/
		
		reverse(s);
		while(!s.isEmpty()){
			System.out.println(s.pop());
		}
		//System.out.println();
	}
	
	public static void reverse(Stack s){
		
		if(!s.isEmpty()){
			int temp = (Integer) s.pop();
			reverse(s);
			insertAtBottom(s, temp);
		}
		
	}
	
	public static void insertAtBottom(Stack s, int item){
		int temp;
		if(s.isEmpty()){
			s.push(item);
		}else{
			temp = (Integer) s.pop();
			insertAtBottom(s, item);
			s.push(temp);
		}
	}
	

}
