package PracticeRecursion;

public class FirstUpper2 {
	
	public static void main(String[] args) {
		
		String s="i love programming";
		StringBuilder builder =new StringBuilder();
		System.out.println(transform(s,0,builder));
	}
	
	public static String transform(String s, int i,StringBuilder ans) {
		
		if(i==s.length()) {
			return ans.toString();
		}
		
		if(i==0) {
			ans.append(Character.toUpperCase(s.charAt(i)));
			i+=1;
			
		}
		if(s.charAt(i)==' ') {
			ans.append(' ');
			ans.append(Character.toUpperCase(s.charAt(i+1)));
			i=i+1;
		}
		else {
			ans.append(s.charAt(i));
		}
		return transform(s, i+1, ans);
	}

}
