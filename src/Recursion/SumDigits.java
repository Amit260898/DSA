package Recursion;

public class SumDigits {
	
	public static void main(String[] args) {
		System.out.println(sumDigitRec(12345));
	}

	static int sumDigits(int num) {
		int temp=0;
		int rem;
		while(num>0) {
			rem=num%10;
			num=num/10;
			temp=temp+rem;
		}
		return temp;
	}
	
	static int sumDigitRec(int num) {
		
		if(num==0) {
			return 0;
		}
		
		return (num%10)+sumDigitRec(num/10);
	}
}
