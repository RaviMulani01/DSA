package recursion;

public class PrintReverseString {

	public static void main(String[] args) {
		String str = "abcd";
		reverseString(str, str.length()-1);
	}

	public static void reverseString(String str, int i) {
		if(i < 0) {
			return ;
		}
		System.out.print(str.charAt(i));
		reverseString(str, i-1);	
	}

}
