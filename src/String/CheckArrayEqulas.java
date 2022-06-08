package String;

import java.util.Arrays;

public class CheckArrayEqulas {
	public static void main(String[]args) {
		
		int a[]= {1,2,3,4,5,6};
		int b[]= {1,2,3,4,5,6};
		
//		boolean status = Arrays.equals(a, b);
//		
//		if(status==true) {
//			System.out.println("array are equals");
//		}else
//		{
//		System.out.println("array not equals");
//		}
		
		
		//approch2
		boolean status = true;
		if(a.length==b.length) {
			for(int i=0;i<a.length;i++) {
				if(a[i]!=b[i]) {
				 status = false;
				}
			}
		}
			else {
				status=false;
			}
		
		if(status==true) {
			System.out.println("array equal");
		}
		else {
			System.out.println("nt equal");
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
