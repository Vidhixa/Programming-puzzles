package commonQuestions;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Field;
import java.util.HashMap;

public class Vehicle {
	
	public static int lic;
	
	public Vehicle(int lic) {
		this.lic = lic;
	}
	
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		HashMap<Vehicle, Integer> map = new HashMap<Vehicle, Integer>();
		Vehicle a = new Vehicle(123);
		Vehicle b = new Vehicle(234);
		Vehicle c = new Vehicle(432);
		
		map.put(a, 1);
		System.out.println(a.hashCode());
		map.put(b, 2);
		map.put(c, 3);
	
		Vehicle abc = new Vehicle(432);
		System.out.println(abc.hashCode());
		
		System.out.println(map.get(abc));
	}
	
	@Override
	public int hashCode()
	{
		return lic;
	}
	
	@Override
	public boolean equals( Object obj )
	{
		boolean flag = false;
		Vehicle v = ( Vehicle )obj;
		if( v.lic == lic )
			flag = true;
		return flag;
	}

}
