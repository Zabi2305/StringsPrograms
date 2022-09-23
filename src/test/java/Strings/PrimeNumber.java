package Strings;

public class PrimeNumber {
	public static void main(String[] args) {
		int n=10;
		int i=2;
		int count=0;
		while (i<=n/2) {
			if (n%i==0) {
				count++;
			}
			i++;
		}
		if (count==0) {
			System.out.println("Given no is  prime");
		}
		else {
			System.out.println("Given no is not a  prime");
		}
	}
}
