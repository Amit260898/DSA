package PracticeRecursion;

public class MinMax {
	public static void main(String[] args) {
		long[] a= {7,9,2,11,1};
		getMinMax(a, 5);
	}

	    static void getMinMax(long a[], long n)  
	    {

	    	if(a.length==1) {
	    		System.out.println(a[0]);
	    		return;
	    	}
	       long min=a[0];
	        long max=a[0]; 
	        helper(a,n,min,max);
	        //Write your code here
	    }
	    static void helper(long a[], long n,long min, long max){
	    
	        if(n==0){
	            System.out.println(min);
	            System.out.println(max);
	            return;
	        }
	        
	        if(min>a[(int) n-1]){
	            min=a[(int) n-1];
	        }
	        if(max<a[(int) n-1]){
	            max=a[(int) n-1];
	        }
	        helper(a,n-1,min,max);
	    }
	
}
