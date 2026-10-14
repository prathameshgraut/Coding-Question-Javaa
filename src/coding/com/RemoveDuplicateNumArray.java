package coding.com;

public class RemoveDuplicateNumArray {
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6,2,3,5,7,8,9,10};  //expected ans => 2 3 5
		
		int num=0;
		
		for(int i=0;i<arr.length;i++) {
			int temp=0;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					temp++;
				}
			}if(temp!=1) {
				System.out.print(arr[i]+" ");
			}else if(temp==1){
				num=arr[i];
			}
		}
		System.out.print(num);
	}
}
