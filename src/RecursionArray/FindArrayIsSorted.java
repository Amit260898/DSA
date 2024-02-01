package RecursionArray;

public class FindArrayIsSorted {
	
	public static void main(String[] args) {
		
		int[] arr= {1,2,7,4,8,9,12};
		System.out.println(sorted(arr,0));
	}
	static boolean sorted(int[] arr, int index) {
		
		if(index==arr.length-1) {
			return true;
		}
		
		return arr[index]<=arr[index+1] && sorted(arr, index+1);
		
//		if(arr[index]<=arr[index+1]) {
//			return sorted(arr,index+1);
//		}
//		return false;
	}

}
