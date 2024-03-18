//5. 동전 0
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), k = sc.nextInt();
		int[] arr = new int[n];
		
		for(int i=0; i<n; i++){
		    arr[i] = sc.nextInt();
		}
		
		int count = 0;
		for(int i=n-1; i>=0; i--){
		    //동전 가치가 높은 순서대로
		    count += k/arr[i];
		    k %= arr[i];
		}
		System.out.println(count);
	}
}
