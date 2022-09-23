package Strings;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class PrintOrderOfOccuranceOfEachCharacterWothOutDuplicate {
	public static void main(String[] args) {
// string str="hello";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String str = sc.next();
		LinkedHashSet<Character> lhs = new LinkedHashSet<Character>();
		for (int i = 0; i < str.length(); i++) {
			lhs.add(str.charAt(i));
		}
		for (Character ch : lhs) {
			for (int i = 0; i < str.length(); i++) {
				if (ch==str.charAt(i)) {
					System.out.println(ch +" is in " + (i+1)+ "position");
					break;
				}
			}
		}
	}
}
