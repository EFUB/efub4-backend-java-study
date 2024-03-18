import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		int a = 0, b = 0;
		char []ss = new char[3];
		Scanner s = new Scanner(System.in);
		
		for (int i=0; i<3; i++) {
			for(int j=0; j<4; j++) {
				a = s.nextInt();
				if(a == 0) {
					b++;
				}
			}
			switch(b) {
			case 0:
				ss[i]='E';
				break;
			case 1:
				ss[i]='A';
				break;
			case 2:
				ss[i]='B';
				break;
			case 3:
				ss[i]='C';
				break;
			case 4:
				ss[i]='D';
				break;
			}
			b = 0;
		}
		for(char c : ss) {
			System.out.println(c);
		}
	}
}
