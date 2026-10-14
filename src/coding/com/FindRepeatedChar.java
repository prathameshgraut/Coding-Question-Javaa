package coding.com;

public class FindRepeatedChar {
	public static void main(String[] args) {
		String str ="Prathamesh";
		String res="";
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			int temp=0;
			for(int j =i+1;j<str.length();j++) {
				if(ch==str.charAt(j)) {
					temp++;
					
				}
			}if(temp==1) {
				res=res+ch;
			}
		}
		System.out.print("Repeated Charcter :"+res);
	}
}
