package Recursion;

public class Factorial {
	
	public static void main(String[] args) {
		//product(5);
		System.out.println(factRec(5));
		
	}
	
	static int factRec(int n) {
		
		if(n<=1) {
			return 1;
		}
		return n*fact(n-1);
	}
	
	
	
	static int fact(int n) {
		
		int fac=1;
		while(n>0) {
			fac=fac*n;
			n--;
		}
		return fac;
	}

}
