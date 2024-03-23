import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		int num;
		int x,y;
		int area=0;
		Scanner s = new Scanner(System.in);
		num = s.nextInt();
		
		int[][] background = new int[100][100];
		for(int i=0; i<100; i++) {
			for(int j=0; j<100; j++) {
				background[i][j]=0;
			}
		}
		
		for(int k=0; k<num; k++) {
			x = s.nextInt();
			y = s.nextInt();
			for(int i=x; i<x+10; i++) {
				for(int j=y; j<y+10; j++) {
					background[i][j]=1;
				}
			}
		}
		
		for(int i=0; i<100; i++) {
			for(int j=0; j<100; j++) {
				if(background[i][j]==1) {
					area++;
				}
			}
		}
		System.out.print(area);
	}
}
