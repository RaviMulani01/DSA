package hasing;

import java.util.HashMap;

public class CountChInString {

	public static void main(String[] args) {
	
		
		HashMap<Character,Integer> hm = new HashMap<Character, Integer>();
		
		String s = "jaava";
		
		for(int i = 0; i < s.length(); i++) {
			
			Integer count = hm.get(s.charAt(i));
			
			if(hm.get(s.charAt(i)) == null) {
				hm.put(s.charAt(i), 1);
			}
			else {
				hm.put(s.charAt(i), ++count);
			}
		}
		
		System.out.println(hm);

	}

}
