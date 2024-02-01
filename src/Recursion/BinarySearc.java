package Recursion;


public class BinarySearc {
	
	public static void main(String[] args) {
		int[] arr= {1,3,7,9,11};
	 // int present= bin(9,arr);
	  //System.out.println(present);
	  System.out.println(binRec(9,arr,0,arr.length-1));
	  
	}
	
	static int bin(int n,int[] arr) {
		int start=0;
		int end=arr.length-1;
		while(start<=end) {
			int mid=start+(end-start)/2;
			if(arr[mid]==n) {
				return mid;
			}else if (arr[mid]<n) {
				start=mid+1;
			}else {
				end=mid-1;
			}
		}
		return -1;
	}
	
	static int binRec(int n, int[] arr, int start, int end ) {
		
		if(start>end) {
			return -1;
		}
		int mid=start+(end-start)/2;
		if(arr[mid]==n) {
			return mid;
		}else if(arr[mid]<n) {
			return binRec(n, arr, mid+1, end);
		}else {
		
		return binRec(n, arr, start, mid-1);
		}
	}

}
