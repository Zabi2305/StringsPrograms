package Strings;

import java.util.LinkedHashSet;

public class CountNumberOfCharctersInAString {
	public static void main(String[] args) {
		String s="hello";
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
			System.out.println(ch +" character has repeated:- "+count+"times");
		}
		System.out.println("The number of characters in the given string is ="+ s.length());
	}
}
