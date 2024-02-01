package PracticeRecursion;

import java.awt.Container;



public class LengthOfLastWord {
	
	public static void main(String[] args) {
		System.out.println(findLength("hkrrtbxwkabeihgcdqew"));
	}
	
	public static int findLength(String s) 
    { 
        // code here
		
		return helper(s, 0);

//        int count=0;
//      for(int i=s.length()-1;i>=0;i--){
//          if(s.charAt(i)==' ' && count==0){
//              continue;
//          }
//          if(s.charAt(i)==' ' && count!=0){
//              break;
//          }
//          count++;
//      }
//      return count;
    }
	
	public static int helper(String s, int count) {
		
		if(s.length()==0) {
			return count;
		}
		if(s.charAt(s.length()-1)==' ' && count!=0) {
			return count;
		}
		if(s.charAt(s.length()-1)==' ' && count==0){
			return helper(s.substring(0, s.length()-1), count);
		}else {
		count++;
		return helper(s.substring(0, s.length()-1), count);
		}
	}

}
