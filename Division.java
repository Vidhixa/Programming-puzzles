package commonQuestions;

import java.util.ArrayList;

public class Division {
	
	public static void main(String[] args) {
			
		/*float f = 3.4569288f;
		String s = String.format("%.2f", f);
		System.out.println(Float.parseFloat(s));*/
		
		int num = 1920;
		int div = 10;
		division(num, div);
			
		}

	private static void division(int num, int div) {
		int q = 0;
		int rem = 0;
		while(true) {
			num = num - div;
			if(num == 0) {
				q = q+1;
				break;
			} else if(num < 0) {
				rem = rem + num + div;
				break;
			} else {
				q = q+1;
			}
			
		}
		System.out.println(q);
		System.out.println(rem);
		
	}


}
