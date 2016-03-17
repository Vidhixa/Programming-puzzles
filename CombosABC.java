package commonQuestions;

public class CombosABC {
	
	public static void main(String[] args) {
		String s = "ABC";
		permutate(s, 0, s.length()-1);		
	}
	
	private static void permutate(String s, int left, int right) {
		if(left == right) {
			System.out.println(s);
		} else {
			for(int i=left; i<right; ) {
				
			}
			
		}		
	}

	public static String swap(String s, int i, int j) {
		s = s.replace(s.charAt(i), s.charAt(j));
		return s;
	}

}
