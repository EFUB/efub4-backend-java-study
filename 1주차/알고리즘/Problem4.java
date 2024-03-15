// 1427번 소트인사이드
/* 문제: 배열 정렬. 수가 주어지면, 그 수의 각 자리수를 내림차순으로 정렬해보자.
 * 입력: 첫째 줄에 정렬하려고 하는 수 자연수 N이 주어진다. (N <= 1,000,000,000)
 * 출력: 첫째 줄에 자리수를 내림차순으로 정렬한 수를 출력한다.
 */

import java.util.Scanner;

public class Main {
    public static void solution() throws Exception {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int[] numbers = new int[10];

        for (int i = 0; i < str.length(); i++) {
            int n = str.charAt(i) - '0'; // 0~9
            numbers[n]++;
        }
        for (int i = 9; i >= 0; i--) {
            for (int j = 0; j < numbers[i]; j++) {
                System.out.print(i);
            }
        }
    }

    public static void main(String[] args) throws Exception {
        solution();
    }
}