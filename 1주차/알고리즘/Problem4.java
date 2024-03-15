import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String str = scanner.next();
		String [] num = str.split("");
		int [] intArray = new int[num.length];

		for (int i = 0; i < num.length; i++) {
			intArray[i] = Integer.parseInt(num[i]);
		}

		Arrays.sort(intArray);

		for (int i = intArray.length - 1; i >= 0; i--) {
			System.out.print(intArray[i]);
		}
        
        scanner.close();
	}
}
