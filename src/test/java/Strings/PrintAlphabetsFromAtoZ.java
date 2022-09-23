package Strings;

public class PrintAlphabetsFromAtoZ {
	public static void main(String[] args) {
//		for (char ch = 'A'; ch < 'Z'; ch++) {
//			System.out.println(ch);
//		}
		char ch='A';
		char ch1='Z';
		while (ch<ch1) {
			System.out.println(ch);
			ch++;
		}
	}

}
