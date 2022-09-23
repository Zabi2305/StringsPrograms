
package Strings;

import java.util.LinkedHashSet;

public class RemoveDuplicateFromTheGivenString {
	public static void main(String[] args) {
		String s="hello";
		LinkedHashSet<Character> lhs = new LinkedHashSet<Character>();
		for (int i = 0; i < s.length(); i++) {
			lhs.add(s.charAt(i));	
		}
		System.out.println(lhs);
		
//		for (Character cha : lhs) {
//			System.out.print(cha);
//		}
	}
	
}
