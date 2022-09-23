package Arrays;

public class FirstMaximiumNumberWithoutBubbleSort {
	public static void main(String[] args) {
		int [] a= {5,10,25,15,20};
		int fmax=a[0];
		for (int i = 1; i < a.length; i++) {
			if (fmax<a[i]) {
				fmax=a[i];	
			}	
		}
		System.out.println("The First Maximum number is ="+ fmax);
	}
}
