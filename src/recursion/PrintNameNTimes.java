package recursion;

public class PrintNameNTimes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printNtimes(3);
	}
	public static void printNtimes(int n){
        // Write your code here.
        if(n == 0){
            return;
        }
        System.out.print("Hello Java" + " ");
        printNtimes(n-1);
    }

}
