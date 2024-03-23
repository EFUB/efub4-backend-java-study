import java.util.*;

public class Main
{
	public static void main(String[] args) {
		
		int[][] array = new int[100][100];
		 for (int i = 0; i < 100; i++){
            Arrays.fill(array[i], 0);
		 }
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int area =0;
		
		for(int k =0; k<n; k++){
		    
		    int a = sc.nextInt();
		    int b = sc.nextInt();
		    
		    for(int i =b; i< (b+10); i++){
		        for(int j = a; j<(a+10); j++){
		           if(array[i][j] !=1){
		               array[i][j] = 1;
		           }
		        }
		    }
		}
		
		
		for(int i =0; i<100; i++){
		    for(int j =0; j<100; j++){
		        if(array[i][j] == 1){
		            area++;
		        }
		    }
		}
		
		System.out.print(area);

		
	}
}
