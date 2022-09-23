package revision;

import java.util.Iterator;

public class Arrays {
	public static void main(String[] args) {
		//Swap b/w 2 numbers without 3rd variable
		int a=2;
		int b=4;
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After Swapping a="+a);
		System.out.println("After Swapping b="+b);
		System.out.println("==============================================================================");
		//Swap b/w 2 numbers with 3rd variable
		int c=10;
		int d=20;
		int temp=c;
		c=d;
		d=temp;
		System.out.println("After Swapping c="+c);
		System.out.println("After Swapping d="+d);
		System.out.println("==============================================================================");
		//Arrange the array in ascending order
		int[] aa= {10,5,25,15,20};
		for (int i = 0; i < aa.length; i++) {
			for (int j = i+1; j < aa.length; j++) {
				if (aa[i]>aa[j]) {
					int temp1=aa[i];
					aa[i]=aa[j];
					aa[j]=temp;	
				}
			}	
		}
		for (int i = 0; i < aa.length; i++) {
			//System.out.print("The Number after sorting in Ascending order");
			System.out.println( aa[i]+" ");
		}
		System.out.println("==============================================================================");

		//Another method of sorting in ascending order
		int[] ab= {6,8,4,2};
		for (int i = 0; i < ab.length-1; i++) {
			for (int j = 0; j < ab.length-1; j++) {
				if (ab[j]>ab[j+1]) {
					int temp2= ab[j];
					ab[j]=ab[j+1];
					ab[j+1]=temp2;	
				}	
			}
		}
		for (int i = 0; i < ab.length; i++) {
			System.out.println(ab[i]+" ");
		}
		System.out.println("==============================================================================");
		//Arrange the array in ascending order
		int[] ac= {2,4,8,6,10};
		for (int i = 0; i < ac.length; i++) {
			for (int j = i+1; j < ac.length; j++) {
				if (ac[i]<ac[j]) {
					int temp3=ac[i];
					ac[i]=ac[j];
					ac[j]=temp3;
				}
			}
		}

		for (int i = 0; i < ac.length; i++) {
			System.out.println(ac[i]+" ");	
		}
		System.out.println("==============================================================================");

		//First and Second minimum no in an Array
		int[] ad= {10,8,6,5,2};
		for (int i = 0; i < ad.length; i++) {
			for (int j = i+1; j < ad.length; j++) {
				if (ad[i]>ad[j]) {
					int temp4=ad[i];
					ad[i]=ad[j];
					ad[j]=temp4;
				}
			}
		}
		System.out.println("The First Smallest no in the given array is ="+ad[0]);
		System.out.println("The Second Smallest no in the given array is ="+ad[1]);
		System.out.println("==============================================================================");

		//First and Second maximum no in an Array
		int[] ae= {10,8,6,5,2};
		for (int i = 0; i < ae.length; i++) {
			for (int j = i+1; j < ae.length; j++) {
				if (ae[i]<ae[j]) {
					int temp5=ae[i];
					ae[i]=ae[j];
					ae[j]=temp5;
				}
			}
		}
		System.out.println("The First Maximum no in the given array is ="+ae[0]);
		System.out.println("The Second Maximum no in the given array is ="+ae[1]);
		System.out.println("==============================================================================");

		//Sum of First 3 minimum no in a Array
		int[] af= {8,4,10,6,2};
		for (int i = 0; i < af.length; i++) {
			for (int j = i+1; j < af.length; j++) {
				if (af[i]>af[j]) {
					int temp6=af[i];
					af[i]=af[j];
					af[j]=temp6;
				}	
			}
		}
		int sum=0;
		for (int i = 0; i <3; i++) {
			sum=sum+af[i];
		}
		System.out.println("The sum of first 3 minimum no is ="+sum);
		System.out.println("==============================================================================");

		int sum1=0;
		for (int i = af.length-1; i>af.length-4; i--) {
			sum1=sum1+af[i];
		}
		System.out.println("The sum of last 3 maximum no is ="+sum1);
		System.out.println("==============================================================================");
		
		// First minimum no without using sort
		int[] ag= {8,4,10,2,6};
		int fmin=ag[0];
		for (int i = 1; i < ag.length; i++) {
			if (fmin>ag[i]) {
				fmin=ag[i];
			}	
		}
		System.out.println("The Smallest no in the given array is ="+fmin);
		System.out.println("==============================================================================");
		

		// First maximum no without using sort
		int[] ah= {8,4,10,2,6};
		int fmax=ag[0];
		for (int i = 1; i < ag.length; i++) {
			if (fmax<ag[i]) {
				fmax=ag[i];
			}	
		}
		System.out.println("The maximum no in the given array is ="+fmax);
		System.out.println("==============================================================================");
		
		//Add two different array
		int[] ai= {2,3,2,7,1};
		int[] aj= {1,4,6,2};
		int length=ai.length;
		if (ai.length<aj.length) {
			length=aj.length;
		}
	for (int i = 0; i < aj.length; i++) {
		try {
			System.out.println(ai[i]+aj[i]);	
		} catch (Exception e) {
			if (ai.length>aj.length) {
			System.out.println(aj[i]);	
			}
			else {
				System.out.println(ai[i]);
			}
		}
	}
	System.out.println("==============================================================================");
	
		
	}
}
