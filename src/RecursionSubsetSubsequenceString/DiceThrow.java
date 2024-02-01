package RecursionSubsetSubsequenceString;

import java.util.ArrayList;

public class DiceThrow {
	
	public static void main(String[] args) {
		System.out.println(diceList("", 4,6));
	}
	
	public static void dice(String p,int target) {
		
		if(target==0) {
			System.out.println(p);
			return;
		}
		
		for(int i=1;i<=6 && i<=target;i++) {
			
			dice(p+i, target-i);
		}
	}
	
public static ArrayList<String> diceList(String p,int target,int face) {
		
		if(target==0) {
			ArrayList<String> list=new ArrayList<>();
			list.add(p);
			return list;
		}
		
		ArrayList<String> ans=new ArrayList<>();
		
		for(int i=1;i<=face && i<=target;i++) {
			
			ans.addAll(diceList(p+i,target-i,face));
		}
		return ans;
	}

}
