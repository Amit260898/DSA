package Recursion;

public class Reverse {
	
	public static void main(String[] args) {
		System.out.println(reverseRec(12847));
	}

	static int reverse(int num) {
		
		int rev=0;
		int rem=0;
		while(num>0) {
			rem=num%10;
			num=num/10;
			rev=rev*10+rem;
			
		}
		return rev;
		
	}
	
	static int reverseRec(int n) {
		
		int digits=(int)(Math.log10(n))+1;
		return helper(n,digits);
	}
	
	static int helper(int n,int digits) {
		
		if(n%10==n) {
			return n;
		}
		int rem=n%10;
		return rem*(int)(Math.pow(10, digits-1))+helper(n/10, digits-1);
	}
}
