package Arrays;

import java.util.LinkedHashSet;
import java.util.TreeSet;

public class FirstMinimumNumberwithoutUsingBubbleSort {
	public static void main(String[] args) {
		int[] a= {10,25,5,15};
		int fmin=a[0];
		for (int i = 1; i < a.length; i++) {
			if (fmin>a[i]) {
				fmin=a[i];
			}
		}
		System.out.println("First Minimum Numberis = "+fmin);
	}
}
