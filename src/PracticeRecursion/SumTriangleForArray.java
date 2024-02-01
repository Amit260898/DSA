package PracticeRecursion;

import java.util.ArrayList;
import java.util.List;




public class SumTriangleForArray {
	
	public static void main(String[] args) {
		
		long[] arr= {1,2,3,4,5};
		ArrayList<Long> ans=new ArrayList<>();
		System.out.println(sumTriangle(arr, 5,ans));
	}
	
	public static ArrayList<Long> sumTriangle(long[] arr,int n,ArrayList<Long> ans){
		
		if(n==0) {
			
			return ans;
		}
		
		long[] ar = new long[arr.length - 1];
		for(int i=0;i<n-1;i++) {
			ar[i]=arr[i]+arr[i+1];
		}
		
		sumTriangle(ar, n-1,ans);
		for(int i=0;i<n;i++) {
			ans.add(arr[i]);
		}
		
		return ans;
	}

}
