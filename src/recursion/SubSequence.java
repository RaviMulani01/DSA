package recursion;

public class SubSequence {
	
	public static void findAllSubSequence(String str, int index, String newstr) {
		if(index == str.length()) {
			System.out.println(newstr);
			return;
		}
		char currentchar = str.charAt(index);
		
		//to be
		findAllSubSequence(str, index+1, newstr + currentchar);
		
		//not
		findAllSubSequence(str, index+1, newstr);
	}

	public static void main(String[] args) {
		String str = "abc";
		findAllSubSequence(str, 0, "");
	}

}
