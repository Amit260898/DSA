package RecursionPatternBubbleSelectionMergeQuick;

import java.util.Arrays;

public class Insertion {

	public static void main(String[] args) {
		int[] arr= {4,3,1,9,7};
		insertionSort(arr, arr.length);
		System.out.println(Arrays.toString(arr));
	}
	public static void insertionSort(int arr[], int end)
	  {
	      //code here
	    //   for(int i=0;i<= arr.length-2;i++){
	    //       for(int j=i+1;j>0;j--){
	    //           if(arr[j]<arr[j-1]){
	    //               int temp=arr[j];
	    //               arr[j]=arr[j-1];
	    //               arr[j-1]=temp;
	    //           }else{
	    //               break;
	    //           }
	    //       }
	    //   }
	    if(end<=1){
	        return;
	    }
	    insertionSort(arr,end-1);
	    int last=arr[end-1];
	    int j=end-2;
	    while(j>=0 && arr[j]>last){
	        arr[j+1]=arr[j];
	        j--;
	    }
	    arr[j+1]=last;
	        
	    }
	
	
}
