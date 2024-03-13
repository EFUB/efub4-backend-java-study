import java.util.Scanner;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		int a = 0;
		int[] b = new int[10];
		
		Scanner s = new Scanner(System.in);
		a = s.nextInt();
		
		int v = 0;
		while(a>0) {
			b[v] = a%10;
			a = a/10;
			v++;
		}
		int[] bq = new int[v];
		for(int i=0; i<v; i++) {
			bq[i]=b[i];
		}
		Arrays.sort(bq);
		for(int i=v-1; i>=0; i--) {
			System.out.print(bq[i]);
		}
	}
}