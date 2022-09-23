package Arrays;

public class FirstAndSecondMinimumWithOutUsingBubbleSort {
	public static void main(String[] args) {
		int[] a= {10,5,3,25,20};	
		int fmin=0;
		int smin=0;
		for (int i = 0; i < a.length; i++) 
		{
			if (a[i]<=fmin) 
			{
				if (a[i]!=fmin) 
				{
					smin=fmin;
				}
				fmin=a[i];
			}
			
			else if (fmin==smin || smin>=a[i]) 
			{
				smin=a[i];	
			}
		}

		System.out.println(fmin);
		System.out.println(smin);
	}
}
