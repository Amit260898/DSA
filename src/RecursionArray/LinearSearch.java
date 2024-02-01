package RecursionArray;

import java.util.ArrayList;

public class LinearSearch {
	
	public static void main(String[] args) {
		
		int[] arr= {1,3,5,7,18,6,7};
		System.out.println(lsearch(arr,19,0,new ArrayList<>()));
	}
	
	static ArrayList<Integer> lsearch(int[] arr,int target, int index,ArrayList<Integer> list) {
		if(arr[index]==target) {
			  list.add(index);
		}
		if(index==arr.length-1) {
			return list;
		}
		return lsearch(arr, target, index+1,list);
	}

}
