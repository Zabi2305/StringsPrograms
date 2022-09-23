package Arrays;
//The sort the array in ascending order and descending order
public class AscendingAndDescendinginSameClass {
	public static void main(String[] args) {
		int[] a = {18,16,14,10,8,4};
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if (a[i]>a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}	
		}
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		
		System.out.println();
		for (int j = a.length-1; j >=0; j--) {
			System.out.println(a[j]);
			
		}
		
	}

}
