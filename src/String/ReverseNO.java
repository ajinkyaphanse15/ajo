package String;

public class ReverseNO {
	public static void main(String[]args) {
		
		int no=585466;
		int temp=no;
		int rev = 0,rem=0;
		
		
		while(temp>0) {
			rem=temp%10;
			rev=rev*10+rem;
			temp=temp/10;
		}
		System.out.println(rev);
		}
		
		
		
	

}
