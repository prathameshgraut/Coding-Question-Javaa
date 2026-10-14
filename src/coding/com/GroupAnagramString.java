package coding.com;

public class GroupAnagramString {
	
	public static void main(String[] args) {
		String str ="pune";
		
		for(int i =0;i<str.length();i++) {
			for(int j=0;j<str.length();j++) {
				for(int k=0;k<str.length();k++) {
					for(int l=0;l<str.length();l++) {
						if(str.charAt(i) != str.charAt(j) && 
						   str.charAt(i) != str.charAt(k) && 
						   str.charAt(i) != str.charAt(l) && 
						   str.charAt(l) != str.charAt(j) && 
						   str.charAt(l) != str.charAt(k) &&
						   str.charAt(j) != str.charAt(k)) {
							
							System.out.println(""+str.charAt(i)+str.charAt(j)+str.charAt(k)+str.charAt(l));
						}
					}
				}
			}
		}
	}
	
}
