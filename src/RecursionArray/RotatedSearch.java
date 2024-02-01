package RecursionArray;

public class RotatedSearch {
	
	public static void main(String[] args) {
		int[] arr= {5,6,1,2,3,4};
		System.out.println(rotatedSearch(arr,8,0,arr.length-1));
	}
	
	static int rotatedSearch(int[] arr,int target,int start,int end) {
		
		if(start>end) {
			return -1;
		}
		
		int mid=start+(end-start)/2;
		if (arr[mid]==target) {
			return mid;
		}
		if(arr[start]<=arr[mid]) {
			
			if(target>=arr[start] && target<=arr[mid]) {
				return rotatedSearch(arr, target, start, mid-1);
			}else {
				return rotatedSearch(arr, target, mid+1, end);
			}
			
		}
		if(target>=arr[mid] && target<=arr[end]) {
				
				return rotatedSearch(arr, target, mid+1,end );
			}
		return rotatedSearch(arr, target, start, mid-1);
			
	}

}
