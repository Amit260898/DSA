package PracticeRecursion;

import java.util.Arrays;

public class FirstUpperCase {
	
	public static void main(String[] args) {
		
		System.out.println(transform("i love programming"));
	}
	 public static String transform(String s)
	    {
	        // code here
	        char[] ch=s.toCharArray();
	        //int n=ch.length();
	        
	        helper(ch,0);
	        String str=Arrays.toString(ch);
	        return str;
	        
	    }
	    public static void helper(char[] ch, int n){
	        if(n==ch.length){
	            
	            return;
	        }
	        
	        if(n==0){
	            ch[0]=Character.toUpperCase(ch[0]);
	            
	        }
	        if(ch[n]==' '){
	            
	            ch[n+1]=Character.toUpperCase(ch[n+1]);
	        }
	        helper(ch,n+1);
	        
	    }
}
