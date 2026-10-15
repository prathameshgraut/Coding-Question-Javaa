package coding.com;

public class FindSecondHigestNumberArray {

	static void m1() {
		int arr[] = { 11, 22, 33, 44, 88, 55, 66, 77, 99 }; // expected Number :- 88
		int slnum = 0, lnum = 0;
		;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > lnum) {
				slnum = lnum;
				lnum = arr[i];
			} else if (arr[i] > slnum) {
				slnum = arr[i];
			}
		}
		System.out.println("M1 Second Largest Number :"+slnum);
	}

	static void m2() {
		int arr[] = { 2, 1, 3, 4, 5, 7, 9 };
		int secondlargestnum = 0, largestnum = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > secondlargestnum) {
				secondlargestnum = largestnum;
				largestnum=arr[i];
			} else if (arr[i] > largestnum) {
				largestnum = arr[i];
			}
		}
		System.out.println("largest Number :" + largestnum);
		System.out.println("M2 Second largest Number :" + secondlargestnum);
	}
	
	
	
	
	static void m3() {
		int arr[]= {1,2,3,4,5,6,7,8,9,10,11,12,13,20};
		int largest=0,secondlargest=0;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>secondlargest) {
				secondlargest=largest;
				largest=arr[i];
			}else if(arr[i]>largest) {
				largest=arr[i];
			}
		}
		System.out.println("M3 Second Largest Number :"+secondlargest);
	}
	

	public static void main(String[] args) {
		m1();
		m2();
		m3();
	}
}
