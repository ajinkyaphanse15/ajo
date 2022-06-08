package String;

public class PrimeNO {
	public static void main(String[] args) {
		//first we declare one no which want to check that no is prime or not
		int a=17;
		int temp=0;
		
		//here we use for loop
		for(int i=2;i<a;i++) {
			if(a%i==0) {
				temp=temp+1;
			}
		}
		if(temp==0) {
			System.out.println("this is  a prime no");
		}else {
			System.out.println("this is prime not prime");
		}
		
		
		
		
		
		
		
	}

}
