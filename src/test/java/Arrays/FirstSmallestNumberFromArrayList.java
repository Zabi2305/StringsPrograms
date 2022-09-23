package Arrays;
// First Minimum number in the Array
public class FirstSmallestNumberFromArrayList {
	public static void main(String[] args) {
		int[] a= {15,5,25,24,78,};
		for (int i = 0; i < a.length-1; i++) {
			for (int j = 0; j < a.length-1; j++) {
				if (a[j]>a[j+1]) {
					int temp= a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
			
		}
		System.out.println(a[0]); 	//first minimum number
		System.out.println(a[1]);	//second minimum number
	}

}
