package Recursion;

public class NtoOne {
	
	public static void main(String[] args) {
		int n=5;
		//fun(n);
		fun2(n);
	}
	
	static void fun(int n) {
		
		if(n==0) {
			return;
		}
		System.out.println(n);
		fun(n-1);
	}
	
	static void fun2(int n) {
		if(n==0) {
			return;
		}
		fun2(n-1);
		System.out.println(n);
	}

}
