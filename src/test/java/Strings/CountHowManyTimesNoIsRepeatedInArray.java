package Strings;

import java.util.LinkedHashSet;

public class CountHowManyTimesNoIsRepeatedInArray {
	public static void main(String[] args) {
		int[] a= {4,4,1,2,3,2};
		LinkedHashSet<Integer> lhs = new LinkedHashSet<Integer>();
		for (int i = 0; i < a.length; i++) {
			lhs.add(a[i]);
			//System.out.println(lhs);
		}
		for (Integer num : lhs) {
			int count=0;
			for (int i = 0; i < a.length; i++) {
				if (num==a[i]) {
					count++;
				}
			}
			System.out.println(num+" is repeated "+ count+ " times");
		}
	}
}
