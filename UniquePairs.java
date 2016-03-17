package commonQuestions;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class UniquePairs {
	
	public static void main(String[] args) {
		
		ArrayList<pairs> list = new ArrayList<pairs>();
		pairs p1 = new pairs("Tom", "Hanks");
		pairs p2 = new pairs("Tom", "Cruise");
		pairs p3 = new pairs("Tom", "Hanks");
		pairs p4 = new pairs("Sid", "Hanks");
		list.add(p1);
		list.add(p2);
		list.add(p3);
		list.add(p4);
		
		findNumberPairs(list);
		
	}

	private static void findNumberPairs(ArrayList<pairs> list) {
		Set<pairs> set = new HashSet<pairs>();
		int count = 0;
		
		for(pairs p : list) {
			if(set.contains(p)) {
				System.out.println(count);
			} else {
				++count;
				System.out.println(count);
			}
		}
		
	}
	

}

class pairs {
	String first;
	String last; 
	
	public pairs(String f, String l) {
		this.first = f;
		this.last = l;
	}
	
	 @Override
	    public int hashCode() {
		 System.out.println(this.first+" "+this.first.hashCode()+this.last+" "+this.last.hashCode());
	        return this.first.hashCode()+this.last.hashCode();
	        		/*new HashCodeBuilder(17, 31). // two randomly chosen prime numbers
	            // if deriving: appendSuper(super.hashCode()).
	            append(name). (this.first*17+this.last*31);
	            append(age).
	            toHashCode();*/
	    }

	    @Override
	    public boolean equals(Object obj) {
	       if (!(obj instanceof pairs))
	            return false;
	        if (obj == this)
	            return true;

	        pairs p = (pairs) obj;
	        return ((p.first.equalsIgnoreCase(this.first) && p.last.equalsIgnoreCase(this.last)) || 
	        		(p.first.equalsIgnoreCase(this.last) && p.last.equalsIgnoreCase(this.first)));
	    }
	
}
