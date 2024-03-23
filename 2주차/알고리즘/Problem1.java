import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int j = 0; j < 3; j++) {
            int count0 = 0;

            for (int i = 0; i < 4; i++) {
                int result = scanner.nextInt();
                if (result == 0)
                    count0++;
            }

            switch (count0) {
                case 0:
                    System.out.println("E");
                    break;
                case 1:
                    System.out.println("A");
                    break;
                case 2:
                    System.out.println("B");
                    break;
                case 3:
                    System.out.println("C");
                    break;
                case 4:
                    System.out.println("D");
                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + count0);
            }
        }
    }
}
