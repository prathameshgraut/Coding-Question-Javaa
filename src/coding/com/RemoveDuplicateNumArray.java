package coding.com;

import java.util.Arrays;

public class RemoveDuplicateNumArray {
	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6, 2, 3, 5, 7, 8, 9, 10 }; // expected ans => 2 3 5
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			int temp = 0;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					temp++;
				}
			}
			if (temp != 1) {
				// print actual number
//				System.out.print(arr[i] + " ");
				count++;
			}
		}

		int store[] = new int[count];
		int s = 0;
		for (int i = 0; i < arr.length; i++) {
			int temp = 0;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					temp++;
				}
			}
			if (temp != 1) {
				// print actual number
				store[s] = arr[i];
				s++;
			}
			
		}
		System.out.println(Arrays.toString(store));
	}
}
