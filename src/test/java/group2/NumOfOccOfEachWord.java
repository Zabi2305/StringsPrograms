package group2;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class NumOfOccOfEachWord {

	public static void main(String[] args) {
    String s ="WELCOME TO INDIA TO MANDYA";
		String[] str = s.split(" ");
		//step1:-  To store each word of sentence inn set
		HashSet<String> set = new HashSet<String>();	
		
		for(int i=0; i<str.length; i++)
		{
			set.add(str[i]);
		}
		//compare each word of sentence with String array
		for (String word : set) 
		{
			int count=0;
			
			for (int i = 0; i < str.length; i++)
			{
				if (word.equals(str[i]))
				{
					count ++;
				}
			}
			System.out.println(word+" "+count);
		}
	}
}

