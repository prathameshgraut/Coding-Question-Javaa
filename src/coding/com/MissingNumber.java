package coding.com;

public class MissingNumber {

	static void singleMissNum() {
		int arr[]= {1,2,4,5};        //Single Missing num = 3
		int miss=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=i+1) {
				miss=i+1;
				break;
			}
		}
		System.out.println("Single Missing Number :"+miss);
	}
	
	static void multipleMissingNum() {
		int arr[]= {1,5,9,10};       //Multiple Missing num = 2,3,4,6,7,8
		int miss=0;
		int i=0;
		while(miss<arr[arr.length-1]) {
			if(arr[i]==miss) {
				i++;
			}else {
				System.out.print(miss+" ");
			}
			miss++;
		}
	}
	
	public static void main(String[] args) {
		singleMissNum();
		multipleMissingNum();
	}

}
