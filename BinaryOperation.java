package commonQuestions;

import java.io.IOException;
import java.util.ArrayList;

public class BinaryOperation {
	
	public static void main(String args[]) throws IOException{
		int a = 15;
		
		//101
		//1111 1111
		//1100
		int b = 29;
		convertToBinary(a);
		boolean flag = ifDivByThree(a);
		System.out.println(flag);
	}

	private static boolean ifDivByThree(int a) {
		//Neg and pos take care
		int even =  0;
		int odd = 0;
		
		if(a < 0) {
			a = -a;
		}
	    if(a == 0) {
	    	return true;
	    }
	    if(a == 1) {
	    	return false;
	    }
		
		while(a > 1) {
			
			a = a & 1;
			if(a == 1) {
				odd++;
				a = a >> 1;				
			}
			
			a = a & 1;
			if(a == 1) {
				even++;
				a = a >> 1;				
			}
			
		}
	
		return ifDivByThree(Math.abs(even-odd));
	}

	private static void convertToBinary(int a) {
		String s = Integer.toBinaryString(a);
		System.out.println(s);
		int j = Integer.parseInt(s, 2);
		System.out.println(j);
	}
}
