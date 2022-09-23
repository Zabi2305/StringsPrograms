package Strings;

import java.util.LinkedHashSet;

public class CountUniqueCharacterInAString {
	public static void main(String[] args) {
		String s="Zabiulla";
		LinkedHashSet<Character> lhs = new LinkedHashSet<Character>();
		for (int i = 0; i < s.length(); i++) {
			lhs.add(s.charAt(i));
		}
		for (Character ch : lhs) {
			int count=0;
			for (int i = 0; i < s.length(); i++) {
				if (ch==s.charAt(i)) {
					count++;
				}
			}
			//System.out.println(ch+" "+count);
			if (count==1) {
				System.out.println(ch);
			}
		}	
	}
}
