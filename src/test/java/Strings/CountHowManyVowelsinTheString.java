package Strings;

public class CountHowManyVowelsinTheString {
	public static void main(String[] args) {
		String s="testyantra";
		char[] ch = s.toCharArray();
		int count=0;
		for (int i = 0; i < ch.length; i++) {
			//System.out.println(ch[i]);
			if (ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u'||ch[i]=='A'||ch[i]=='E'||ch[i]=='I'||ch[i]=='O'||ch[i]=='U') {
				count++;
			}
		}
		System.out.println( "Given String Contains :- "+count+ " Vowels !");	
	}
}
