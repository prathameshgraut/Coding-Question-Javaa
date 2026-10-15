package coding.com;

import java.util.Arrays;

public class MergeArray {
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5};
		int srr[]= {6,7,8,9,10};
		int temp[]= new int[arr.length+srr.length];
		
		for(int i=0;i<arr.length;i++) {
			temp[i]=arr[i];
		}
		for(int j=0;j<srr.length;j++) {
			temp[arr.length+j]=srr[j];
		}
		System.out.println("Arr 1       :"+Arrays.toString(arr));
		System.out.println("Srr 2       :"+Arrays.toString(srr));
		System.out.println("Merge Array :"+Arrays.toString(temp));
	}
}
