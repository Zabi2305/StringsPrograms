package Strings;

public class ReverseTheSentence {
	public static void main(String[] args) {
		String str="Welcome To Bangalore";
		String[] s = str.split(" ");
		for (int i = s.length-1; i >=0; i--) {
			System.out.println(s[i]);	
		}
	}
}
