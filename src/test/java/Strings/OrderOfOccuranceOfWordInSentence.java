package Strings;

public class OrderOfOccuranceOfWordInSentence {
	public static void main(String[] args) {
		String st="welcome to the bangalore";
		String[] s=st.split(" ");
		for (int i = 0; i < s.length; i++) {
			System.out.println(s[i]+" is prsent in "+ (i+1)+" position");
		}
	}

}
