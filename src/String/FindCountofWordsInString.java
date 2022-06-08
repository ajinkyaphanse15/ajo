package String;

public class FindCountofWordsInString {
	public static void main(String[]args) {
		//how to find how many words are present in string
		
		String a="public static void main(String[]args)";
		int count=1;
		
		for(int i=0; i<a.length();i++) {
		   if(a.charAt(i)==' ' && a.charAt(i+1)!=' ' ){
			   count++;
		   }
			
		}
	    System.out.println("THE TOTAL COUNT OF WORDS IS THIS STRING IS:"+ count);
		
		
		
		
		
		
		
		
		
	}

}
