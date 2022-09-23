package Arrays;
//Second Minimum number in the Array
public class SecondSmallestNumberfromArray {
	public static void main(String[] args) {
		int[] a= {10,5,4,3,2,8};
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if (a[i]>a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}	
			}
		}
		System.out.print("Secong Smallest number in an Array = " + a[1]);
	}

}
