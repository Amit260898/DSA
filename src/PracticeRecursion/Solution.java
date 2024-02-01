package PracticeRecursion;

import java.util.ArrayList;
import java.util.List;

class Solution {
	public static void main(String[] args) {
		
		int[] candies = {2,3,5,1,3};
		int extraCandies=3;
		System.out.println(kidsWithCandies(candies, extraCandies));
	}
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

        List<Boolean> list=new ArrayList();
        for(int i=0;i<candies.length;i++){
            int max=candies[i]+extraCandies;
            boolean isPresent=true;
             for(int j=0;j<candies.length;j++){
                 if(i!=j){
                     if(max<candies[j]){
                         list.add(false);
                         isPresent=false;
                         break;
                     }
                 }
             }
             if(isPresent){
                 list.add(true);
             }
        }
        return list;
        
        
    }
}
