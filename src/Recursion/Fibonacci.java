package Recursion;

public class Fibonacci {
	
	public static void main(String[] args) {
		
		int ans=fiboR(4);
		fibo(5);
		System.out.println(ans);
		String name="Amit is a , Sumit is a good";
		System.out.println(name.replace("is a", "was a"));
	}
	
	
	static void fibo(int n) {
		int a=0;
		int b=1;
		int temp;
		int sum;
		System.out.println(a);
		for(int i=0;i<n;i++) {
			sum=a+b;
			temp=a;
			a=sum;
			b=temp;
			
			System.out.println(sum);
		}	

	}
	
	static int fiboR(int n) {
		
		if (n<2) {
			return n;
		}

		return fiboR(n-1)+fiboR(n-2);
	}

}
