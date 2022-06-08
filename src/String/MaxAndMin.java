package String;

public class MaxAndMin {
	public static void main(String[] args) {
		
	
	int ar[]= {4,714,458,154,265,125};
    int max=0;
	int min=ar[0];
    for(int i=0;i<ar.length;i++) {
    	if(ar[i]>max) {
    		max=ar[i];
    	}
    }
    System.out.println(max);
    
    for(int j=0;j<ar.length;j++) {
    	if(ar[j]<min) {
    		min=ar[j];
    	}
    }
    System.out.println(min);
    
    }  
}
