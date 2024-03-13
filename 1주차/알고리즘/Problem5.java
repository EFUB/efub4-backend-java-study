import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int n, k;
		int c = 0;
		Scanner s = new Scanner(System.in);
		n = s.nextInt();
		k = s.nextInt();
		
		int[] coin = new int[n];
		for(int i=0; i<n; i++) {
			coin[i]=s.nextInt();
		}
		for(int i=n; i>0; i--) {
			c += k/coin[i-1];
			k = k-(coin[i-1]*(k/coin[i-1]));
		}
		System.out.print(c);
	}
}