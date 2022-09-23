package numberTheoryPrograms;

public class NeonNumber {
	public static void main(String[] args) {
		//Number where the sum of digits of a square of the number is equal to the number

		int n=9;
		int sum=0;
		int sqr=n*n;

		while(sqr>0) {
			int rem=sqr%10;
			sum=sum+rem;
			sqr=sqr/10;	
		}
		if(sum==n) {
			System.out.println("It is a Neon Number");
		}
		else {
			System.out.println("It is not a Neon Number");
		}
	}	
}

