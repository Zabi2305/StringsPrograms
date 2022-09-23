package Arrays;

import java.util.concurrent.ForkJoinPool;
// Arrange the arrange in Ascending order
public class BubbleSortingInAscendingOrder {
	public static void main(String[] args) {
		int [] a= {10,50,90,5,12,45};
		for (int i = 0; i < a.length-1; i++) {
			for (int j = 0; j < a.length-1; j++) {
				if (a[j]>a[j+1]){
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}	
			}
		}
		
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
		
		
//		//Another method of Swapping  this is simple one
//		int[] b= {6,0,1,2};
//		for (int i = 0; i < b.length; i++) {
		//i=0 ,0<4, true =6
		
//			for (int j = i+1; j < b.length; j++) {
			//j=0+1 , 1<4, true =0
		
//				if (b[i]>b[j]) {
//					//Swap using 3rd Variable 
//					int temp=b[i];
//					b[i]=b[j];
//					b[j]=temp;	
//				}
//			}
//			System.out.print(b[i]);	
//		}

	}
}


