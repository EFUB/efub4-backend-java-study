import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		int[] card = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
		
		int a=0, b=0;
        Scanner s = new Scanner(System.in);
        
        for(int i=0; i<10; i++) {
        	a = s.nextInt();
            b = s.nextInt();
            
            int[] reversec = new int[b-a+1];
            for(int j=0; j<b-a+1;j++) {
            	reversec[j]=card[a-1+j];
            }
            for(int j=0; j<b-a+1;j++) {
            	card[a-1+j]=reversec[b-a-j];
            }
        }

        for(int c : card ) {
        	System.out.print(c+" ");  
        } 
	}
}
