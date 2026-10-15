package coding.com;

public class missingNumArray {

	static void singleMissingNum() {
		int arr[] = {1, 2, 4, 5 ,-1}; // Expected => 3
		int num=0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != i+1) {
				num=i+1;
				break;
			}	
		}
		System.out.println("Missing Number :"+num);
	}
	
	static void multipleMissingNum() {
		int arr[]= {1,5,9,10};  //Expected => 0,2,3,4,6,7,8
		int mulmissing=0;
		int i=0;
		System.out.print("Multiple Missing Number :");
		while(mulmissing<=arr[arr.length-1]) {
			if(arr[i]==mulmissing) {
				i++;
			}else {
				System.out.print(mulmissing+" ");
			}
			mulmissing++;
		}
	}
	
	
	public static void main(String[] args) {
		singleMissingNum();
		multipleMissingNum();
	}
}