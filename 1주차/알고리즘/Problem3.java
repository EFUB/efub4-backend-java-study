import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int a=0, sum=0;
		int[] num = new int[5];
		Scanner s = new Scanner(System.in);
		
		for(int i=0; i<5; i++) {
			a = s.nextInt();
			for(int j=0; j<=i; j++) {
				if(a<num[j]) {
					for(int k=i; k>j; k--) {
						num[k]=num[k-1];
					}
					num[j]=a;
					break;
				}
				if(j==i) {
					num[j]=a;
				}
			}
		}
		for(int d:num) {
			sum+=d;
		}
		System.out.println(sum/5);
		System.out.println(num[2]);
	}
}
