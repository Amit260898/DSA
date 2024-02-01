package Recursion;

public class CountZeroes {
	
	public static void main(String[] args) {
		System.out.println(count(102030002,0));
	}
	
	static int count(int num, int c) {
		
		if(num==0) {
			return c;
		}
		if(num%10==0) {
			return count(num/10, c+1);
		}else {
			return count(num/10, c);
		}
		
	}

}
