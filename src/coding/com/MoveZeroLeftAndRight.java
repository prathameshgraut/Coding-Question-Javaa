package coding.com;

import java.util.Arrays;

public class MoveZeroLeftAndRight {

	static void movezeroleft(){
		//All Zero stored in Starting
		int arr[]= {1,2,0,9,7,0,5,0,3,0,6};   //expected o/p => [0,0,0,0,1,2,9,7,5,3,6]
		int a=arr.length-1;
		for(int i=arr.length-1;i>=0;i--) {
			if(arr[i]!=0) {
				arr[a]=arr[i];
				a--;
			}
		}while(a>=0) {
			arr[a]=0;
			a--;
		}
		System.out.println("Left Zero  :"+Arrays.toString(arr));
	}
	
	
	
	static void movezeroright() {
		int arr[]= {1,2,0,9,7,0,5,0,3,0,6};
		int a=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=0) {
				arr[a]=arr[i];
				a++;
			}
		}while(a<arr.length) {
			arr[a]=0;
			a++;
		}
		System.out.println("Right Zero :"+Arrays.toString(arr));
	}
	
	
	public static void main(String[] args) {
		movezeroleft();
		movezeroright();

	}

}
