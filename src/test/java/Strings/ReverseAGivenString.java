package Strings;

public class ReverseAGivenString {
	public static void main(String[] args) {
		// 1) Using toCharArray
		String s="bangalore";
			char[] ch = s.toCharArray();
		for (int i = s.length()-1; i >= 0; i--) {
			System.out.println(ch[i]);
		}
		
		// type :-2
//		String s="Bangalore";
//		for (int i = s.length()-1; i>=0; i--) {
//			System.out.println(s.charAt(i));
//		}
		

		// type :-3
//		String s="Bangalore";
//		String s1=" ";
//		for (int i = s.length()-1; i >=0; i--) {
//		s1=s1+s.charAt(i);	
//		}
//		System.out.println(s1);
		
		String str= "banaga";
		char[] st = str.toCharArray();
		int count=0;
		for (char c : st) {
			count ++;
			
		}
		for (int i = count-1; i >=0; i--) {
			System.out.print(st[i]);
		}
		
		System.out.println();
		String s1="dolly";
		StringBuffer str1 = new StringBuffer(s1);
		str1.reverse();
		System.out.println(str1);
	}
}
