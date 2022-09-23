package Strings;

public class RevereseTheWordsInTheReverseSentence {
public static void main(String[] args) {
	String st="welcome to ajmer";
//	//String[] s=str.split(" ");
//	for (int i = str.length()-1; i >=0; i--) {
//		System.out.print(str.charAt(i));
//	}
	String[] s=st.split(" ");
	for (int i = 0; i < s.length; i++) {
		String str=s[i];
		for (int j = str.length()-1; j >=0; j--) {
			System.out.print(str.charAt(j));
		}
		System.out.println(" ");
	}
}
}
