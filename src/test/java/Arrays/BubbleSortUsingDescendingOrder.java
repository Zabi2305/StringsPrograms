package Arrays;
// Arrange the array in the Descending order
public class BubbleSortUsingDescendingOrder {
	public static void main(String[] args) {
		int[] a= {110,25,20,78,54,99};
		for (int i = 0; i < a.length-1; i++) {
			for (int j = 0; j < a.length-1; j++) {
				if (a[j]<a[j+1]) {
					int temp= a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
		
		
		
		// Another method is the simplest
//		int[] b= {25,20,35,30,10};
//		for (int i = 0; i < b.length; i++) {
//			for (int j = i+1; j < b.length; j++) {
//				if (b[i]>b[j]) {
//					int temp=b[i];
//					b[i]=b[j];
//					b[j]=temp;	
//				}	
//			}
//			System.out.print(b[i]);
//			
//		}
		
		
		
		
		
		
	}
}
