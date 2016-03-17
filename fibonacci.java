package commonQuestions;

import java.util.Random;

public class fibonacci {
	
	public static void main(String args[]){
		//int f = findFib(9);
		//System.out.println(f);
		
		Random rand = new Random();
		
		for(int i=0; i<50; i++){
			int index = rand.nextInt(52)+1;
			if(index == 0){
				System.out.println("it is 0");
			}
			if(index > 52){
				System.out.println("it is greater than 52");
			}
			System.out.println(index);
		}
		
	}
	
	static int findFib(int n){
		if(n == 1 || n == 0 || n == 2){
			return 1;			
		}
		return (findFib(n-1)+findFib(n-2));
		
	}
	
}
