package RecursionPatternBubbleSelectionMergeQuick;

import java.util.Arrays;

public class MergeSort {
	
	public static void main(String[] args) {
		
		int[] arr= {3,5,9,19,12};
		sort(arr, 0, arr.length-1);
		System.out.println(Arrays.toString(arr));
	}
	
	static void sort(int[] arr, int start, int end) {
		
		if(end-start==0) {
			return;
		}
		int mid=start+(end-start)/2;
		sort(arr, start, mid);
		sort(arr, mid+1, end);
		
		mergeSortRec(arr,start,mid,end);
	}
	
	static void mergeSortRec(int[] arr,int start, int mid, int end) {
		
		int i=start;
		int j=mid+1;
		int k=0;
		int[] mix=new int[end-start+1];
		
		while(i<=mid && j<=end) {
			if(arr[i]<=arr[j]) {
				mix[k]=arr[i];
				i++;
			}else {
				mix[k]=arr[j];
				j++;
			}
			k++;
		}
		while(i<=mid) {
			mix[k]=arr[i];
			i++;
			k++;
		}
		while(j<=end) {
			mix[k]=arr[j];
			j++;
			k++;
		}
		for(int l=0;l<mix.length;l++) {
			arr[start+l]=mix[l];
		}
	}

	}
