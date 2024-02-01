package RecursionSubsetSubsequenceString;

import java.util.ArrayList;
import java.util.List;

class LetterCombinationPhone {
	
	public static void main(String[] args) {
		
		System.out.println(letterCombinations("23"));
	}
    public static List<String> letterCombinations(String digits) {
        
        if(digits.isEmpty()){
            ArrayList<String> list=new ArrayList();
            return list;
        }
        String p="";
        String up=digits;
       List<String>res=  helper(p,up);
        return res;
    }

    public static List<String> helper(String p,String up){

        if(up.isEmpty()){
            ArrayList<String> list=new ArrayList();
            list.add(p);
            return list;
        }
        ArrayList<String> ans=new ArrayList();

        int digit=up.charAt(0) -'0';
        int i=(digit-2)*3;
        int len=i+3;
        if(digit>7){
            i+=1;
        }
        

        if(digit==7 || digit==9){
            len+=1;
        }
        for(;i<len;i++){
            char ch=(char)('a'+i);
            ans.addAll(helper(p+ch,up.substring(1)));
        }

        return ans;

    }

}