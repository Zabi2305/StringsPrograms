package Arrays;

public class FirstAndSecondMaximumNumberWithoutSort {
public static void main(String[] args) {
	int[] a= {10,5,3,25,20};
	int fmax=0;
	int smax=0;
	for (int i = 0; i < a.length; i++) {
		if (a[i]>fmax) {
			smax=fmax;
			fmax=a[i];
		}
		else if (a[i]>smax) {
		smax=a[i];	
		}
	}
	System.out.println("First minimum number in an array "+fmax);
	System.out.println("Second minimum number in an array "+ smax);	
}
}
