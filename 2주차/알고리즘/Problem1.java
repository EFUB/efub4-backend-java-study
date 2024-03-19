// 2490번 윷놀이
/* 문제: 4개 윷짝, 배(0)와 등(1)
 * 입력: 1~3번째 줄에 각각 한 번 던진 4개 윷짝들의 상태를 나타내는 네 개의 정수(0 또는 1)가 주어진다.
 * 출력: 1~3번째 줄에 한 줄에 하나씩 결과를 출력한다 - 도는 A, 개는 B, 걸은 C, 윷은 D, 모는 E
 */

import java.util.Scanner;

public class Main {
    public static void solution() throws Exception {
        Scanner sc = new Scanner(System.in);
        char[] output = new char[3];
        for (int i=0; i<3; i++) {
            int count = 0;
            for (int j=0; j<4; j++) {
                if (sc.nextInt() == 1)
                    count++;
            }
            switch(count) {
                case 3: // 도
                    output[i] = 'A';
                    break;
                case 2: // 개
                    output[i] = 'B';
                    break;
                case 1: // 걸
                    output[i] = 'C';
                    break;
                case 0: // 윷
                    output[i] = 'D';
                    break;
                case 4: // 모
                    output[i] = 'E';
                    break;
            }
        }
        for (int i=0; i<3; i++) {
            System.out.println(output[i]);
        }
    }
    public static void main(String[] args) throws Exception {
        solution();
    }
}