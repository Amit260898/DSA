package RecursionArray;

import java.util.ArrayList;

public class ReturnListWithoutPassingInArgument {

	public static void main(String[] args) {
		int[] arr= {1,3,5,7,18,6,7};
		System.out.println(lsearch(arr, 7, 0));
	}
	
	static ArrayList<Integer> lsearch(int[] arr,int target, int index) {
		ArrayList<Integer> list=new ArrayList<>();
		if(arr[index]==target) {
			  list.add(index);
		}
		if(index==arr.length-1) {
			return list;
		}
		 ArrayList<Integer> answerFromBelowCalls= lsearch(arr, target, index+1);
		 list.addAll(answerFromBelowCalls);
		 return list;
	}
}
