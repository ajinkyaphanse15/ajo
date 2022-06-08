package String;

public class Reverse {
	public static void main(String[] args) {
		//how to reverse a String
		String a="ajinkya";
		String rev="";
		
		for(int i=a.length()-1;i>=0;i--) {
			rev=rev+a.charAt(i);
		}
	System.out.println(rev);
		
		
	}

}
