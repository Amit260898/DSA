package Recursion;

public class Palindrome {
	
	public static void main(String[] args) {
		
		System.out.println(palinRec(11211));
		
	}
	
	static boolean palin(int n) {
		int rev=0;
		int rem=0;
		int temp=n;
		while(n>0) {
			rem=n%10;
			rev=rev*10+rem;
			n=n/10;
		}
		return rev==temp;
	}
	
	static boolean palinRec(int n) {
		
		return n==reverse(n);
	}
	
	static int reverse(int n) {
		
		int digits=(int)(Math.log10(n))+1;
		
		return helper(n,digits);
	}
	
	static int helper(int n, int digits) {
		
		if(n%10==n) {
			return n;
		}
		int rem=n%10;
		
		return rem*(int)(Math.pow(10, digits-1))+helper(n/10, digits-1);
				
				
	}

}
