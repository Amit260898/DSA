package RecursionSubsetSubsequenceString;

public class SkipACharacter {
	
	public static void main(String[] args) {
		
	//	skipChar("","baccad");
		System.out.println(skipAppNotAppleRet("baccapplaedda"));
	}
	
	public static void skipChar(String up, String p) {
		
		if(p.length()==0) {
			System.out.println(up);
			return;
		}
		char ch=p.charAt(0);
		if(ch=='a') {
			skipChar(up, p.substring(1));
		}else {
			skipChar(up+ch, p.substring(1));
		}
		
	}
	
public static String skipCharRet(String p) {
		
		if(p.length()==0) {
			
			return "";
		}
		char ch=p.charAt(0);
		if(ch=='a') {
			return skipCharRet(p.substring(1));
		}else {
			return ch+ skipCharRet(p.substring(1));
		}
		
	}

public static String skipStringRet(String p) {
	
	if(p.length()==0) {
		
		return "";
	}
	
	if(p.startsWith("apple")) {
		return skipStringRet(p.substring(5));
	}else {
		return p.charAt(0) +skipStringRet(p.substring(1));
	}
	
}

public static String skipAppNotAppleRet(String p) {
	
	if(p.length()==0) {
		
		return "";
	}
	
	if( p.startsWith("app")&& !p.startsWith("apple")) {
		return skipAppNotAppleRet(p.substring(3));
	}else {
		return p.charAt(0) +skipAppNotAppleRet(p.substring(1));
	}
	
}

}
