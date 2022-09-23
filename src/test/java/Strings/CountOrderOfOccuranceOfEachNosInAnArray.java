package Strings;

import java.util.LinkedHashSet;

public class CountOrderOfOccuranceOfEachNosInAnArray {
	public static void main(String[] args) {
		// Need to this Program not done
		int[] a= {4,1,1,2,3,2};
		LinkedHashSet<Integer> lhs = new LinkedHashSet<Integer>();
		for (int i = 0; i < a.length; i++) {
			lhs.add(a[i]);
		}
		for (Integer num : lhs) {
			int count=0;
			for (int i = 0; i < a.length; i++) {
				if (num==a[i]) {
					count++;
				}
			}
			if (count==1) {
				System.out.println(num + " is present "+ count+" times");
			}
			
		}
	}

}
