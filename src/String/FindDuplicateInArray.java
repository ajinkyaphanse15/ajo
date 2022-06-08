package String;

public class FindDuplicateInArray {
	public static void main(String[] args) {
		
		String ar[]= {"java","C","C++","PHYTHON","java","C"};
		boolean flag=false;
		
		
		for(int i=0;i<ar.length;i++) {
			for(int j=i+1;j<ar.length;j++) {
				if(ar[i]==ar[j]) {
					System.out.println("THIS IS DUPLICATE ELEMENT IN THIS ARRAY:"+ar[i]);
					flag=true;
				}
			}
		}
		
		if(flag==false) {
			System.out.println("NO DUPLICATE ELEMENT FOUND");
		}
		
		
		
		
		
		
	}

}
