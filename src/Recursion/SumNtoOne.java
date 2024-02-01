package Recursion;

public class SumNtoOne {
	
	public static void main(String[] args) {
		System.out.println(sumRec(5));
	}
	
	static int sumRec(int n) {
		if(n==1) {
			return 1;
		}
		return n+sumRec(n-1);
	}

}
