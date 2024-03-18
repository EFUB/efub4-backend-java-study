import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		String ss = "";
		String [][] parts = new String[5][];
		Scanner s = new Scanner(System.in);
		
		for(int i=0; i<5; i++) {
			ss = s.next();
			parts[i] = ss.split("");
		}
		for (int i=0; i<15; i++) {
			for(int j=0; j<5; j++) {
				if( parts[j].length > i) {
					System.out.print(parts[j][i]);
				}
			}
		}
	}
}