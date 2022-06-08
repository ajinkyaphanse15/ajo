package String;

public class ArmstrongNO {
	
	public static void main(String[]args) {
		
	//length or digit noo find
		
		
		int t1=153;
		int length=0;
		
		while(t1!=0) {
			t1=t1/10;
			length=length+1;
			
		}
        
		int t2=153;
		int rem;
		int mull=1;
		int arm=0;
		while(t2!=0) {
			rem=t2%10;
			for(int i=1;i<=length;i++) {
				mull=mull*rem;
			}
			arm=arm+mull;
	     	t2=t2%10;
		}
		if(arm==t1) {
			System.out.println("this is armstrong no");
		}
		else {
			System.out.println("this is not a armstrong");
		}
		
		
		
		
		
		
		
		
		
		
	}

}
