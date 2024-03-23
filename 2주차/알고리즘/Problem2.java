//2. 세로읽기 
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[][] arr = new char[5][15];

        //입력
        for (int i = 0; i < 5; i++) {
            String str = sc.nextLine();
            for (int j = 0; j < str.length(); j++) {
                arr[i][j] = str.charAt(j);
            }
        }

        //세로로 읽은 문자열 출력
        StringBuilder result = new StringBuilder();
        for (int j = 0; j < 15; j++) {
            for (int i = 0; i < 5; i++) {
                if (arr[i][j] != 0) { // 빈칸이 아닌 경우에만 출력
                    result.append(arr[i][j]);
                }
            }
        }
        System.out.println(result.toString());
    }
}
