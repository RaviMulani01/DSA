package recursion;

public class Print1toN_InArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 5;
		int[] array;
		array = printNos(x);
		
		for(int a: array) {
			System.out.print(a+ " ");
		}
		
	}


    public static int[] printNos(int x) {  
        if(x<1){
            return null;
        }

        int[] array = new int[x];
        int i = 0;
        genrateArr(array,x,i);
        return array;

    }

    public static void genrateArr(int [] array, int x, int idx){
        if(idx<x){
            array[idx] = idx + 1;
            genrateArr(array,x,idx+1);
        }
    }
}
