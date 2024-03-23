//3. 색종이
import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		char[][] arr = new char[100][100];
		int cnt = sc.nextInt(); //색종이의 수 
		
		//입력 
		for(int i=0; i<cnt; i++){
		    int m = sc.nextInt(); //가로 시작 위치 
		    int n = sc.nextInt(); //세로 시작 위치
		    //색종이 붙이기
		    for(int j=m; j<m+10; j++){
		        for(int k=n; k<n+10; k++){
		            arr[j][k] = 1;
		        }
		    }
		}
		//출력(1인 것만)
		int cnt2 = 0;
		for(int i=0; i<100; i++){
		    for(int j=0; j<100; j++){
		        if(arr[i][j]==1) cnt2++;
		    }
		}
		System.out.println(cnt2);
	}
}
