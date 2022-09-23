package Strings;

import java.util.LinkedHashSet;

public class CountHowManyVowelsinTheStringByRemovingTheDuplicateVowels {
	public static void main(String[] args) {
		String s="testyantra";
		LinkedHashSet<Character> lhs = new LinkedHashSet<Character>();
		for (int i = 0; i < s.length(); i++) {
			lhs.add(s.charAt(i));	
		}
		int count=0;
		for (Character ch: lhs) {
			if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
			{
				count++;	
			}
		}
		System.out.println(s+ " Contains Vowels without repeating  duplicate vowel "+count);
	}
}

