package RecursionSubsetSubsequenceString;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Subset {
	
	public static void main(String[] args) {
		
		int[] arr={1,2,3};
		List<List<Integer>> res=subsetIteration(arr);
				for(List<Integer> ans:res) {
					System.out.println(ans);
				}
	}
	
	static List<List<Integer>> subsetIteration(int[] arr){
		
		List<List<Integer>> outer=new ArrayList<>();
		outer.add(new ArrayList<>());
		
		for(int num:arr) {
			int size=outer.size();
			for(int i=0;i<size;i++) {
				List<Integer> inner=new ArrayList<>(outer.get(i));
				inner.add(num);
				outer.add(inner);
			}
			
		}
		return outer;
	}

}
