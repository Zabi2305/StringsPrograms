package group1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.TreeSet;

public class PrintOnlyDuplicateInString {

	public static void main(String[] args) {

		String s ="KALPANA";

		//LinkedList<Character> set= new LinkedList<Character>();
		LinkedHashSet<Character> set = new LinkedHashSet<Character>();
		//ArrayList<Character> set = new ArrayList<Character>();
		//HashSet<Character> set = new HashSet<Character>();
		//TreeSet<Character> set = new TreeSet<Character>();
		//HashSet<Character> set = new HashSet<Character>();

		// To add the characters in the linkedHashset 
		for(int i=0; i<s.length(); i++)
		{
			set.add(s.charAt(i));
		}

		for (Character ch : set) 
		{
			int count=0;
			for (int i = 0; i < s.length(); i++)
			{
				if (ch==s.charAt(i))
				{
					count ++;
				}

			}
			// if (count>1) is an another method to print duplicate character
			if(count>=2){
				System.out.println(ch+" "+count);
			}
		}
	}
}


