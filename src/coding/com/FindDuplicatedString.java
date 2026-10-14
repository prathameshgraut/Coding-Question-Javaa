package coding.com;

public class FindDuplicatedString {

	public static void main(String[] args) {
		String str ="sanika";
		
		for(int i=0;i<str.length();i++) {
			char ch =str.charAt(i);
			int temp=0;
			for(int j=i+1;j<str.length();j++) {
				if(ch==str.charAt(j)) {
					temp++;
				}
			}if(temp==1) {
				System.out.print(ch+" ");
			}
		}
	}

}
