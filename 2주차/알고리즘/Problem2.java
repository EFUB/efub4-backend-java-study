import java.util.*;

public class Main
{
	public static void main(String[] args) {
		
		char[][] array = new char[5][15];
		
		Scanner sc = new Scanner(System.in);
		
		for(int i =0; i< 5; i++){
		     String s = sc.next();
		    for(int j =0; j < s.length(); j++){
		        array[i][j] = s.charAt(j);
		    }
		}
		
		for(int j =0; j<15; j++){
		    for(int i =0; i<5; i++){
		        if(array[i][j] == ' ' || array[i][j] =='\0') continue;
		        else System.out.print(array[i][j]);
		       
		    }
		}
		
	}
}
