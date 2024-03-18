//3. 대표값2
import java.util.Scanner;
import java.util.Arrays;

public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] num = new int[5];
		for(int i=0; i<5; i++){
		    num[i] = sc.nextInt();
		}
		
		//평균 계산
	    int sum=0; 
	    for(int j : num){
	        sum += j;
	    }
	    int avg = sum/5;
		
		//중앙값 계산
		Arrays.sort(num);
		int med = num[2];
		
		//결과 출력 
		 System.out.println(avg);
		 System.out.println(med);
	}
}
