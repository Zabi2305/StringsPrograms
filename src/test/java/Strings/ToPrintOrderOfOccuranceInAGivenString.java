package Strings;

import java.util.Scanner;

public class ToPrintOrderOfOccuranceInAGivenString {
	public static void main(String[] args) {
		//String s="Zabiulla";
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String str = sc.next();
		for (int i = 0; i < str.length(); i++) {
			System.out.println(str.charAt(i)+" is in position "+(i+1));
		}
	}
}
