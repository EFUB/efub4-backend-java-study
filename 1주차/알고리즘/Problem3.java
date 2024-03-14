import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int mid = 0;

        int[] intArray = new int[5];
        for (int i = 0; i < 5; i++) {
            intArray[i] = scanner.nextInt();
            sum += intArray[i];
        }

        Arrays.sort(intArray);
        int avg = sum / 5;
        int median = intArray[2];

        System.out.println(avg + "\n" + median);

        scanner.close();

    }
}
