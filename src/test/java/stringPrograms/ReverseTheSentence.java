package stringPrograms;

import java.util.Iterator;

public class ReverseTheSentence {
	public static void main(String[] args) {
		String s="ALL IS WELL";
		String[] str= s.split(" ");
		for (int i =str.length-1; i >= 0; i--) {
			System.out.print(str[i]+" ");
		}
	}
}
