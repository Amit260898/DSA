package RecursionPatternBubbleSelectionMergeQuick;

import java.util.Arrays;

public class SelectionSortRecursion {
	
	public static void main(String[] args) {
		int[] arr= {1,9,3,2,7};
		selection(arr,0,arr.length-1,0);
		System.out.println(Arrays.toString(arr));
	}
	
	static void selection(int[] arr, int c, int r,int max) {
		if(r==0) {
			return;
		}
		if(c<r) {
			if(arr[c]>arr[max]) {
				selection(arr, c+1, r, c);
			}else {
				selection(arr, c+1, r, max);
			}
			
		}else {
			int temp=arr[max];
			arr[max]=arr[r-1];
			arr[r-1]=temp;
			selection(arr, 0, r-1, 0);
		}
		
		
	}

}
