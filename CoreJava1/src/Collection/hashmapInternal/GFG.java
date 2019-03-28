package Collection.hashmapInternal;

import java.util.HashMap;

public class GFG {
	
	public static void main(String[] args) {
		
		HashMap map = new HashMap<>();
		map.put(new Key("vishal"), 20);
		map.put(new Key("sachin"), 30);
		map.put(new Key("vishal"), 40);
		
		System.out.println();
		System.out.println("vishal key :"+map.get(new Key("vishal")));
	}

}
