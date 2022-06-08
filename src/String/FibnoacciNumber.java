package String;

public class FibnoacciNumber {
	//A SERIES OF NO IN WHICH EACH NO IS SUMM OF THE TWO PRCEDDING NO
	//0+1=1,1+1=2,2+1=3,3+2=5
	public static void main(String[]args) {
		
		int n1=0;
		int n2=1;
		int sum=0;
		
		for(int i=0;i<10;i++) {
			sum=n1+n2;
			System.out.println(sum);
			n1=n2;
			n2=sum;
		}
		
		
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
	}


}
