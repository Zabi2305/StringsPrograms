package group1;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class NumOfOcceranceOfNumber {

	public static void main(String[] args) {
		int a[]= {1,2,2,3,4,5,6,6};

		HashSet<Integer> hs = new HashSet<Integer>();
		for (int i = 0; i < a.length; i++) 
		{
			hs.add(a[i]);
		}
		System.out.println(hs);
		for (Integer no : hs) 
		{
			int count=0;
			for(int i=0;i<a.length;i++)
			{
				if(no.equals(a[i]))
				{
					count++;
				}
			}
			System.out.println(no+" ="+ count);
		}
	}	
}
