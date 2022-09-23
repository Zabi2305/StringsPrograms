package Arrays;

public class SecondMaximumNumberInanArray {
	public static void main(String[] args) {
		
		int[] a= {10,20,50,80,100};
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if (a[i]<a[j]) {
					int temp= a[i];
					a[i]=a[j];
					a[j]=temp;
				}	
			}
		}
		//System.out.println("First maximum number in array is = "+a[0]);
		System.out.println("Second maximum number in array is ="+a[1]);
	}
}
