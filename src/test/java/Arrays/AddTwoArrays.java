package Arrays;

public class AddTwoArrays {
	public static void main(String[] args) {
		int[] a= {1,4,5,2,7};
		int[] b= {2,4,1,0};
		int length=a.length;
		if (a.length<b.length) {
			length=b.length;			
		}
		for (int i = 0; i <length; i++) {

			try {
				System.out.println(a[i]+b[i]);
			} catch (Exception e) {
				if (a.length<b.length) {
					System.out.println(b[i]);
				}
				else {
					System.out.println(a[i]);
				}
			}
		}
	}
}

















////int[] c= {};
//		System.out.println(a.length);
//		System.out.println(b.length);
//		//System.out.println(c.length);
//		int[] c=new int[a.length];
//	
//		for (int i = 0; i < a.length; i++) {
//			try {
//			c[i]=a[i]+b[i];
//		}
//			catch (Exception e) {
//				// TODO: handle exception
//				System.out.println(a[i]);
//			}
//	}
//		for (int j = 0; j < c.length; j++) {
//			System.out.println(c[j]);
//		}