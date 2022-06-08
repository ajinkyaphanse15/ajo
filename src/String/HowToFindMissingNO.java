package String;

public class HowToFindMissingNO {
	public static void main(String[]args) {
		
		int ar[]= {1,2,3,4,5,7,8,9,10};
		int sum=0;
		for(int i=0;i<ar.length;i++) {
			sum=sum+ar[i];
					
		}
		System.out.println(sum);
		int sum1=0;
		for(int j=1;j<=10;j++) {
			sum1=sum1+j;
		}
		System.out.println(sum1);
		
		System.out.println("missing no is:"+(sum1-sum));
		
		
		
		
		
		
		
		
		
		
		
	}

}
