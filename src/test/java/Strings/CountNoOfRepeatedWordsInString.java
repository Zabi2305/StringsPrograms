package Strings;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class CountNoOfRepeatedWordsInString {
	public static void main(String[] args) {
		String st="welcome to to bangalore city";
		String[] s = st.split(" ");
		LinkedHashSet<Object> lhs = new LinkedHashSet<Object>();
		for (int i = 0; i < s.length; i++) {
			lhs.add(s[i]);
		}
		for (Object obj : lhs) {
			int count=0;
			for (int j = 0; j < s.length; j++) {
				if (obj.equals(s[j])) {
					count++;
				}
			}
			System.out.println(obj +" word has repeated = "+ count +"  times");
		}
	}
}
