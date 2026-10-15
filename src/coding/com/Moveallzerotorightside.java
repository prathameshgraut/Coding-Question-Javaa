package coding.com;

import java.util.Arrays;

public class Moveallzerotorightside {

	static void m1() {
		int arr[] = { 1, 0, 2, 3, 4, 0, 5, 0, 0, 6, 7, 0, 8, 9 }; // Excpected o/p => [1,2,3,4,5,6,7,8,9,0,0,0,0,0]
		int a = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0) {
				arr[a] = arr[i];
				a++;
			}
		}
		while (a < arr.length) {
			arr[a] = 0;
			a++;
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	static void m2() {
		int arr[] = { 1, 0, 2, 3, 4, 0, 5, 0, 0, 6, 7, 0, 8, 9 }; // Excpected o/p => [0,0,0,0,0,1,2,3,4,5,6,7,8,9]
		int a = arr.length - 1;
		
		for(int i=arr.length-1;i>=0;i--) {
			if(arr[i]!=0) {
				arr[a]=arr[i];
				a--;
			}
		}while(a>=0) {
			arr[a]=0;
			a--;
		}
		System.out.println("\n"+Arrays.toString(arr));

	}

	public static void main(String[] args) {
		m1();
		m2();
	}

}
