package recursion;

public class FindOccurence {
	public static int first = -1;
	public static int last = -1;
	
	public static void main(String[] args) {
		String str = "aabcaanmnrava";
		findoccurence(str, 0 , 'a');
	}
	
	//find first and last occurence of char at given string
	public static void findoccurence(String str, int i, char c) {
		if(i == str.length()) {
			System.out.println("First Occurance of " + c + " at Index: " + first);
			System.out.println("Last Occurance of " + c + " at Index: " + last);
			return;
		}
		
		if(str.charAt(i) == c) {
			if(first == -1) {
				first = i;
			}
			else {
				last = i;
			}
		}
		
		findoccurence(str, i+1 , c);
		
	}

}
