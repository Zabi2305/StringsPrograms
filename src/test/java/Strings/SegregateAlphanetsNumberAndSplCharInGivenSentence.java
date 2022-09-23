package Strings;

import java.util.LinkedHashSet;

public class SegregateAlphanetsNumberAndSplCharInGivenSentence {
	public static void main(String[] args) {
		String s="a1b$c2/3&";
		String alpha= " ";
		String num =" ";
		String spl= " ";
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i)>='A'&&s.charAt(i)<='Z'||s.charAt(i)>='a'&&s.charAt(i)<='z') {
				alpha=alpha+s.charAt(i);
			}
			else if (s.charAt(i)>='0'&&s.charAt(i)<='9') {
				num=num+s.charAt(i);
			}
			else {
				spl=spl+s.charAt(i);
			}
		}
		System.out.println("Segregated according to their characters = "+ alpha+num+spl);
		System.out.println("Alphabets are ="+ alpha);
		System.out.println("Numbers are ="+ num);
		System.out.println("Special Characters are ="+ spl);
	}
}
